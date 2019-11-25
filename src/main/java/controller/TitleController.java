/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: TitleController
 * Author:   mac
 * Date:     2019-02-15 17:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-15
 * @since 1.0.0
 */
@Controller
@RequestMapping("/Title")
public class TitleController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "myView";
    }
}

