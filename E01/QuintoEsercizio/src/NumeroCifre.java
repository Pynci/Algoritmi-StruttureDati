public class NumeroCifre {
    public static void main(String[] args) {
        System.out.println(count(998337));
    }

    static int count(int value){

        if(value < 0){
            return 0;
        }
        else if(value < 10){
            return 1;
        }
        else{
            return 1 + count(value/10);
        }
    }
}
