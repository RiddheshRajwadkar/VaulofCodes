public class Week1_ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index: "+ e.getMessage());
        }
        
        int result = divide(10, 2);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

}
