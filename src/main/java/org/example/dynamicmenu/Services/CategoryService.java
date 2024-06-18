package org.example.dynamicmenu.Services;

import lombok.RequiredArgsConstructor;
import org.example.dynamicmenu.Entities.Category;
import org.example.dynamicmenu.Repositories.ICategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final ICategoryRepository categoryRepository;
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
