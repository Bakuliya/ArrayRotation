
import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Given array: " + Arrays.toString(array));
        try {
            System.out.print("Enter the number of positions to rotate to the left: ");
            int positions = scanner.nextInt();
            if (positions < 0) {
                throw new IllegalArgumentException("Negative rotation is not supported.");
            }
            rotateArray(array, positions);
            System.out.println("Rotated array: " + Arrays.toString(array));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static void rotateArray(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n;
        int[] temp = Arrays.copyOf(arr, n);
        for (int i = 0; i < n; i++) {
            arr[i] = temp[(i + positions) % n];
        }
    }
}
