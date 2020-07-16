package es.pildoras.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.Annotations")
public class EmpleadosConfig {
	
	//     Configuración de beans sin xml
	
	//Definición de bean para informe financiero del dpto de compras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptoCompras() { //Será el id del bean inyectado
		return new InformeFinancieroDptoCompras();
	}
	
	
	//Definir el bean para director financiero e inyectar dependencias
	
	@Bean
	public Empleado DirectorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDptoCompras());
	}

}
