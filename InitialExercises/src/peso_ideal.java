import javax.swing.*;
public class peso_ideal {

	public static void main(String[] args) {
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");	
		} while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoideal = 0;
		if(genero.equalsIgnoreCase("M")) {
		pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("H")) {
			pesoideal=altura-100;
		}
		System.out.println("Tu peso ideal es " + pesoideal + " kg");
	}

}