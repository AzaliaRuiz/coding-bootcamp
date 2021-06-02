import java.util.*;
public class Stack03 {
    public static int Parentesis(String parentesis){
        char [] parentesisS = parentesis.toCharArray();
        int parenDer = 0,parenIzq = 0, contador = 0,resultadoT = 0;
        for (int resultado:parentesisS) {
            if (resultado == '('){
                parenDer++;
            }
            else if (resultado == ')'){
                parenIzq++;

                if (parenDer == parenIzq) {
                    contador++;
                }
            }
        }

        if (contador > 0){
           return resultadoT = (parenDer - contador) + (parenIzq - contador);
        }
        else{
            if (parenDer > parenIzq){
                return  contador = parenDer - parenIzq;
            }
            else {
                return contador = parenIzq - parenDer;
            }
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String parentesis = "";
        int resultado = 0;

        System.out.println("11. Función que regrese el mínimo número de paréntesis que hay que agregar para que los paréntesis sean válidos");
        System.out.println("Favor de escribir los parentesis a analizar");
        parentesis = scan.nextLine();
        resultado = Parentesis(parentesis);

        if (resultado > 0) {
            System.out.println("Faltan "+resultado+ " paréntesis para ser válidos");
        }
        else System.out.println("Lo lamento, caracteres inválidos");

    }
}
