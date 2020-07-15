package es.pildoras.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialNoob")
@Scope("prototype")
public class ComercialNovato implements Empleado {
	
	@Override
	public String getTareas() {
		return "Vender, aprender y vender mas!";
	}

	@Override
	public String getInofrme() {
		return nuevoInforme.getInformefinanciero();
	}

	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero nuevoInforme;

}
