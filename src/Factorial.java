public class Factorial {
    public static int printFactorial(int num){
        if(num==1)
            return 1;
        return (num*printFactorial(num-1));
    }
    public static void main(String[] args) {
        int n=printFactorial(5);
        System.out.println(n);

    }
}
