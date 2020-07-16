package es.pildoras.Annotations;

public class DirectorFinanciero implements Empleado{

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión y derección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInofrme() {
		return informeFinanciero.getInformefinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;
	
	

}
