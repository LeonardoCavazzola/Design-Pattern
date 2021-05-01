package com.curso.pattern;

import java.math.BigDecimal;

import com.curso.pattern.imposto.ICMS;
import com.curso.pattern.imposto.ISS;
import com.curso.pattern.imposto.Imposto;
import com.curso.pattern.orcamento.ItemOrcamento;
import com.curso.pattern.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
	}

}
