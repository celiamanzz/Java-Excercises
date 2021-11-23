import javax.swing.JOptionPane;

public class usoBubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arroba;
		boolean punto=false;
		arroba =0;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@'){
				// chatAt es la posicion (i) del mail
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				
				punto = true;
			}
		}
		if(arroba==1 && punto==true) {
			System.out.println("Es correcto");
			}
		
		else {
			System.out.println("No es correcto");
			}
		
	       
	}

}
