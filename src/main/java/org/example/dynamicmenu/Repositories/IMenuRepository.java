package org.example.dynamicmenu.Repositories;

import org.example.dynamicmenu.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMenuRepository extends JpaRepository<Menu, String>{

}
