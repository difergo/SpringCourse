package es.pildoras.IoC;

public class JefeEmpleado implements Empleado{

	public JefeEmpleado(CreacionInformes informeNuevo) {
		super();
		this.informeNuevo=informeNuevo;
	}
	
	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		return "Gestiona cuestiones relativas a empleados de su sector";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con arreglos: "+informeNuevo.getInforme();
	}
}
