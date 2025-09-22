public class Power {
    public static int power(int n,int x){
        if(x==0){
            return 1;
        }
        return n*power(n,x-1);

    }

    public static void main(String[] args) {
       int n=power(2,3) ;
        System.out.println(n);
    }
}
