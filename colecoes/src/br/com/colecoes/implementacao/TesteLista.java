package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * Sobre o List
		 * - o tamanho � din�mico
		 * - os dados podem ser heterogeneos (distintos)
		 * - n�o precisa de vari�vel para controlar as posi��es dos dados
		 * - � poss�vel excluir uma posi��o
		 * - ordena��o � simples
		 */
		List<String> lista = new ArrayList<String>(); // isto � uma lista Generics
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
