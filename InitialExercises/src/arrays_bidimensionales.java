
public class arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix= new int [4][5];
		//Declaro matriz de dos dimensiones: par de corchetes por dimension
		
		matrix[0][0]=15;
		matrix[0][1]=10;
		matrix[0][2]=9;
		matrix[0][3]=15;
		matrix[0][4]=15;
				
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=19;
		matrix[1][3]=17;
		matrix[1][4]=7;
						
		matrix[2][0]=10;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=1;				
				
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=41;
		
		//System.out.println(matrix[2][3]); 
		
		//Para recorrerlo necesito un buble for por dimension
		
		for(int i = 0;i<4;i++) {
			System.out.println();
			for (int j = 0;j<5;j++) {
				
				System.out.print(matrix[i][j]+" ");
				
			}
		}
	}

}
