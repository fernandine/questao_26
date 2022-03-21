package aplicacao;

import java.util.HashMap;
import java.util.Map;

public class Programa {


	public static void main(String[] args) {
	
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		  
		    map.put('a', 1);
		    map.put('b', 2);
		    map.put('c', 3);
		    map.put('z', 26);
		    
		    String text = "abba";

		    	// Imprime a soma;
		    int valorSoma = calcularSomaPalavra(text, map);
		    System.out.println("A soma de todas as letras é: " + valorSoma);

		}
		
			//Contabiliza a soma;
		private static int calcularSomaPalavra(String palavra, Map<Character, Integer> map) {
		    int valorSoma = 0;
		    for (char letra : palavra.toCharArray() ) {
		        if (isCaractereEncontrado(map, letra))
		            valorSoma += getValorCaractere(map, letra);
		    }
		    return valorSoma;
		}

		private static Integer getValorCaractere(Map<Character, Integer> map, char letra) {
		    return map.get(letra);
		}

		private static boolean isCaractereEncontrado(Map<Character, Integer> map, char letra) {
		    return getValorCaractere(map, letra) != null;
		}
}