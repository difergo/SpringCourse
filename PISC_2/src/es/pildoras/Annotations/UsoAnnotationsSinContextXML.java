package es.pildoras.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotationsSinContextXML {
	
	public static void main(String[] args) {
		//Implementación que no requiere el archivo XML de configuración.
		//Se ha creado la clase 'EmpleadosConfig' que es equivalente a'applicationContext.xml'
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
	/*	Empleado Antonio=context.getBean("ComercialExperimentado", Empleado.class);
		
		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInofrme());*/
		
		System.out.println();
		
		Empleado empleado=context.getBean("DirectorFinanciero", Empleado.class);//El id debe ser tal cual como se definio el metodo en la clase de configuración
		
		System.out.println("Configurado por código: "+empleado.getTareas());
		System.out.println("Configurado por código: "+empleado.getInofrme());
		
		context.close();
	}

	 
	

}
