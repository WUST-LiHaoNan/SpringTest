/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: LoginController
 * Author:   mac
 * Date:     2019-02-14 10:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-14
 * @since 1.0.0
 */
@Controller
@RequestMapping("/Thymeleaf")
public class ThymeleafController {
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("name", "");
        modelMap.addAttribute("query", "");
        modelMap.addAttribute("submit", "");
        return "templates/index";
    }

    @RequestMapping(value = "/{name}", method = {RequestMethod.GET})
    public String getMoview(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("query", "");
        modelMap.addAttribute("submit", "");
        return "templates/index";
    }

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public String query(@RequestParam("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("name", "");
        modelMap.addAttribute("query", name);
        modelMap.addAttribute("submit", "");
        return "templates/index";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    public String submit(@RequestParam("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("name", "");
        modelMap.addAttribute("query", "");
        modelMap.addAttribute("submit", name);
        return "templates/index";
    }

}

