package org.example.dynamicmenu.Controllers;

import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;
import org.example.dynamicmenu.Services.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/menus")
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/view")
    public String view(Model model){
        model.addAttribute("menus", menuService.getAllMenus());
        return ("Menu/view");
    }
}
