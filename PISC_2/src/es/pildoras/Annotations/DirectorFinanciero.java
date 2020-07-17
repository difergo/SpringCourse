package es.pildoras.Annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleado{

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
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
	
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	

}
