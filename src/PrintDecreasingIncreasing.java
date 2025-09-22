public class PrintDecreasingIncreasing {
    public static void printDecreasingIncreasing(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printDecreasingIncreasing(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
printDecreasingIncreasing(5);
    }
}
