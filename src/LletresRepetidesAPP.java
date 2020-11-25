import java.util.ArrayList;

public class LletresRepetidesAPP {

	public static void main(String[] args) {

	ArrayList <Character> nombre= new ArrayList ();
	
	nombre.add('G');
	nombre.add('E');
	nombre.add('R');
	nombre.add('A');
	nombre.add('R');
	nombre.add('D');
	nombre.add('1');
	
		for (int i=0;i<nombre.size();i++) {
		System.out.println(nombre.get(i));
			if (nombre.get(i)== 'A'||
				nombre.get(i)== 'E'||
				nombre.get(i)== 'I'||
				nombre.get(i)== 'O'||
				nombre.get(i)== 'U') {
				System.out.println("VOCAL");
				
			}else if(nombre.get(i)== '0'||
				nombre.get(i)== '1'||
				nombre.get(i)== '2'||
				nombre.get(i)== '3'||
				nombre.get(i)== '4'||
				nombre.get(i)== '5'||
				nombre.get(i)== '6'||
				nombre.get(i)== '7'||
				nombre.get(i)== '8'||
				nombre.get(i)== '9'){
				System.out.println("Els noms de persones no contenen números!");
			}else{
				System.out.println("CONSONANT");
			}
		}
		
	}
}

