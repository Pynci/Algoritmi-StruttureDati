public class SommaEspressione {
    public static void main(String[] args) {
        int a[] = {5,20,21,4,30,40,1,5};
        System.out.println(sumOfMult(a,0,a.length-1));
    }

    static int sumOfMult(int[] a, int left, int right){
        if(left == right-1){
            return a[left] * a[left+1];
        }
        else{
            int middle = (left + right) / 2;
            int resLeft = sumOfMult(a,left,middle);
            int resRight = sumOfMult(a,middle+1,right);
            int result = a[middle] * a[middle+1];

            return result + resRight + resLeft;
        }
    }

}
