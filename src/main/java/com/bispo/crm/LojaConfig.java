package com.bispo.crm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bispo.crm.service.pagamento.GatewayPagamento;
import com.bispo.crm.service.pagamento.PagSeguroService;
import com.bispo.crm.service.pagamento.PayPalService;
import com.bispo.crm.service.venda.VendaService;

@Configuration
public class LojaConfig {

	@Primary
	@Bean
	public PagSeguroService pagSeguroService() {
		return new PagSeguroService("857db3dbbce149ab8943430f4d18bdf3");
	}

	@Bean
	public PayPalService payPalService() {
		return new PayPalService("bispo", "123");
	}
	
	
//	@Bean
//	public VendaService vendaService(GatewayPagamento gatewayPag) {
//		return new VendaService(gatewayPag);
//	}
	
}
