public class PotenzaDiCinque {
    public static void main(String[] args) {
        System.out.println(incognita(1));
    }

    static int incognita(int n){
        int a = 0;
        int d = 0;
        int j = 7;

        //gli estremi sono volutamente inclusi
        for(int i = 0; i <= n; i++){
            for(int k = 0; k <= j; k++){
                a = 1;
                while(j > 0){
                    a = a * 5;
                    j--;
                }
                d = d + a;
            }
        }

        return d;
    }
}
