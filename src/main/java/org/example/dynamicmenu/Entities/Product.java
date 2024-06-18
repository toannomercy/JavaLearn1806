package org.example.dynamicmenu.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private String ram;
    private String rom;
    private String cpu;
    private String brand;
    private Double price;
    private Boolean enabled;
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;
}
