public class SommaElementiCompresi {
    public static void main(String[] args) {
        int a[] = {5,20,21,4,30,40,1,5};
        System.out.println(sommaElementiCompresi(a, 3, 18,0,a.length-1));
    }

    //somma gli elementi il cui valore è compreso tra min e max (min e max inclusi)
    static int sommaElementiCompresi(int[] a, int min, int max, int left, int right){
        if(left == right){
            if(a[left] >= min && a[left] <= max){
                return a[left];
            }
            else{
                return 0;
            }
        }
        else{
            int middle = (right + left) / 2;
            int resLeft = sommaElementiCompresi(a, min, max, left, middle);
            int resRight = sommaElementiCompresi(a, min, max, middle+1, right);

            return resLeft + resRight;
        }
    }
}
