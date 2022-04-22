public class PrimoParziale {
    public static void main(String[] args) {
        int[] V = {5,30,2,9,8};
        int[] W = {10,12,30,2,9};
        System.out.println(algoritmo(V,W,0,V.length-1));
    }

    static int algoritmo(int[] v, int[] w, int l, int r){
        if(l==r){
            return 0;
        }
        else{
            int mid = (l + r) / 2;
            int res1 = algoritmo(v,w,l,mid);
            int res2 = algoritmo(v,w,mid+1,r);
            if(v[mid] == w[mid+1] && v[mid]%2==0){
                return res1+res2+1;
            }
            else{
                return res1+res2;
            }
        }
    }
}
