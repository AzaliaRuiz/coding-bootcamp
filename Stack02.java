import java.util.*;

public class Stack02 {
    public static Stack queue = new Stack();
    public static Stack auxiliar = new Stack();

    public static int peek = 0;
    public static int contador = 0;

    public static void EliminarNodo(){
        for (int i = queue.size(); i > 1; i--) {
            auxiliar.push(queue.peek());
            queue.pop();
        }
        peek = (int) queue.peek();
        queue.pop();

        if (queue.empty()){
            for (int i = auxiliar.size(); i > 0; i--) {
                queue.push(auxiliar.peek());
                auxiliar.pop();
            }
        }

    }

    public static void main(String [] args){
        Scanner Scan = new Scanner(System.in);
        int op = 0;

        //[1,2,3,4,5]
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println("9. Simular una Cola utilizando 2 pilas");

        do{
            System.out.println("Queue: "+queue);
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Empty");
            op = Scan.nextInt();
            switch (op){
                case 1:
                    int data;
                    System.out.println("Introduzca el dato: ");
                    data = Scan.nextInt();
                    queue.push(data);
                    break;
                case 2:
                    EliminarNodo();
                    break;

                case 3:
                    for (Object result: queue) {
                        peek = (int)result;
                        break;
                    }
                    System.out.println("Head: "+peek);
                    break;

                case 4:
                    if (queue.empty()){
                        System.out.println("The Queue is empty");
                    }
                    else{
                        System.out.println("The Queue is not empty");
                    }
                    break;
            }
        }while (op>0 && op<5);
    }
}
