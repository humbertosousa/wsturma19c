package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		/*
		 * Identificadores (nomes dos elementos que criamos: variaveis, classes,
		 * pacotes etc.
		 * - Regras:
		 * 1º - Não começarás com número. Exemplo: 1berto (errado) h1berto (certo)
		 * 2º - Não utilizarás palavras reservadas. Exemplo: int, double, class, void
		 * 3º - Não farás uso de caracteres especiais. Exemplo: n@me, tr#s, nome cliente ...
		 * - Padrões:
		 * 1) CamelCase: da segunda palavra em diante (em uma composicao)
		 * deve começar com letra maiuscula. 
		 * certo => dataNascimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * errado => data_Nascimento
		 * 
		 * 2) UML: é responsável por padronizar elementos da Orientação a Objetos
		 * - Toda classe deve começar com letra maiuscula
		 * - Toda variavel/pacote deve começar com letra minuscula
		 * - Todo método deve começar com letra minuscula e deve ser seguido de
		 * parenteses.
		 * 
		 * xpto => é uma variável
		 * Xpto => é uma classe
		 * xpto() => é uma funçao
		 * Xpto.xpto() => é um método
		 */
		
		String email = "huMbeRto@fIap.CoM.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculo:" + email.toUpperCase());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Do 2º até o quinto caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usuário: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
		System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0));
		
				
		// h u m b e r t o @ f i a p
		// 0 1 2 3 4 5 6 7 8 9 ....
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
