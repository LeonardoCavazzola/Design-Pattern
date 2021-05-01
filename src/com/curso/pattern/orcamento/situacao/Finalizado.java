package com.curso.pattern.orcamento.situacao;

import java.math.BigDecimal;

import com.curso.pattern.DomainException;
import com.curso.pattern.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
