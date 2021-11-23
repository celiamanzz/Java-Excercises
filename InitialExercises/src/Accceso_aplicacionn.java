import javax.swing.*;
public class Accceso_aplicacionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Celia"; //Almacena contraseña
		String password = "";
		
		while (clave.equals(password)==false) {
			password = JOptionPane.showInputDialog("Introduce la contraseña por favor");
					
			if (clave.equals(password)==false)
				System.out.println("Contraseña incorrecta");
		}
		System.out.println("Contraseña correcta. Acceso permitido");
	}
}
