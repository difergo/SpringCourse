package es.pildoras.Annotations;

public class InformeFinancieroDptoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformefinanciero() {
		return "Informe financiero del departamento de compras año: 2018";
	}

}
