/*Programa que sume los elementos de dos linked list (unidades,decenas,centenas)*/
import java.util.Scanner;

/*Clase nodo*/
class nodos3 {
    int data;
    nodos3 link;
}
public class LinkedList03 {
    public static nodos3 head = null;
    public static nodos3 nextNodo = null;

    public static int Lista(){
        Scanner Scan = new Scanner(System.in);
        int data;
        nodos3 NextNodo2,newNodo;
        int opcion,count = 0;

        do {
            if (head == null){
                head = new nodos3();
                System.out.println("Introduzca el dato del nodo");
                data = Scan.nextInt();
                head.data = data;
                head.link = nextNodo;
                count++;
            }
            else{
                NextNodo2 = new nodos3();
                newNodo = head;
                while (newNodo.link != null){
                    newNodo = newNodo.link;
                }
                System.out.println("Introduzca el dato del nodo");
                data = Scan.nextInt();
                NextNodo2.data = data;
                NextNodo2.link = null;
                newNodo.link = NextNodo2;
                count++;
            }
            System.out.println("Otro 1, No 2");
            opcion = Scan.nextInt();
        }while(opcion>0 && opcion<2);

        return count;
    }

    public static int LugaresAntes(int count) {
        Scanner Scan = new Scanner(System.in);
        int lugarAntes = 0;
        int result,resultNodo = 0;

        System.out.println("Nodo K lugares antes del último nodo");
        lugarAntes = Scan.nextInt();
        result = count - lugarAntes;
        count = 0;

        for (nodos3 i = head; i != null ; i = i.link) {
            count++;
            if (result == count){
                resultNodo = i.data;
            }
        }
        return resultNodo;
    }
    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);
        int count,result;
        System.out.println("7. Listas Simples: Encontrar el nodo K lugares antes del último nodo");
        count = Lista();
        result = LugaresAntes(count);
        System.out.println("Result: "+ result);
    }
}


