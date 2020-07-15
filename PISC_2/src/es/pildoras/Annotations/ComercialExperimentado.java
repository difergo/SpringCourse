package es.pildoras.Annotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleado {

	@Override
	public String getTareas() {
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInofrme() {
		return "Informe de ventas del comercial.";
	}

}
