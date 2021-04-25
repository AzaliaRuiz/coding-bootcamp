/*Programa que borre elementos duplicados en un linked list*/
import java.io.*;
import java.util.Scanner;

/*Clase nodo*/
class nodos {
    int data;
    nodos link;
}
public class LinkedList01 {
    public static nodos head = null;
    public static nodos nextNodo = null;

    public static void Inicio(){
        Scanner Scan = new Scanner(System.in);
        int data;
        nodos NextNodo2,newNodo;
        int opcion = 0;
        int aux = 0;
        int count = 0;
        do {
        if (head == null){
            head = new nodos();
            System.out.println("Introduzca el dato del nodo");
            data = Scan.nextInt();
            head.data = data;
            head.link = nextNodo;
        }
        else{
            newNodo = head;
            while (newNodo.link != null){
                newNodo = newNodo.link;
            }
            NextNodo2 = new nodos();
            System.out.println("Introduzca el dato del nodo");
            data = Scan.nextInt();
            NextNodo2.data = data;
            NextNodo2.link = null;
            newNodo.link = NextNodo2;
        }
            System.out.println("Otro 1, No 2");
            opcion = Scan.nextInt();
        }while(opcion>0 && opcion<2);

        /*nextNodo = new nodos();
        System.out.println("Introduzca el dato del nodo");
        data = Scan.nextInt();
        nextNodo.data = data;
        nextNodo.link = null;

        NextNodo2 = nextNodo;
        do{
           head = new nodos();
            System.out.println("Introduzca el dato del nodo");
            data = Scan.nextInt();
            head.data = data;
            head.link = null;
            NextNodo2.link = head;
            NextNodo2 = head;
            System.out.println("Otro 1, No 2");
            opcion = Scan.nextInt();
        }while (opcion>0 && opcion<2);*/
        newNodo = new nodos();
        for (nodos i = head; i != null; i = i.link){
            for (nodos j = head; j != null; j = j.link) {
                if(i.data == j.data){
                    aux = i.data;
                    count++;
                }
                else if(aux != i.data){
                    count = 0;
                }
                if(count >= 2){
                    nextNodo = j;
                    //newNodo = i.link;
                    j = i;
                    if(i == nextNodo){
                      i = nextNodo.link;
                    }
                    else{
                        nextNodo = i;
                        while(nextNodo.link!=null){
                            newNodo = nextNodo;
                            nextNodo = nextNodo.link;
                        }
                        if (nextNodo.link ==  null){
                            newNodo.link = null;

                        }
                    }
                    count = 0;
                    aux = 0;
                }

            }
            ///System.out.println("Data: "+i.data+" Link: "+i.link);
            System.out.print(i.data+"-> ");
            //System.out.print(newNodo.data+"--");
        }
        //System.out.println("Aux: "+aux+" Count: "+count);
    }

    public static void main(String [] args) {
        Scanner Scan = new Scanner(System.in);

        int opcion = 0;
        System.out.println("4. Listas Simples: Eliminar elementos repetidos");
        Inicio();
}
}
