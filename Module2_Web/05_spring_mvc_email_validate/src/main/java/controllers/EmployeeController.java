package controllers;

import models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "employee/", method = {RequestMethod.GET, RequestMethod.POST})
public class EmployeeController {

    @GetMapping("show-form")
    public String showForm(ModelMap modelMap) {
        modelMap.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @PostMapping("add")
    public String submit(@ModelAttribute("employee") Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "employee/info";
    }
}
