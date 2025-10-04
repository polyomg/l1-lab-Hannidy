package poly.edu.lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @Autowired
    private HttpServletRequest request;

    // Hiển thị form login
    @RequestMapping("/login/form")
    public String form() {
        return "form";
    }

    // Xử lý login
    @RequestMapping("/login/check")
    public String login(Model model) {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("poly".equals(user) && "123".equals(pass)) {
            model.addAttribute("message", "Đăng nhập thành công!");
        } else {
            model.addAttribute("message", "Sai username hoặc password!");
        }
        return "form";
    }
}
