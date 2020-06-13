package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {

    @GetMapping("")
    public String sandwich() {
        return "sandwich";
    }

    @PostMapping("/save")
    public String save(@RequestParam(defaultValue = "") String[] condiments,
                       Model model) {
        model.addAttribute("condiments", condiments);
        model.addAttribute("size", condiments.length);
        return "sandwich-result";
    }
}
