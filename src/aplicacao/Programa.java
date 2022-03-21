package aplicacao;

import java.util.HashMap;
import java.util.Map;

public class Programa {


	public static void main(String[] args) {
	
		 Map<Character, Integer> alfabeto = new HashMap<Character, Integer>();
		  

		    alfabeto.put('a', 1);
		    alfabeto.put('b', 2);
		    alfabeto.put('c', 3);
		    alfabeto.put('z', 26);
		    
		    String text = "abba";

		    int valorSoma = calcularSomaPalavra(text, alfabeto);
		    System.out.println("A soma de todas as letras é: " + valorSoma);

		}

		private static int calcularSomaPalavra(String palavra, Map<Character, Integer> alfabeto) {
		    int valorSoma = 0;
		    for (char caractere : palavra.toCharArray()) {
		        if (isCaractereEncontrado(alfabeto, caractere))
		            valorSoma += getValorCaractere(alfabeto, caractere);
		    }
		    return valorSoma;
		}

		private static Integer getValorCaractere(Map<Character, Integer> alfabeto, char caractere) {
		    return alfabeto.get(caractere);
		}

		private static boolean isCaractereEncontrado(Map<Character, Integer> alfabeto, char caractere) {
		    return getValorCaractere(alfabeto, caractere) != null;
		}
}