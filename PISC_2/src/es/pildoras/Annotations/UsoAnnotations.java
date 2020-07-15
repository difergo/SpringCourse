package es.pildoras.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado Antonio=context.getBean("ComercialExperimentado", Empleado.class);
		
		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInofrme());
		
	}

}
