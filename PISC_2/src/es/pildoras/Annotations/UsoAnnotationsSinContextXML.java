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
		
		System.out.println();
		
		Empleado empleado=context.getBean("DirectorFinanciero", Empleado.class);//El id debe ser tal cual como se definio el metodo en la clase de configuración
		
		System.out.println("Configurado por código: "+empleado.getTareas());
		System.out.println("Configurado por código: "+empleado.getInofrme());
		
		System.out.println();
		
		System.out.println("Director empleado, cargando data desde archivo de propiedaes");
		DirectorFinanciero df = context.getBean("DirectorFinanciero", DirectorFinanciero.class);
		System.out.println();
		System.out.println(df.getEmail());
		System.out.println(df.getNombreEmpresa());
		
		context.close();
	}

	 
	

}
