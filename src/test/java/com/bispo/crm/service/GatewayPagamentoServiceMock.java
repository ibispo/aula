package com.bispo.crm.service;

import java.math.BigDecimal;

import com.bispo.crm.service.pagamento.GatewayPagamento;

public class GatewayPagamentoServiceMock implements GatewayPagamento {

	@Override
	public void efetuarPagamento(String nroCart, BigDecimal vlr) {
		System.out.println("[Mock] Nada faz....");
	}
}
