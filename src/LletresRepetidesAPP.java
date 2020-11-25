import java.util.*;
import javax.swing.JOptionPane;


public class LletresRepetidesAPP {

	public static void main(String[] args) {

		// Petición nombre mediante panel

		String name = JOptionPane.showInputDialog("Escriu el teu nom");
		
		String surname = JOptionPane.showInputDialog("Escriu el teu cognom");

		
		/*
		// Convertir el name en matriz de carácteres (Fase 1 del ejercicio)

		char[] matrizname = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			matrizname[i] = name.charAt(i);
		}

		// Imprimir Letras por pantalla

		for (int i = 0; i < matrizname.length; i++) {
			System.out.println(matrizname[i]);
		}	 
		*/
		
		// Convertir el nombre en una Arraylist (Fase 2 del ejercicio)

		ArrayList<Character> arraylistname = new ArrayList();

		for (int i = 0; i < name.length(); i++) {
			arraylistname.add(name.charAt(i));
		}

		// Añadir lista apellido (Fase 4 del ejercicio)
		
		ArrayList<Character> arraylistsurname = new ArrayList();

		for (int i = 0; i < surname.length(); i++) {
			arraylistsurname.add(surname.charAt(i));
		}

		// Fusionar las dos listas (Fase 4 del ejercicio)
	
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

		// Imprime si son vocales o consonantes i detecta números o caracters extranys

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
		
		Map<Character,Integer> contadorletras = new HashMap<Character,Integer>();
		
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
		
		for (char key : contadorletras.keySet()) {
			
			if (contadorletras.get(key) == 1) {
			
				System.out.println("Té " + contadorletras.get(key) + " lletra " + key);
			
			} else {
			
				System.out.println("Té " + contadorletras.get(key) + " lletres " + key);
			
			}
		}
		
	}
}
