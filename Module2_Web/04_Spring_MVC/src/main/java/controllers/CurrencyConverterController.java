package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {

    @GetMapping("/calculate")
    public String show() {
        return "currency-converter";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("rate") double rate, @RequestParam("usd") double usd, Model model) {
        double vnd = usd * rate;
        model.addAttribute("vnd", vnd);
        return "currency-converter-result";
    }
}
