package es.pildoras.Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformefinanciero() {
		return "presentacion del informe funanciero del trimestre 1";
	}

}
