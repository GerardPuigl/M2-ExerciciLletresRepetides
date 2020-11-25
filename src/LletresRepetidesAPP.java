import java.util.*;
import javax.swing.JOptionPane;


public class LletresRepetidesAPP {

	public static void main (String[] args) {

		// Petición nombre mediante panel

		String name = JOptionPane.showInputDialog("Escriu el teu nom");
		
		String surname = JOptionPane.showInputDialog("Escriu el teu cognom");
		
		// Convertir el nombre en una Arraylist

		ArrayList<Character> arraylistname = new ArrayList();

		for (int i = 0; i < name.length(); i++) {
			arraylistname.add(name.charAt(i));
		}

		// Añadir lista apellido 
		
		ArrayList<Character> arraylistsurname = new ArrayList();

		for (int i = 0; i < surname.length(); i++) {
			arraylistsurname.add(surname.charAt(i));
		}

		// Fusionar las dos listas
	
		ArrayList<Character> arraylistFullName = new ArrayList();
		
		for (char letra : arraylistname) {
			arraylistFullName.add(letra);			
		}
		
		arraylistFullName.add(' ');

		for (char letra : arraylistsurname) {
			arraylistFullName.add(letra);
		}

		for (char letra : arraylistFullName) {
			System.out.print(letra);	
		}
		
		System.out.println("");

		// Imprime si son vocales o consonantes y detecta números o caracteres especiales

		for (int i = 0; i < arraylistFullName.size(); i++) {

			char letra = Character.toUpperCase(arraylistFullName.get(i));

			if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

				System.out.println(arraylistFullName.get(i) + " és una vocal");

			} else if (Character.isDigit(letra)) {

				System.out.println(arraylistFullName.get(i) + " Error, els noms de persones no contenen números!");
			
			} else if (letra==' '){
			
				//no hacer nada
				
			} else if (Character.isAlphabetic(letra) == false) {

				System.out.println(arraylistFullName.get(i) + " Error, els noms no contenen caracters especials!");

			} else {

				System.out.println(arraylistFullName.get(i) + " és una consonant");

			}
		}		

		//Mapear letras nombre (FASE 3 Ejercicio)
		
		HashMap<Character,Integer> contadorletras = new HashMap<Character,Integer>();
		
		for (char l : arraylistFullName) {
			
			char key = Character.toUpperCase(l);
			
			if (Character.isAlphabetic(key)) {

				//	contadorletras.compute(key, contadorletras.get(key));
				
				if (contadorletras.get(key) == null) {
					
					contadorletras.put(key, 1);
					
				} else {
					
					contadorletras.put(key, contadorletras.get(key) + 1);

				}
			}

		}

		//Mostrar en pantalla los datos
		
		//imprimir todo del tiron
		
		System.out.println(contadorletras.entrySet()); 
		
		//impresión por letra
		
		for (char key : contadorletras.keySet()) {
			
			if (contadorletras.get(key) == 1) {
			
				System.out.println("Té " + contadorletras.get(key) + " lletra " + key);
			
			} else {
			
				System.out.println("Té " + contadorletras.get(key) + " lletres " + key);
			
			}
		}
		
	}
}
