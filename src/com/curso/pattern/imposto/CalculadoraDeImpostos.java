package com.curso.pattern.imposto;

import java.math.BigDecimal;

import com.curso.pattern.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.realizarCalculoEspecifico(orcamento);
	}

}
