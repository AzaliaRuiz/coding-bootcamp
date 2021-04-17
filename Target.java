import java.io.*;
import java.util.*;
import java.lang.*;
public class Target {
    public static void main(String args[])throws java.io.IOException{
        System.out.println("2. Target");
        int arreglo [] = {1,5,3,9,1};
        int target = 10;
        System.out.println("arrlego: "+arreglo+" \n"+ "target: "+target);

        String resultado = Suma(arreglo,target);
        System.out.println(arreglo);
        System.out.println("resultado " + resultado);
    }
    public static String Suma(int arreglo [],int target){
        String resultado = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                int suma = arreglo[i] + arreglo[j];
                if(suma == target){
                    resultado = ""+i+','+ j;
                    return resultado;
                }
            }
        }
        return resultado;
    }
}
