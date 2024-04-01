// Write a code to reverse a number

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int c = a[start];
            a[start] = a[end];
            a[end] = c;
            start++;
            end--;
        }
        
        // Printing reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

        
    
