package com.bispo.crm.service.venda;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bispo.crm.model.Venda;
import com.bispo.crm.service.pagamento.GatewayPagamento;

@Component
public class VendaService {
	
	@Autowired
	private GatewayPagamento gatewayPagto;
	
	
	// Injecao no construtor
//	public VendaService(GatewayPagamento gatewayPag) {
//		this.gatewayPagto = gatewayPag;
//	}

	// Injecao por Setter (mudou o nome do metodo para fuga da convenção JavaBean) - Boderplate
//	@Autowired
//	public void usarGatewayPagamento(GatewayPagamento gatPag) {
//		this.gatewayPagto = gatPag;
//	}
	

	public void registrar(Venda venda, String nroCart) {
		
		BigDecimal vlrTot = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));
		
		System.out.printf("[Venda] 2.0 Registrando venda de %s no valor total de %f...\n",
				venda.getProduto(), vlrTot);
		
		// FIXME Jeito errado - Veja o que fere...
		// Open Closed Principle ---- Princípio SOLID  (aberto para extensão e fechado para modificação)
		// Dependency Inversion Principle  DiP ---- Alto nivel não podem depender de baixo nivel
		// Fazer testes unitarios

		// Inversion of Control IoC
		// Dependency Injection 
		// PagSeguroService pagSeguroService = new PagSeguroService("857db3dbbce149ab8943430f4d18bdf3");
		gatewayPagto.efetuarPagamento(nroCart, vlrTot);
		
		
	}
	
	
}
