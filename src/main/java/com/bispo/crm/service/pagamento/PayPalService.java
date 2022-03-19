package com.bispo.crm.service.pagamento;

import java.math.BigDecimal;

public class PayPalService implements GatewayPagamento {

	private String usuario;
	private String senha;
	
	public PayPalService(String usu, String sen) {
		this.usuario = usu;
		this.senha = sen;
	}
	
	@Override
	public void efetuarPagamento(String nroCart, BigDecimal vlr) {
		System.out.printf("[PayPal] Usando usuário %s\n", this.usuario);
		System.out.printf("[PayPal] Cobrando %f do cartão %s...\n", vlr, nroCart);
	}
	
}
