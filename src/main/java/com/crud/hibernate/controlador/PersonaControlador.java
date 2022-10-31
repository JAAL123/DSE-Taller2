package com.crud.hibernate.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crud.hibernate.entidades.persona;
import com.crud.hibernate.servicio.PersonaServicio;

import java.util.List;

@Controller
public class PersonaControlador {
	
	
	@Autowired
	private PersonaServicio personaServicio;
	
	@RequestMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		List<persona> listaPersona = personaServicio.listAll(); 
		modelo.addAttribute("listaPersonas", listaPersona);
		
		return "index";
	}
	
	@RequestMapping("/nuevo")
		public String mostrarFormularioRegistroPersona(Model modelo) {
		 	persona persona = new persona();
		 	modelo.addAttribute("persona", persona);
		 	return "nueva_persona";
		}	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardarPersona(@ModelAttribute("persona") persona persona) {
	 	personaServicio.save(persona);
	 	return "redirect:/";
	}	
	@RequestMapping("/editar/{id}")
	public ModelAndView mostrarFormularioEditarPersona(@PathVariable(name="id") Long id  ) {
	 	ModelAndView modelo = new ModelAndView("editar_persona");
	 	
	 	persona persona = personaServicio.get(id);
	 	modelo.addObject("persona", persona);
	 	return modelo; 
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminarPersona(@PathVariable(name="id") Long id) {
		personaServicio.delete(id);
		return "redirect:/";
	}
}
