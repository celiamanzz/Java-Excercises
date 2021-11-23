import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		String clave = "Celia";
		String pass ="";
		while (clave.equals(pass)==false){
			pass=JOptionPane.showInputDialog("Introduce contraseña");
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta");
	}

}
