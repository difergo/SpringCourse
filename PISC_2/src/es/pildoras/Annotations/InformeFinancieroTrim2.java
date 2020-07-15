package es.pildoras.Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformefinanciero() {
		return "Informe financiero catastrofico del trimestre 2";
	}

}
