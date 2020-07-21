package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;


@Controller
public class HolaAlumnosControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosForm";
	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormulario2")
	public String procesarFormulario2(ServletWebRequest request, Model model) {
		
		String nombre = request.getParameter("nombreAlumno");
		
		nombre=nombre.toUpperCase();
		
		model.addAttribute("nombreMayus",nombre);
		
		return "HolaAlumnosSpring";
	}

}
