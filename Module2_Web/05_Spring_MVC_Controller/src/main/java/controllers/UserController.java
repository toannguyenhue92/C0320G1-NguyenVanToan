package controllers;

import dao.UserDAO;
import models.Login;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home", "login", new Login());
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User user = UserDAO.checkLogin(login);
        if (user == null) {
            return new ModelAndView("login-error");
        }
        return new ModelAndView("user", "user", user);
    }

    @GetMapping("/users")
    public String allUsers(ModelMap model) {
        model.put("name", "Toan");
        model.put("age", 28);
        return "all-user";
    }
}
