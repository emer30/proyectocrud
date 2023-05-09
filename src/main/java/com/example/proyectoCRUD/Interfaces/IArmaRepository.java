package com.example.proyectoCRUD.Interfaces;

import com.example.proyectoCRUD.modelo.Arma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArmaRepository extends CrudRepository<Arma , Integer >{

}
