import java.util.Scanner;

public class Week2_PalindromeChecker {
    
    public static boolean checkPalindrome(String word){
        
        word = word.toLowerCase().replaceAll("//w", " ");

        int left = 0;
        int right = word.length()-1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
        }else{
            left++;
            right--;
        }
    }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        scanner.close();

        checkPalindrome(word);

        if(checkPalindrome(word) == false){
            System.out.println(word + " is not a Palindrome");
        }else{
            System.out.println(word + " is a Palindrome");
        }

    }
}
