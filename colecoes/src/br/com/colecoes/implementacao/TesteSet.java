package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ESTAGI�RIO");
		lista.add("ANALISTA");
		lista.add("DEV");
		lista.add("DBA");
		System.out.println(lista);
		//System.out.println(lista.get(1));
		
		//foreach
		// obs: crie uma String chamada "cargo" para cada elemento da "lista"
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
		
		
		
		
	}
	
}
