package es.pildoras.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Creacion de objetos de tipo empleado
		Empleado empleado1=new DirectorEmpleado();
	
		//Uso de objetos creados
		System.out.println(empleado1.getTareas());
	}

}
