/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.showcase.Controller;


import com.showcase.Dto.Product;
import com.showcase.Model.ProductModel;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Thu Uyên
 */
@Controller
@SessionAttributes("username")
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        //---- lay dw lieu tu mode
        //---- truyen cho view
        try {
            ProductModel prodModel = new ProductModel();
            List<Product> products = prodModel.getAll();
            model.addAttribute("products", products);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "index";
    }

//    @RequestMapping("/new-product")
//    public String addProducts(HttpServletRequest req, Model model) {
//        HttpSession session = req.getSession();
//        String username = (String) session.getAttribute("username");
//        if (username != null) {
//            return "newprod";
//        }
//        else {
//            LoginForm form = new LoginForm();
//            model.addAttribute("login", form);
//            return "login";
//        }
//    }
//
//    @RequestMapping("/login")
//    public String login(Model model) {
//        LoginForm form = new LoginForm();
//        model.addAttribute("login", form);
//        return "login";
//    }
//
//    @RequestMapping("/auth")
//    public String auth(@ModelAttribute("login") LoginForm form, Model model) {
//        try {
//            MemberModel memberModel = new MemberModel();
//            Member member = memberModel.login(form.getEmail(), form.getPassword());
//            if (member != null) {
//                model.addAttribute("username", member.getName());
//                return "index";        
//            } else {
//                model.addAttribute("error", "Login fail!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "login";
//    }
}

