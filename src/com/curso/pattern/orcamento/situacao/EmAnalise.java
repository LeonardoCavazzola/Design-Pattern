package com.curso.pattern.orcamento.situacao;

import java.math.BigDecimal;

import com.curso.pattern.DomainException;
import com.curso.pattern.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Reprovado());
	}

}