import java.util.Arrays;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int[] shuff = Arrays.copyOf(arr, arr.length);
        random(shuff);

        System.out.println("Shuffled Array: " + Arrays.toString(shuff));
    }

    public static void random(int[] arr) {
        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}