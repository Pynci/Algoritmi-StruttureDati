public class ContaSequenzeBinarie {
    public static void main(String[] args) {
        int[] array = {1,1,1,0,1,1,1,0,1};
        System.out.println(count1001(array,0,array.length-1));
    }

    static int count1001(int[] a, int left, int right){
        if(right - left < 3){
            return 0;
        }
        int middle = (right + left) / 2;
        int res1 = count1001(a,left, middle);
        int res2 = count1001(a,middle+1, right);
        int result = res1 + res2;
        boolean firstCheck = a[middle-1] == 1 && a[middle] == 0 && a[middle+1] == 0 && a[middle+2] == 1;
        boolean secondCheck = a[middle-2] == 1 && a[middle-1] == 0 && a[middle] == 0 && a[middle+1] == 1;
        boolean thirdCheck = a[middle] == 1 && a[middle+1] == 0 && a[middle+2] == 0 && a[middle+3] == 1;

        if(firstCheck || secondCheck || thirdCheck){
            result++;
        }

        return result;
    }
}
