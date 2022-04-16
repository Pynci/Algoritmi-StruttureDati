public class Media {
    public static void main(String[] args) {
        int a[] = {2,2,3,3,4,4,5,5,5};
        System.out.println(average(a, 0, a.length-1));
    }

    static double average(int[] a, int left, int right){
        if(left == right){
            return a[left];
        }
        else{
            int middle = (left + right) / 2;
            double avgLeft = average(a, left, middle);
            double avgRight = average(a, middle+1, right);

            //so che è un maialaio, ma per qualche motivo senza parentesi inutili non andava una madonna
            double avg = ((avgLeft * (middle - left + 1)) + (avgRight * ((right - (middle+1) + 1))))/(right - left + 1);
            return avg;
        }
    }
}