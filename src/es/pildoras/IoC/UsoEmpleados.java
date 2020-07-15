package es.pildoras.IoC;

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
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Informe del jefe: "+ Pedro.getInforme());
		
		context.close();
	}

}
