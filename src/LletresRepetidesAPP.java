import java.util.*;

public class LletresRepetidesAPP {

	public static void main(String[] args) {

		// Nom amb String

		String name = "Gerard";
		String surname = "Puig";

		// Convertir el nombre en una Arraylist 

		ArrayList<Character> arraylistname = new ArrayList();

		for (int i = 0; i < name.length(); i++) {
			arraylistname.add(name.charAt(i));
		}

		// Convertir el apellido en Arraylist

		ArrayList<Character> arraylistsurname = new ArrayList();

		for (int i = 0; i < surname.length(); i++) {
			arraylistsurname.add(surname.charAt(i));
		}

		// Fusionar las dos listas con un espacio en medio

		ArrayList<Character> arraylistFullName = new ArrayList();

		for (char letra : arraylistname) {
			arraylistFullName.add(letra);
		}

		arraylistFullName.add(' ');

		for (char letra : arraylistsurname) {
			arraylistFullName.add(letra);
		}

		// Imprime el nombre completo con espacio
		
		for (char letra : arraylistFullName) {
			System.out.print(letra);
		}

		System.out.println("");

		// Imprime si son vocales o consonantes i detecta números o caracters extranys

		for (int i = 0; i < arraylistFullName.size(); i++) {

			char letra = Character.toUpperCase(arraylistFullName.get(i));

			if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

				System.out.println(arraylistFullName.get(i) + " VOCAL");

			} else if (Character.isDigit(letra)) {

				System.out.println(arraylistFullName.get(i) + " Els noms de persones no contenen números!");

			} else if (letra == ' ') {

				// no hacer nada

			} else {

				System.out.println(arraylistFullName.get(i) + " CONSONANT");

			}
		}

		// Mapear letras nombre completo

		Map<Character, Integer> contadorletras = new HashMap<Character, Integer>();

		for (char l : arraylistFullName) {

			char key = Character.toUpperCase(l);

			if (Character.isAlphabetic(key)) {

				if (contadorletras.get(key) == null) {

					contadorletras.put(key, 1);

				} else {

					contadorletras.put(key, contadorletras.get(key) + 1);

				}
			}

		}

		// Mostrar en pantalla los datos

		System.out.println(contadorletras.entrySet());		

	}
}