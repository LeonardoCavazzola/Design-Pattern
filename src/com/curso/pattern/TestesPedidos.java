package com.curso.pattern;

import java.math.BigDecimal;
import java.util.Arrays;

import com.curso.pattern.pedido.GeraPedido;
import com.curso.pattern.pedido.GeraPedidoHandler;
import com.curso.pattern.pedido.acoes.CriarPedidoNoBanco;
import com.curso.pattern.pedido.acoes.EnviarPedidoPorEmail;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executar(gerador);
	}

}
