public class ContaSequenze {
    public static void main(String[] args) {
        int[] arrayProva = {10,21,10,31,11,52,21,31,29};
        //stampa(arrayProva);

        System.out.println(countOOE(arrayProva,0,arrayProva.length-1));
    }

    static int countOOE(int[] a, int left, int right){
        if(right - left < 2){
            return 0;
        }
        int middle = (right + left) / 2;
        int res1 = countOOE(a, left, middle);
        int res2 = countOOE(a, middle+1, right);
        int result = res1 + res2;

        if(a[middle-1] % 2 == 1 && a[middle] % 2 == 1 && a[middle+1] % 2 == 0){
            result++;
        }
        else if(a[middle] % 2 == 1 && a[middle+1] % 2 == 1 && a[middle+2] % 2 == 0){
            result++;
        }

        return result;
    }

    static void stampa(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
