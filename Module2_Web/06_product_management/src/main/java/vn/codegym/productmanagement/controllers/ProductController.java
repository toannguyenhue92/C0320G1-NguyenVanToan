package vn.codegym.productmanagement.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.productmanagement.models.Product;
import vn.codegym.productmanagement.services.ProductService;
import vn.codegym.productmanagement.services.impl.ProductServiceImpl;

@Controller
public class ProductController {

    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "home";
    }

    @GetMapping("/product/add")
    public String getProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "create-product";
    }

    @PostMapping("/product/add")
    public String addNewProduct(@ModelAttribute Product product,
            RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "Thêm mới sản phẩm thành công!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/update")
    public String showEditForm(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "edit-product";
    }

    @PostMapping("/product/{id}/update")
    public String update(@PathVariable int id, @ModelAttribute Product product,
            RedirectAttributes redirectAttributes) {
        productService.update(id, product);
        redirectAttributes.addFlashAttribute("message", "Cập nhật thông tin sản phẩm thành công!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String showDeleteForm(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "delete-product";
    }

    @PostMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, @ModelAttribute Product product,
            RedirectAttributes redirectAttributes) {
        productService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Xóa sản phẩm thành công!");
        return "redirect:/";
    }
}
