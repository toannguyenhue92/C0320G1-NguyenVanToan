package controllers;

import models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import services.CustomerService;
import services.impl.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("")
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", customerService.getAll());
        return "customer/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute Customer customer,
                       RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute(customerService.findById(id));
        return "customer/edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@ModelAttribute Customer customer,
                       @PathVariable int id,
                       RedirectAttributes redirectAttributes) {
        customerService.update(id, customer);
        redirectAttributes.addAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/view";
    }

    @GetMapping("/{id}/delete")
    public String confirmDelete(@PathVariable int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/delete";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }
}
