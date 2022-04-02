import java.util.Scanner;
public class MCDVeloce {
    public static void main(String[] args) {
        long a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire i due numeri oggetto del calcolo del MCD.");
        System.out.print("Primo numero: ");
        a = scanner.nextLong();
        System.out.print("Secondo numero: ");
        b = scanner.nextLong();

        System.out.println("Il massimo comun divisore tra i due numeri risulta (metodo veloce): " + mcdVeloce(a,b));
    }

    static long mcdVeloce(long a, long b){
        if(b == 0){
            return a;
        }
        else{
            return mcdVeloce(b,a%b);
        }
    }
}
