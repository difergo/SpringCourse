package es.pildoras.IoC.DependencyInjection;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		return "Esta es la presentación del informe";
	}

}
