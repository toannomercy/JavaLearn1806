package org.example.dynamicmenu.Repositories;

import org.example.dynamicmenu.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, String>{
}
