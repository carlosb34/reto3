/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interfase.CategoryInterface;
import com.example.demo.Modelo.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 *
 * @author carlo
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryInterface extensionesCrud;
    
    public List<Category> getAll() {
        return (List<Category>) extensionesCrud.findAll();
    }
    
    public Optional <Category> getCategory(int id){
        return extensionesCrud.findById(id);
    }
    
    public Category save(Category category){
        return extensionesCrud.save(category);
    }
    
    
}
