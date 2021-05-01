package com.curso.pattern;

import java.math.BigDecimal;

import com.curso.pattern.http.ApacheHttpAdapter;
import com.curso.pattern.orcamento.ItemOrcamento;
import com.curso.pattern.orcamento.Orcamento;
import com.curso.pattern.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
