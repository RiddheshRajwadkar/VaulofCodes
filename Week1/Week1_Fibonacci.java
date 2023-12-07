public class Week1_Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }else{
            int a = 0;
            int b = 1;
            int result = 0;

            for(int i=2; i<=n; i++){
                result = a+b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 14;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }

}
