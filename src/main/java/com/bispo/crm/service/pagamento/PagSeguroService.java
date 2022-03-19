package com.bispo.crm.service.pagamento;

import java.math.BigDecimal;

public class PagSeguroService implements GatewayPagamento {

	private String token;
	
	public PagSeguroService(String token) {
		this.token = token;
	}
	
	@Override
	public void efetuarPagamento(String nroCart, BigDecimal vlr) {
		System.out.printf("[PagSeguro] Usando token %s\n", this.token);
		System.out.printf("[PagSeguro] Cobrando %f do cartão %s...\n", vlr, nroCart);
	}
	
}
