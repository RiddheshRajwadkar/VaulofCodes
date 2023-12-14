import java.util.ArrayList;
import java.util.Scanner;

public class Week2_ListManipulation {
    
    public static void Manipulate(ArrayList<Integer>numbers, int list) {
        for(int i=0; i<numbers.size(); i++){
            numbers.set(i, numbers.get(i)*numbers.get(i));
        }

        System.out.println("After manipulation: ");
        System.out.println(numbers);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of list and the numbers: ");
        int list = scanner.nextInt();//First enter the amount of number you want to enter
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<list; i++ ){
        numbers.add(scanner.nextInt());
        }

        System.out.println("Before manipulation: ");
        System.out.println(numbers);

        Manipulate(numbers, list);
        scanner.close();
    }
}
