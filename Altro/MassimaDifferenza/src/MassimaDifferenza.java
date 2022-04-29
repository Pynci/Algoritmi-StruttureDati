public class MassimaDifferenza {
    public static void main(String[] args) {
        int a[] = {5,20,60,4,30,40,1,5,6};
        System.out.println(maxDiff(a,0,a.length-1));
    }

    static int maxDiff(int[] a, int left, int right){
        if(right - left < 2){
            return a[right] - a[left];
        }
        else{
            int middle = (left + right) / 2;
            int res1 = maxDiff(a,left,middle);
            int res2 = maxDiff(a,middle+1,right);

            int max = findMax(a,middle,right);
            int min = findMin(a,left,middle);
            int result = max - min;

            if(result > res1 && result > res2){
                return result;
            }
            else if(res1 > res2){
                return res1;
            }
            else{
                return res2;
            }
        }
    }

    static int findMax(int[] a, int middle, int right){
        int max = a[middle+1];
        int index = middle+1;

        while(index <= right){
            if(a[index] > max){
                max = a[index];
            }
            index++;
        }

        return max;
    }

    static int findMin(int[] a, int left, int middle){
        int min = a[left];
        int index = left;

        while(index <= middle){
            if(a[index] < min){
                min = a[index];
            }
            index++;
        }

        return min;
    }
}
