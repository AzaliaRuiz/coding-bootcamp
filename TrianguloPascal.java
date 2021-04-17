import java.util.Scanner;
import java.lang.*;
public class TrianguloPascal {
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String args[]){
        int renglon = 3;
        System.out.println("3. Triangulo de Pascal");
        System.out.println("Indice: "+renglon);
        Triangulo(renglon);
    }

    public static void Triangulo(int fila){
        int dimension = fila+1;
        int [][] matriz = new int[dimension][dimension];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                    matriz[0][j] = 1;
                    matriz[i][0] = 1;
                    if (i > 0 && j > 0){
                        matriz[i][j] = matriz[i-1][j] + matriz[i][j-1];
                    }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == fila){
                    System.out.print(+matriz[i-j][j]+" ");
                }
            }
        }
    }


}

