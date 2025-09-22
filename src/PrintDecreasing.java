public class PrintDecreasing {
   public static void printDecreasingnum(int num){
       if(num==0){
           return;
       }
        System.out.println(num);
        printDecreasingnum(num-1);
    }

    public static void main(String[] args) {
printDecreasingnum(5);

    }
}