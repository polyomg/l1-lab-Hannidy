package poly.edu.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import poly.edu.lab2.model.Product;

@Controller
public class ProductController {

    @GetMapping("/product/form")
    public String form(Model model) {
        model.addAttribute("product", new Product());
        return "form1";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute("product") Product product, Model model){
        model.addAttribute("product", product);
        return "form1";
    }
}
