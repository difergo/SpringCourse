package es.pildoras.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotationsSinContextXML {
	
	public static void main(String[] args) {
		//Implementación que no requiere el archivo XML de configuración.
		//Se ha creado la clase 'EmpleadosConfig' que es equivalente a'applicationContext.xml'
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleado Antonio=context.getBean("ComercialExperimentado", Empleado.class);
		
		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInofrme());
		
		context.close();
	}

	 
	

}
