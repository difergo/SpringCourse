package es.pildoras.Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformefinanciero() {
		return "Informe financiero de recuperacion en trim 3";
	}

}
