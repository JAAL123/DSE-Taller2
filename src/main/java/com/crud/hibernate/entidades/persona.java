package com.crud.hibernate.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 60)
	private String Nombre;

	@Column(nullable = false, length = 60)
	private String Apellido;

	@Column(nullable = false, length = 10)
	private String Telefono;

	@Column(nullable = false)
	private int Edad;

	@Column(nullable = false, length = 200)
	private String Direccion;

	public persona(Long id, String nombre, String apellido, String telefono, int edad, String direccion) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		Edad = edad;
		Direccion = direccion;
	}

	public persona() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

}
