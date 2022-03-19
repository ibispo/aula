package com.bispo.crm.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Venda {

	private String produto;
	private BigDecimal precoUnitario;
	private Integer quantidade;

}
