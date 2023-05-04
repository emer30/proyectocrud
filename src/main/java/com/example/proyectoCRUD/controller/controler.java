package com.example.proyectoCRUD.controller;
import com.example.proyectoCRUD.modelo.Arma;
import com.example.proyectoCRUD.interfaceService.IArmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.apache.coyote.http11.Constants.a;

@Controller
@RequestMapping
public class controler {

    @Autowired
    private IArmaService service;


    @GetMapping ("/listar")
    public String listar (Model model) {
        List<Arma> arma = service.listar();
        model.addAttribute("arma", arma);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("armas" , new Arma());
        return "form" ;
    }
    @PostMapping("/save")
    public String save(@Validated Arma a){
        service.save(a);
       return  "redirect:/listar";

    }
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable int id, Model model){
        Optional<Arma> arma = service.listarId(id);
        model.addAttribute("Armas", arma);
        return "index";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";

    }
}
