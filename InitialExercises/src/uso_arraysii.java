import javax.swing.*;
public class uso_arraysii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[8];
		String [] paises2 = new String[8];
		paises[0] = "España";
		paises[1] = "México";
		paises[2] = "Colombia";
		paises[3] = "Perú";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		
		/*for (int i=0; i<paises.length; i++) {
			
			
		}*/
		
		for(String elemento:paises) { //Nueva forma for-each
			
			System.out.println(elemento);
		}
		
		//Ahora voy a hacer un panel para introducir a mano pro pantalla los nombres de los paises
		for (int i=0; i<paises2.length; i++) {
			paises2[i] = JOptionPane.showInputDialog("Introduce país "+ ( i+1));
			
		}
		
		for(String elemento2:paises2) { 
			
			System.out.println(elemento2);
		}

	}

}
