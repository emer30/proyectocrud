package com.example.proyectoCRUD.service;
import com.example.proyectoCRUD.modelo.Arma;
import com.example.proyectoCRUD.interfaceService.IArmaService;
import com.example.proyectoCRUD.Interfaces.IArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArmaService implements IArmaService {

    @Autowired
     private IArmaRepository data;

    @Override
    public List<Arma> listar() {
        return (List<Arma>) data.findAll();
    }

    @Override
    public Optional<Arma> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Arma p) {
        int res = 0;
        Arma arma = data.save(p);
        if(!arma.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
            data.deleteById(id);
    }   
}
