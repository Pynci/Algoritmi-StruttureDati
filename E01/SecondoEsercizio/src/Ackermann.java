import java.util.Scanner;
public class Ackermann {
    public static void main(String[] args) {
        long x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire i valori di partenza per la funzione di Ackermann.");
        System.out.print("x: ");
        x = scanner.nextLong();
        System.out.print("y: ");
        y = scanner.nextLong();

        System.out.println("Il valore della funzione di Ackermann per x e y risulta: " + ack(x,y));
    }

    //Ackermann è una funzione che cresce esponenzialmente ==> rischio concreto di Stack Overflow
    static long ack(long x, long y){
        if(x == 0){
            return y + 1;
        }
        if(y == 0){
            return ack(x-1,1);
        }
        else{
            return ack(x-1,ack(x,y-1));
        }
    }
}
