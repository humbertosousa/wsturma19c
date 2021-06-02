package br.com.caicaielevator.implementacao;

import br.com.caicaielevator.modelo.Elevador;

public class TesteElevador {

	
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.preencherNome("TORRE B");
		elevador.inicializar(20, 0, 10);
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.entrar(5);
		System.out.println(elevador.retornarResumo());
		elevador.descer();
		elevador.sair();
		System.out.println(elevador.retornarResumo());
		elevador.sair(15);
		System.out.println(elevador.retornarResumo());
		
		
	}
	
}
