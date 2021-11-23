
public class arrays_bidimensionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{10,15,18,19,21},
				{5,25,18,37,21},
				{7,19,32,14,90},
				{85,2,7,40,21}

	};

		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z: fila) {
				
				System.out.print(z + " ");
			}
		}
	}
}
