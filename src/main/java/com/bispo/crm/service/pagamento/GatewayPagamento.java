package com.bispo.crm.service.pagamento;

import java.math.BigDecimal;

public interface GatewayPagamento {

	void efetuarPagamento(String nroCart, BigDecimal vlr);

}