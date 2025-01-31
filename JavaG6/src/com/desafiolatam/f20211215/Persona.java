package com.desafiolatam.f20211215;

import java.util.Date;

public class Persona {
//atributos
	private String nombre;
	private int edad;
	private Date fechaNacimiento;
	private String email;

//metodos
	public static void prenderHorno () {
		
	}
	public static void comer() {
		
	}
	public static void caminar() {
	
	}
//constructores
	//construr vacio
	public Persona() {
		super();
	}
	//contructor con parametros
    public Persona(String nombre, int edad, Date fechaNacimiento, String email) {
    	super();
    	this.nombre = nombre;
    	this.edad = edad;
    	this.fechaNacimiento = fechaNacimiento;
    	this.email = email;
	}

//setter&getters   
    
   	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() { //Este retorna un String, pero como m�todo.
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", email="
				+ email + "]";
	}
    
	

}


