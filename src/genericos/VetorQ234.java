package genericos;

import java.util.Arrays;

public class VetorQ234<T> {
	
	public static void main(String[] args) {

        String[] nomes = {"Ana", "Beto", "Carlos", "Diana"};
        
        System.out.println("Array Original: " + Arrays.toString(nomes)); // [Ana, Beto, Carlos, Diana]

        //Trocar elementos
        trocarElementos(nomes, 0, 3); // Troca 'Ana' com 'Diana'
        System.out.println("\nApós a Troca (0 <-> 3): " + Arrays.toString(nomes)); // [Diana, Beto, Carlos, Ana]

        //Imprimir
        imprimir(nomes);

        //Pesquisar
        String elementoPesquisado = "Beto";
        String resultado = pesquisar(nomes, elementoPesquisado);
        
        if (resultado != null) {
            System.out.println("\nTeste Pesquisa: O elemento '" + elementoPesquisado + "' foi encontrado.");
        } else {
            System.out.println("\nTeste Pesquisa: O elemento '" + elementoPesquisado + "' NÃO foi encontrado.");
        }
    }
	
	//2. Crie em Java um método genérico trocarElementos(T[] array, int i, int j) que troca dois elementos de qualquer array.
	public static <T> T[] trocarElementos(T[] array, int i, int j) {
		
		T temporario = array[i];
		array[i] = array[j];
		array[j] = temporario;
		
		return array;
		
	}
	
	//3. Crie em Java um método genérico pesquisar(T[] array, T elemento) que pesquisa se o elemento está ou não no vetor
	
	public static <T> T pesquisar(T[] array, T element){
		for (T t : array) {
			if (t.equals(element)) {
				return t;
			}
		}
		return null;
	}
	
	//4. Crie em Java um método genérico imprimir(T[] array) que imprime os elementos de um array
	public static <T> void imprimir(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}
}
