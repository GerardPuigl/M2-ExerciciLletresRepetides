import java.util.*;
import javax.swing.JOptionPane;


public class LletresRepetidesAPP {

	public static void main(String[] args) {

		// Petición nombre mediante panel

		String nombre = JOptionPane.showInputDialog("Escribe tu nombre");

		/*
		// Convertir el nombre en matriz de carácteres (Fase 1 del ejercicio)

		char[] matriznombre = new char[nombre.length()];

		for (int i = 0; i < nombre.length(); i++) {
			matriznombre[i] = nombre.charAt(i);
		}

		// Imprimir Letras por pantalla

		for (int i = 0; i < matriznombre.length; i++) {
			System.out.println(matriznombre[i]);
		}	 
		*/
		
		// Convertir el nombre en una Arraylist (Fase 2 del ejercicio)

		ArrayList<Character> arraylistnombre = new ArrayList();

		for (int i = 0; i < nombre.length(); i++) {
			arraylistnombre.add(nombre.charAt(i));
		}

		// Imprime si son vocales o consonantes i detecta números o caracters extranys

		for (int i = 0; i < arraylistnombre.size(); i++) {

			char letra = Character.toUpperCase(arraylistnombre.get(i));

			if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

				System.out.println(arraylistnombre.get(i) + " és una vocal");

			} else if (Character.isDigit(letra)) {

				System.out.println(arraylistnombre.get(i) + " Error, els noms de persones no contenen números!");

			} else if (Character.isAlphabetic(letra) == false) {

				System.out.println(arraylistnombre.get(i) + " Error, els noms no contenen caracters especials!");

			} else {

				System.out.println(arraylistnombre.get(i) + " és una consonant");

			}
		}		

		//Mapear letras nombre (FASE 3 Ejercicio)
		
		Map<Character,Integer> contadorletras = new HashMap<Character,Integer>();
		
		for (char l : arraylistnombre) {
			
			char letra = Character.toUpperCase(l);
			
			if (Character.isAlphabetic(letra)) {
				
				if (contadorletras.get(letra) == null) {
					
					contadorletras.put(letra, 1);
					
				} else {
					
					contadorletras.put(letra, contadorletras.get(letra) + 1);

				}
			}

		}

		for (char key:contadorletras.keySet()) {
			if (contadorletras.get(key)==1) {
			System.out.println("Hi ha " + contadorletras.get(key) + " lletra " + key );
			}else {
				System.out.println("Hi ha " + contadorletras.get(key) + " lletres " + key );				
			}
		}
		
	}
}
