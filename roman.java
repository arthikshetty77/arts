import java.util.Scanner;

public class roman {

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;

            if (current >= next) {
                result += current;
            } else {
                result += (next - current);
                i++; 
            }
        }

        return result;
    }

    public static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; 
        }
    }

        public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String romanNumber = scanner.nextLine().toUpperCase(); // Convert to uppercase for case insensitivity
        scanner.close();

        int result = romanToInt(romanNumber);
        System.out.println("Integer representation: " + result);
    }
}






    
