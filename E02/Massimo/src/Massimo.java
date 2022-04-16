public class Massimo {
    public static void main(String[] args) {
        int[] a = {5,6,14,50,101,34,100,21,7,0};
        System.out.println(maximum(a,0,a.length-1));
    }

    static int maximum(int[] a, int left, int right){
        if(left == right){
            return a[left];
        }
        else{
            int middle = (left + right) / 2;
            int maxLeft = maximum(a, left, middle);
            int maxRight = maximum(a, middle+1, right);

            if(maxLeft > maxRight){
                return maxLeft;
            }
            else{
                return maxRight;
            }
        }
    }
}
