package com.example.proyectoCRUD.service;
import com.example.proyectoCRUD.modelo.Arma;
import com.example.proyectoCRUD.interfaceService.IArmaService;
import com.example.proyectoCRUD.Interfaces.IArma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArmaService implements IArmaService {

    @Autowired
     private IArma datos;


    @Override
    public List<Arma> listar() {
        return (List<Arma>) datos.findAll();
    }
    @Override
    public Optional<Arma> listarId(int id){
        return datos.findById(id);
    }


    @Override
    public int save(Arma a) {
        int f = 0;
        Arma arma = datos.save(a);
        if(!arma.equals(null)){
            f = 1;
        }
        return f;
    }

    @Override
    public void delete(int id) {
        datos.deleteById(id);

    }
}
