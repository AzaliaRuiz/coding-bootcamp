/*Programa que sume los elementos de dos linked list (unidades,decenas,centenas)*/
import java.io.*;
import java.util.Scanner;

/*Clase nodo*/
class nodos2 {
    int data;
    nodos2 link;
}
public class LinkedList02 {
    public static nodos2 head = null;
    public static nodos2 nextNodo = null;

    public static nodos2 head2 = null;
    public static nodos2 nextNodo2 = null;

    public static void Lista(nodos2 cabeza,nodos2 nextNodos){
        Scanner Scan = new Scanner(System.in);
        int data;
        nodos2 NextNodo2,newNodo;
        int opcion = 0;

        do {
            if (cabeza == null){
                cabeza = new nodos2();
                System.out.println("Introduzca el dato del nodo");
                data = Scan.nextInt();
                cabeza.data = data;
                cabeza.link = nextNodos;
            }
            else{
                NextNodo2 = new nodos2();
                newNodo = cabeza;
                while (newNodo.link != null){
                    newNodo = newNodo.link;
                }
                System.out.println("Introduzca el dato del nodo");
                data = Scan.nextInt();
                NextNodo2.data = data;
                NextNodo2.link = null;
                newNodo.link = NextNodo2;
            }
            System.out.println("Otro 1, No 2");
            opcion = Scan.nextInt();
        }while(opcion>0 && opcion<2);

        if (head == null && nextNodo == null){
            head = cabeza;

        }else if (head2 == null){
            head2 = cabeza;
        }

        for (nodos2 i = cabeza; i != null; i =  i.link) {
            System.out.println("i = " + i.data);
        }

    }
    public static void Result(){
        int result;
        String resultado = "";
        int[] aux = new int[1];
        while (head != null && head2 != null){
            result = head.data+head2.data;
            if (head.data+head2.data >= 10) {
                aux[0] =  result/10;
                result = result - 10;
                resultado = result+"->";
            }
            else if (head.data+head2.data < 10 && aux != null) {
                result = head.data+head2.data+aux[0];
                if (result >= 10 ){
                    aux[0] =  result/10;
                    result = result - 10;
                    resultado = result+"->";
                }
                resultado = resultado+result+"->";

                if (head.link == null && head2.link == null && head.data+head2.data+aux[0] >= 10){
                    resultado = resultado+result+"->"+aux[0];
                }
            }
            head = head.link;
            head2 = head2.link;
        }
        System.out.print("resultado = " + resultado);
    }

    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);
        System.out.println("5. Listas Simples: Suma de nodos(unidades,decena,centenas,etc.) Ambas listas deben de ser la misma longitud");
        Lista(head,nextNodo);
        Lista(head2,nextNodo2);
        Result();
    }
}


