package com.example.proyectoCRUD.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyectoCRUD.interfaceService.IArmaService;
import com.example.proyectoCRUD.modelo.Arma;

@Controller
@RequestMapping
public class ArmasController {

	@Autowired
    private IArmaService service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Arma>armas= service.listar();
        model.addAttribute("armas", armas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("arma", new Arma());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Arma arma){
        service.save(arma);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Arma> arma = service.listarId(id);
        model.addAttribute("arma", arma);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
