import java.util.Scanner;

public class pan {
    
    public static boolean isPangram(String input) {
         int totalAlphabets = 26;
        boolean[] alphabetPresent = new boolean[26];
       

        
        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                int index = a - 'A';
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true;
                    totalAlphabets--;
                    if (totalAlphabets == 0) {
                        return true; 
                    }
                }
            }
        }
            return false;
        }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    
}
}
    
