/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: HelloController
 * Author:   mac
 * Date:     2019/9/28 8:58 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019/9/28
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/hello",method = {RequestMethod.GET})
public class HelloController {
    @RequestMapping(value = "/",method = {RequestMethod.GET})
    public String index(Model model)
    {
        model.addAttribute("id","0");
        return "id";
    }
    @RequestMapping(value = "/{id}",method = {RequestMethod.GET})
    public String getId(@PathVariable String id, Model model)
    {
        model.addAttribute("id",id);
        return "id";
    }
    @RequestMapping(value = "/requset",method = {RequestMethod.GET})
    public String Request(@RequestParam String id, Model model)
    {
        model.addAttribute("id",id);
        return "id";
    }
}

