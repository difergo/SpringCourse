package es.pildoras.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.Annotations")
public class EmpleadosConfig {
	
	//     Configuraci�n de beans sin xml
	
	//Definici�n de bean para informe financiero del dpto de compras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptoCompras() { //Ser� el id del bean inyectado
		return new InformeFinancieroDptoCompras();
	}
	
	
	//Definir el bean para director financiero e inyectar dependencias
	
	@Bean
	public Empleado DirectorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDptoCompras());
	}

}
