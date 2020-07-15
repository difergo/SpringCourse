package es.pildoras.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado Antonio=context.getBean("ComercialExperimentado", Empleado.class);
		
		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInofrme());
		
		Empleado Lucia=context.getBean("ComercialExperimentado", Empleado.class);
		
		System.out.println("");
		System.out.println("Los objetos apuntan a la misma dirección de memoria porque spring está en singleton por defecto");
		System.out.println("Antonio: "+Antonio);
		System.out.println("Lucía:   "+Lucia);
		System.out.println();
		
		System.out.println("Comercial novato");
		
		Empleado Juan=context.getBean("ComercialNoob", Empleado.class);
		Empleado Ana=context.getBean("ComercialNoob", Empleado.class);
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInofrme());
		
		System.out.println("");
		System.out.println("Objetos con direccion de memoria diferente porque en la clase se uso la etiqueta de scope=prototype");
		System.out.println("Juan: "+Juan);
		System.out.println("Ana:  "+Ana);
		System.out.println();
		
		
		
	}

}
