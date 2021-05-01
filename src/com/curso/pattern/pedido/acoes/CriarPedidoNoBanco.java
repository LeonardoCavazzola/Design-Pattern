package com.curso.pattern.pedido.acoes;

import com.curso.pattern.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados...");
	}

}
