package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleado {

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

}
