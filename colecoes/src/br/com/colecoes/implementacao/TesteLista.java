package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * Sobre o List
		 * - o tamanho é dinâmico
		 * - os dados podem ser heterogeneos (distintos)
		 * - não precisa de variável para controlar as posições dos dados
		 * - é possível excluir uma posição
		 * - ordenação é simples
		 */
		List<String> lista = new ArrayList<String>(); // isto é uma lista Generics
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("INFRA");
		System.out.println(lista);
		System.out.println("Primeiro elemento: " + lista.get(0));
		lista.remove(0);
		System.out.println("Depois de remover: " + lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		
		for (int posicao=0; posicao<lista.size();posicao++) {
			System.out.println("Cargo: " + lista.get(posicao));
		}
		
		

	}

}
