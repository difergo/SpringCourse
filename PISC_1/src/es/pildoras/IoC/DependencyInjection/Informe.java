package es.pildoras.IoC.DependencyInjection;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		return "Esta es la presentaci�n del informe";
	}

}
