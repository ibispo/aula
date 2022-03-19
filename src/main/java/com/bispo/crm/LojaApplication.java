package com.bispo.crm;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bispo.crm.model.Venda;
import com.bispo.crm.service.venda.VendaService;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		ApplicationContext appCont = SpringApplication.run(LojaApplication.class, args);
		
		
		VendaService vendServ= appCont.getBean(VendaService.class);
		
		Venda venda = new Venda();
		venda.setProduto("Camiseta branca");
		venda.setQuantidade(2);
		venda.setPrecoUnitario(new BigDecimal(109.5));		
		
		
		vendServ.registrar(venda, "4024007141518687");
		
		
		
		
		
	}

}
