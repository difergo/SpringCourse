package es.pildoras.Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformefinanciero() {
		return "Presentacion de informe de cierre de año";
	}

}
