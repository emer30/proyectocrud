package com.example.proyectoCRUD.modelo;

import jakarta.persistence.*;


@Entity
@Table(name = "arma")
public class Arma {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
	private String nombre;
	private String apellido;
    private String celular;
    private String email;
    private String inquietud;


    public Arma(){

    }
    public Arma(int id, String nombre, String apellido, String celular, String email, String inquietud){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.celular=celular;
        this.email=email;
        this.inquietud=inquietud;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getCelular(){ return celular;}
    public void setCelular(String celular){
        this.celular=celular;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
	public String getInquietud() {
		return inquietud;
	}
	public void setInquietud(String inquietud) {
		this.inquietud = inquietud;
	}  
}

