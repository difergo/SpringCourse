package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleado {

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}
	
	private CreacionInformes informeNuevo;

}
