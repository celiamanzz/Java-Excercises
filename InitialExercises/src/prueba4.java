import javax.swing.*;
import java.util.*;
public class prueba4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		
		int i = 1;
		while (i<=10) {
		
			System.out.println(N +" x "+ i+" = "+ N*i);
			i++;
		}
	}

}
