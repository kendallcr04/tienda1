/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */

package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Acer
 */
@Controller
@requestMapping("/categoria")
public class categoriaController {

     @Autowired
      private CategoriaService categoriaService
    
    
    @RequestMapping("/listado")
    public String page(Model model) {
        var categoria = categoria.service.getCategorias(false)
        model.addAttribute("categorias", categorias);
         model.addAttribute("totalcategorias", categorias.size);
        return "/categoria/listado";
    }

}
