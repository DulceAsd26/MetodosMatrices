
//Matriz inversa
import static Matricesejercicios.Matrizinversa.imprimirMatriz;
import static Matricesejercicios.Matrizinversa.llenarMatriz;
import static Matricesejercicios.Matrizinversa.matrizInversa;
/*import Matricesejercicios.VerficacionMagico;*/
import static Matricesejercicios.VerficacionMagico.esMagico;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        
        System.out.println("1. Cuadro Magico");
        System.out.println("2. Matriz inversa");
        System.out.println("3. Matrices comunes");
        System.out.println("4. El caracol");
        System.out.println("5. Matrices transpuestas");
    
        System.out.println();
        System.out.print("Eliga la opcion que desea ver: ");
        respuesta = entrada.nextInt();
        switch (respuesta){
            case 1:
        //Cuadro Magico
        int[][] m = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el dato de la fila" + i);
                int d = sc.nextInt();
                m[i][j] = d;
            }
        }
        esMagico(m);
        System.out.println();
        break;
        
            case 2:
        //Matriz inversa
        System.out.print("Realización de matriz inversa \t");
        System.out.println();
        int[][] a;
        int[][] b;

        a = llenarMatriz();
        imprimirMatriz(a);
        System.out.println("------------");
        b = matrizInversa(a);
        imprimirMatriz(b);
        System.out.println();
        break;
        
        
        case 3:
        //Caracol
            
        int n=5;
        String [][] matriz = new String [n][n];
        int a=0, b=n-1,valor=1;
        
        
        for(int j = 0; j < matriz.length; j++){
        //Llenado de la fila superior ->
        for (int i = a; i <= b; i++) {
            matriz[a][i] = valor++ + "\u2192 \t";            
        }
        
        //Llenado de la columna de extremo derecho de arriba hacia abajo | 
        for (int i = a+1; i <= b ; i++) {
            matriz[i][b] = valor++ + "\u2193 \t";
        }
        
        //Llenado de la fila inferior de derecha a izquierda <-
        for (int i = b-1; i >= a; i--) {
            matriz[b][i] = valor++ + "\u2190 \t";
        }
        
        //Llenado de la columna del extremo izquierdo de abajo hacia arriba
        for (int i = b-1; i >= a+1; i--) {
            matriz[i][a] = valor++ + "\u2191 \t";
        }
        
        a++; b--;
        
      }//fin de ciclo externo 
        
        //Mostar matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int i = 0; i < matriz.length; i++) {
                
                System.out.print(matriz[f][i]);
            }
            System.out.println();//Salto de linea cuando se cambia de fila
        }
        break;
    }
        case 4:
        //Caracol
        System.out.println();
		int[] array1 = new int[5];
		int array2[] = new int[5];
		llenarArray(array1);
		llenarArray(array2);
		System.out.println("Mat1: " + Arrays.toString(array1));
		System.out.println("Mat2: " + Arrays.toString(array2));
	
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if(array1[i] == array2[j]){
					System.out.println("Elemento común: " + array1[i]);
				}
			}
		}
	}
	
	static void llenarArray(int[] pArray){
		Random r = new Random();
		for(int i=0;i<pArray.length;i++){
			pArray[i] = r.nextInt(50) + 1;
		
                        case 5:    
	  Scanner sc;
        sc=new Scanner(System.in);
        
        System.out.println("Este codigo solo se ejecutara si los tamaños de las matrices "
                + "son de 2*2 o 3*3");
        System.out.println("");
        System.out.println("Ingrese el tamaño de la fila");
        int fila=sc.nextInt();
        System.out.println("");
        System.out.println("Ingrese el tamaño de la columna");
        int columna=sc.nextInt();
        
        comparacion(fila, columna);
        break;
                }
    }
}

    




                
                
               
       
          


                        
              


        




         
         
     
   



    

    
       

