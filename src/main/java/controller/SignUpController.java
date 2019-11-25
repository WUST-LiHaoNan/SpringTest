/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: SignUpController
 * Author:   mac
 * Date:     2019-02-13 21:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
@Controller
@RequestMapping("/customer")
public class SignUpController {
    @RequestMapping
    public String index(){
        return "customer/index";
    }

    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public String addCustomer(@Valid Customer customer, BindingResult result, RedirectAttributes model) {
        if (result.hasErrors()) {
            return "SignUpForm";
        } else {
            model.addAttribute("name",customer.getName());
            model.addFlashAttribute(customer);
            return "redirect:/customer/show/{name}";
        }
    }

    @RequestMapping(value = "/show/{name}",method = RequestMethod.GET)
    public String show(@PathVariable String name){
        return "Done";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String displayCustomerForm(Model model) {
        model.addAttribute("customer", new Customer("请输入用户名",18));
        return "SignUpForm";
    }
}

