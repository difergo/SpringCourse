package es.pildoras.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleado {
	
	// Se  ejecuta despues de creacion del bean
	
	@PostConstruct
	public void postBean() {
		System.out.println("___________________________________");
		System.out.println("Ejecutado tras creación de bean");
		System.out.println("-----------------------------------");
	}
	
	// Se ejecuta despues de apagado el contenedor de spring
	
	@PreDestroy
	public void preDestry() {
		System.out.println("___________________________________");
		System.out.println("Ejecutando antes de la destrucción del contenedor de spring");
		System.out.println("-----------------------------------");
	}
	
	// Tener en cuenta que estos metodos no funcionan si la clase utiliza el scope=prototype

	// Autowired con el contructor
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	// Autowired con setter
	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	@Override
	public String getTareas() {
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInofrme() {
		return nuevoInforme.getInformefinanciero();
	}

	//Autowired a nivel del atributo
	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInforme;

}
