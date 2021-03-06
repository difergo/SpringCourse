package es.pildoras.IoC.DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Creacion de objetos de tipo empleado
		//Empleado empleado1=new DirectorEmpleado();
		//Uso de objetos creados
		//System.out.println(empleado1.getTareas());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado Juan = context.getBean("myEmployee", Empleado.class);
		Empleado Pedro = context.getBean("myEmployee2", Empleado.class);
		SecretarioEmpleado secreNacho = context.getBean("myEmployee3", SecretarioEmpleado.class);
		
		
		System.out.println(Juan.getTareas());
		System.out.println("Informe del director:" + Juan.getInforme());
		System.out.println("Informe del jefe: "+ Pedro.getInforme());
		System.out.println("Tareas del secre: "+secreNacho.getTareas());
		System.out.println("Informe del secre: "+secreNacho.getInforme());
		
		System.out.println("Email secretario: " + secreNacho.getEmail());
		System.out.println("Nombre empresa: " + secreNacho.getNombreEmpresa());
		
		System.out.println("");
		
		DirectorEmpleado dir = context.getBean("mySecondDirector", DirectorEmpleado.class);
		System.out.println("El correo del segundo director es: " + dir.getEmail());
		
		context.close();
	}

}
