package es.pildoras.IoC.DependencyInjection;

public class DirectorEmpleado implements Empleado {

	//Creacion de campo tipo creaci�n informe (interfaz)
	
	private CreacionInformes informeNuevo;
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	// M�todo init. Ejecutar tareas antes de que el bean est� disponible
	
	public void metodoInicial() {
		System.out.println("Ejecutando metodo init");
		System.out.println("");
	}
	
	// M�todo destroy. Ejecutar tareas despues de que el bean haya sido usado
	
	public void metodoFinal() {
		System.out.println("Ejecutando metodo destroy");
	}
	
	private String email;
	
	private String nombreEmpresa;

}
