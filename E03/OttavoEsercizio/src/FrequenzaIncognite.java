public class FrequenzaIncognite {
    public static void main(String[] args) {
        int[] a = {77,4,23,67,54,76,8,9,23,7,5,9,21,41,76};
        System.out.println(freqTwo(a, 9, 23, 0, a.length-1));
    }

    static int freqTwo(int[] a, int x, int y, int left, int right){
        if(left == right){
            return 0;
        }
        else{
            int middle = (right + left) / 2;
            int freqLeft = freqTwo(a, x, y, left, middle);
            int freqRight = freqTwo(a, x, y, middle+1, right);

            if(a[middle] == x && a[middle+1] == y){
                return freqLeft + freqRight + 1;
            }
            else{
                return freqLeft + freqRight;
            }
        }
    }
}
