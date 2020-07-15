package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.pildoras.IoC.DependencyInjection.Empleado;
import es.pildoras.IoC.DependencyInjection.SecretarioEmpleado;

public class UsoDemoSingletonPrototype {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Peticion de beans al contenedor
		
		Empleado Maria = context.getBean("mySecretary", Empleado.class);
		
		Empleado Pedro = context.getBean("mySecretary", Empleado.class);
		
		System.out.println("Evidecia de que los objetos se manejan bajo patron singleton:");
		System.out.println(Maria);
		System.out.println(Pedro);
		
		System.out.println();
		
		SecretarioEmpleado Juan = context.getBean("mySecretarySingleton", SecretarioEmpleado.class);
		SecretarioEmpleado Paco = context.getBean("mySecretarySingleton", SecretarioEmpleado.class);
		
		System.out.println("Evidecia de que los objetos se manejan bajo patron singleton (así se definio en el context):");
		System.out.println(Juan);
		System.out.println(Paco);
		
		System.out.println();
		
		SecretarioEmpleado Pepe = context.getBean("mySecretaryPrototype", SecretarioEmpleado.class);
		SecretarioEmpleado Ana = context.getBean("mySecretaryPrototype", SecretarioEmpleado.class);
		
		System.out.println("Evidecia de que los objetos se manejan bajo patron prorotype porque en el context se definio así:");
		System.out.println(Pepe);
		System.out.println(Ana);
		
	}
}
