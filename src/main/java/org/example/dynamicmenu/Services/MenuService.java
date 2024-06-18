package org.example.dynamicmenu.Services;

import lombok.RequiredArgsConstructor;
import org.example.dynamicmenu.Entities.Menu;
import org.example.dynamicmenu.Repositories.IMenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final IMenuRepository menuRepository;
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
}
