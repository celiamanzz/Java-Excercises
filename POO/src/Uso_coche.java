package poo;
import javax.swing.*;

public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VOy a instanciar una clase
		
		Coche renault=new Coche(); // Renault es una instancia de la clase coche, es decir, un objeto de tipo Coche
		
		Coche carg = new Coche();
		//System.out.println("Este coche tiene "+ Renault.ruedas + "ruedas");
		System.out.println(renault.dime_datos());
		
		renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
	
		//Renault.color = "Rosa" Yo podria manipular asi directamente pero no se debe - encapsular
		
		System.out.println(renault.dime_color());
		
		renault.configura_Asientos("true");
		
		System.out.println(renault.dime_asientos());
		
		renault.config_climat("false");
		
		System.out.println(renault.dime_climat());
		
		System.out.println(renault.dime_peso_coche());
		
		System.out.println(renault.precio_coche());
	}

}
