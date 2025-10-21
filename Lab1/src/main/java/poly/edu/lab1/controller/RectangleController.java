package poly.edu.lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RectangleController {

    @Autowired
    private HttpServletRequest request;

    // Hiển thị form nhập
    @RequestMapping("/rectangle/form")
    public String form() {
        return "rectangle";
    }

    // Xử lý tính toán
    @RequestMapping("/rectangle/calc")
    public String calc(Model model) {
        double w = Double.parseDouble(request.getParameter("width"));
        double h = Double.parseDouble(request.getParameter("height"));

        double area = w * h;
        double perimeter = 2 * (w + h);

        model.addAttribute("area", area);
        model.addAttribute("perimeter", perimeter);

        return "rectangle";
    }
}
