package com.example.proyectoCRUD.interfaceService;
import com.example.proyectoCRUD.modelo.Arma;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.proyectoCRUD"})
public interface IArmaService {

    public List<Arma>listar();
    public Optional<Arma> listarId(int id);
    public int save (Arma a);
    public void delete(int id);


}
