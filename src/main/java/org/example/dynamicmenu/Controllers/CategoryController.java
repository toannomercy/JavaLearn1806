package org.example.dynamicmenu.Controllers;

import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;
import org.example.dynamicmenu.Services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/view")
    public String view(Model model){
        model.addAttribute("categories", categoryService.getAllCategories());
        return ("Category/view");
    }
}
