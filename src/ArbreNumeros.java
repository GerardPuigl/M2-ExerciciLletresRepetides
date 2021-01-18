import javax.swing.JOptionPane;

public class ArbreNumeros {

	public static void main(String[] args) {
		String textUsuari = JOptionPane.showInputDialog("Escriu un n�mero");
		int altArbre = 0;
		
		try {
			altArbre=Integer.valueOf(textUsuari);
			
		} catch (Exception e) {
			System.out.println("No has introduit un n�mero.");
		}
		
		
		for (int i=1;i<=altArbre;i++) {
			for (int l=1;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println("");
			
		}
		
		
		for (int i=altArbre;i>=1;i--) {
			for (int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		
		
	}

}
