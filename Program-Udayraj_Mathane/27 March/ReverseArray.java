import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Original Array:");
        printArray(array);

        int[] reversedArray = reverseArray(array);

        System.out.println("\nReversed Array:");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            reversedArray[start] = arr[end];
            reversedArray[end] = arr[start];

            start++;
            end--;
        }
        if (start == end) {
            reversedArray[start] = arr[start];
        }
        return reversedArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}