package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		/*
		 * Identificadores (nomes dos elementos que criamos: variaveis, classes,
		 * pacotes etc.
		 * - Regras:
		 * 1� - N�o come�ar�s com n�mero. Exemplo: 1berto (errado) h1berto (certo)
		 * 2� - N�o utilizar�s palavras reservadas. Exemplo: int, double, class, void
		 * 3� - N�o far�s uso de caracteres especiais. Exemplo: n@me, tr#s, nome cliente ...
		 * - Padr�es:
		 * 1) CamelCase: da segunda palavra em diante (em uma composicao)
		 * deve come�ar com letra maiuscula. 
		 * certo => dataNascimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * errado => data_Nascimento
		 * 
		 * 2) UML: � respons�vel por padronizar elementos da Orienta��o a Objetos
		 * - Toda classe deve come�ar com letra maiuscula
		 * - Toda variavel/pacote deve come�ar com letra minuscula
		 * - Todo m�todo deve come�ar com letra minuscula e deve ser seguido de
		 * parenteses.
		 * 
		 * xpto => � uma vari�vel
		 * Xpto => � uma classe
		 * xpto() => � uma fun�ao
		 * Xpto.xpto() => � um m�todo
		 */
		
		String email = "huMbeRto@fIap.CoM.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculo:" + email.toUpperCase());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Do 2� at� o quinto caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
		System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0));
		
				
		// h u m b e r t o @ f i a p
		// 0 1 2 3 4 5 6 7 8 9 ....
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
