package com.bispo.crm.loja;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.bispo.crm.model.Venda;
import com.bispo.crm.service.GatewayPagamentoServiceMock;
import com.bispo.crm.service.venda.VendaService;

public class VendaServiceTest {

	@Test
	public void registrarTest() {
		
		Venda venda = new Venda();
		venda.setProduto("Camiseta branca");
		venda.setQuantidade(2);
		venda.setPrecoUnitario(new BigDecimal(109.5));
		
		// VendaService vendaService = new VendaService(new PagSeguroService("857db3dbbce149ab8943430f4d18bdf3"));
		// VendaService vendaService = new VendaService(new PayPalService("bispo", "123"));
	//	VendaService vendaService = new VendaService(new GatewayPagamentoServiceMock());
		// vendaService.registrar(venda, "4024007141518687");
		
		
	}
	
	
}
