import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserire un numero (posizione nella sequenza di Fibonacci): ");
        x = scanner.nextInt();
        System.out.println("Il valore nella " + x + "-esima posizione della sequenza di Fibonacci risulta: " + fib(x));
    }

    static int fib(int x){
        if(x == 0){
            return 0;
        }
        if(x == 1 || x == 2){
            return 1;
        }
        else{
            return fib(x-1) + fib(x-2);
        }
    }
}
