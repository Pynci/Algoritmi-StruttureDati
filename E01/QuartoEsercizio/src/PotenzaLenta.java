import java.util.Scanner;
public class PotenzaLenta {
    public static void main(String[] args) {
        long a,b;
        long risultato;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserire la base (intera): ");
        a = scanner.nextLong();
        System.out.print("Inserire l'esponente (naturale): ");
        b = scanner.nextLong();
        risultato = potenzaLenta(a,b);
        if(risultato == -1){
            System.out.println("I valori inseriti non sono corretti");
        }
        else{
            System.out.println("Il valore della potenza risulta (metodo lento): " + risultato);
        }
    }

    //ritorna il risultato della potenza se l'input è corretto, ritorna -1 se l'input è scorretto
    static long potenzaLenta(long a, long b){

        if(b < 0){
            return -1;
        }

        //con a base e b esponente
        if(b == 0){
            return 1;
        }
        else{
            return a * potenzaLenta(a,b-1);
        }
    }
}
