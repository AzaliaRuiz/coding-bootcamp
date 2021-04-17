import java.io.*;
import java.util.*;
import java.lang.*;

public class Palindromo {
    public static void main(String args[])throws java.io.IOException{
        System.out.println("1. Palindromo");
        String resultado = Palindromo("salas");
        System.out.println(resultado);
    }
    public static String Palindromo(String frase){
        String fraseSinP = frase.replaceAll(" ","");
        int mitad = (int) Math.floor(fraseSinP.length()/2);
        String frasenuevaCon = fraseSinP.substring(0,mitad)+"."+fraseSinP.substring(mitad+1);
        String nuevafrase = frasenuevaCon.replace(".","");
        boolean ban = false;
        int last = nuevafrase.length()-1;

        for (int i = 0; i < nuevafrase.length(); i++) {
            boolean bandera = true;
            if (nuevafrase.charAt(i) == nuevafrase.charAt(last - i)){
                bandera = true;
                ban = bandera;
            }
            else {
                bandera = false;
                ban = bandera;
            }
        }
        if (ban) {
            return frase +" es un palindromo "+ban;

        } else {
            return frase +" no es un palindromo "+ban;
        }
    }
}
