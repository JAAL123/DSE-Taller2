package com.crud.hibernate.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.hibernate.entidades.persona;


public interface PersonaRepositorio extends JpaRepository<persona,Long> {
	
}
