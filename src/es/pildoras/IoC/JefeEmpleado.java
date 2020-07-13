package es.pildoras.IoC;

public class JefeEmpleado implements Empleado{

	@Override
	public String getTareas() {
		return "Gestiona cuestiones relativas a empleados de su sector";
	}
}
