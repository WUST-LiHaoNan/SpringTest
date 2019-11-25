/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: LoginController
 * Author:   mac
 * Date:     2019-02-16 21:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import entity.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-16
 * @since 1.0.0
 */
@Controller
@RequestMapping("/Login")
public class LoginController {
    @RequestMapping("/index")
    public String showForm(Model model) {
        model.addAttribute(new PersonForm());
        return "templates/form";
    }

    @RequestMapping("/result")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "templates/form";
        }
        return "templates/results";
    }

}

