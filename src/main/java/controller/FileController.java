/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: FileController
 * Author:   mac
 * Date:     2019-02-17 20:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-17
 * @since 1.0.0
 */
@Controller
@RequestMapping("/File")
public class FileController {

    @RequestMapping(value="/upload",method= RequestMethod.POST)
    public String fildUpload(Users users , @RequestParam(value="file",required=false) MultipartFile file,
                             HttpServletRequest request, Model model)throws Exception{
        //基本表单
        System.out.println(users.toString());

        //获取项目部署路径
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+
                request.getServerPort()+request.getContextPath()+"/";

        //获得物理路径webapp所在路径
        String pathRoot = request.getSession().getServletContext().getRealPath("");
        String path="";
        if(!file.isEmpty()){
            //生成uuid作为文件名称
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            //获得文件类型（可以判断如果不是图片，禁止上传）
            String contentType=file.getContentType();
            //获得文件后缀名称
            String imageName=contentType.substring(contentType.indexOf("/")+1);
            //判断要保存的文件夹是否存在
            File saveFile = new File(pathRoot+"statics/images");
            if(!saveFile.exists()&&!saveFile.isDirectory()){
                System.out.println("文件夹不存在！");
                if(saveFile.mkdir()){
                    System.out.println("创建成功！");
                }else {
                    System.out.println("创建失败！");
                }
            }else {
                System.out.println("文件夹存在");
            }
            path="statics/images/"+uuid+"."+imageName;
            System.out.println("文件保存路径:"+pathRoot+path);
            file.transferTo(new File(pathRoot+path));
        }
        model.addAttribute("imagesPath",path);
        model.addAttribute("basePath",basePath);
        model.addAttribute("user",users);
        return "LoginShow";
    }
    //因为我的JSP在WEB-INF目录下面，浏览器无法直接访问
    @RequestMapping(value="/index")
    public String index(HttpServletRequest request,Model model){
        //获取项目部署路径
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+
                request.getServerPort()+request.getContextPath()+"/";
        model.addAttribute("basePath",basePath);
        return "LoginForm";
    }

}

