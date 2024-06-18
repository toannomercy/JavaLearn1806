package org.example.dynamicmenu.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.dynamicmenu.Entities.Product;
import org.example.dynamicmenu.Services.CategoryService;
import org.example.dynamicmenu.Services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final CategoryService categoryService;
    @GetMapping("/view")
    public String view(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return ("Product/view");
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.getAllCategories());
        return ("Product/create");
    }
    @PostMapping("/create")
    public String create(Product product){
        productService.createProduct(product);
        return "redirect:/products/view";
    }
}
