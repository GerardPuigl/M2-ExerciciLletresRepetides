import java.util.*;


public class LletresRepetidesAPP {

	public static void main(String[] args) {

		// Nom amb String

		String name = "Gerard";

		// Convertir el nombre en una Arraylist

		ArrayList<Character> arraylistname = new ArrayList();

		for (int i = 0; i < name.length(); i++) {
			arraylistname.add(name.charAt(i));
		}

		// Imprime si son vocales o consonantes y detecta números

		for (int i = 0; i < arraylistname.size(); i++) {

			char letra = Character.toUpperCase(arraylistname.get(i));

			if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

				System.out.println(arraylistname.get(i) + " VOCAL");

			} else if (Character.isDigit(letra)) {

				System.out.println(arraylistname.get(i) + " Els noms de persones no contenen números!");

			} else {

				System.out.println(arraylistname.get(i) + " CONSONANT");

			}
		}		

		//Mapear letras nombre
		
		Map<Character,Integer> contadorletras = new HashMap<Character,Integer>();
		
		for (char l : arraylistname) {
			
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
		
		System.out.println(contadorletras.entrySet()); 
			
		
	}
}
