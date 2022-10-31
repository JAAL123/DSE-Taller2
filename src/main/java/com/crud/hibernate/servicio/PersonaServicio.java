package com.crud.hibernate.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.hibernate.entidades.persona;
import com.crud.hibernate.repositorio.PersonaRepositorio;

@Service
public class PersonaServicio {

	@Autowired 
	private PersonaRepositorio personaRepositorio;	
	
	public List<persona> listAll(){
		return personaRepositorio.findAll();
	}
	
	public void save(persona Persona) {
		personaRepositorio.save(Persona);
	}
	
	public persona get(Long id) {
		return personaRepositorio.findById(id).get();
	}
	
	public void delete(Long id) {
		personaRepositorio.deleteById(id);
	}
}
