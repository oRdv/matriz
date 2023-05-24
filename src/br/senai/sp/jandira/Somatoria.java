package br.senai.sp.jandira;

public class Somatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i;
		int matrizA[] = new int[10];
		int matrizB[] = new int[10];
		
		
		matrizA[0] = 1;
		matrizA[1] = 2;
		matrizA[2] = 3;
		matrizA[3] = 4;
		matrizA[4] = 5;
		matrizA[5] = 6;
		matrizA[6] = 7;
		matrizA[7] = 8;
		matrizA[8] = 9;
		matrizA[9] = 10;
	
		
		for (i = 0; i < matrizA.length; i++) {
			if(matrizA[i] % 2 == 1) {
				matrizB[i] = matrizA[i] + 5;
				
			}else {
				matrizB[i] = matrizA[i] * 5;
			}
			
			System.out.println(matrizB[i]);
		
			
		}
		

		
		
		
		
		
		
		

	}

}
