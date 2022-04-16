public class TrovaBBA {
    public static void main(String[] args) {
        char array[] = {'b','b','d','c','a','b','b','b'};
        System.out.println(findBBA(array,0, array.length-1));
    }

    static int findBBA(char[] a, int left, int right){
        if(right - left < 2){
            return 0;
        }
        else{
            int middle = (left + right) / 2;
            int freqRight = findBBA(a, left, middle);
            int freqLeft = findBBA(a, middle+1, right);
            int result = freqLeft + freqRight;

            boolean firstCond = a[middle-1] == 'b' && a[middle] == 'b' && a[middle+1] == 'a';
            boolean secondCond = a[middle] == 'b' && a[middle+1] == 'b' && a[middle+2] == 'a';

            if(firstCond || secondCond){
                return result+1;
            }
            else{
                return result;
            }
        }
    }
}
