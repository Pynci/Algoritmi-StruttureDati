public class Conta10 {
    public static void main(String[] args) {
        int array[] = {1,1,0,0,0,1,0,1,1,0,1,0,1};
        System.out.println(count10(array,0, array.length-1));
    }

    static int count10(int[] a, int left, int right){
        if(left == right){
            return 0;
        }
        else{
            int middle = (left + right) / 2;
            int numLeft = count10(a,left, middle);
            int numRight = count10(a, middle+1, right);
            int result = numLeft + numRight;

            if(a[middle] == 1 && a[middle+1] == 0){
                return result+1;
            }
            else{
                return result;
            }
        }
    }
}
