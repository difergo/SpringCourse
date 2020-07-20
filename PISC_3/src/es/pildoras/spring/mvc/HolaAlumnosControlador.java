package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
