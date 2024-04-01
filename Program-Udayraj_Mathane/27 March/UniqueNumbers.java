
import java.util.*;
public class UniqueNumbers {


    public static void main(String[] args) {
        int[] array = {4, 2, 7, 5, 2, 4, 8, 1, 5};
        
        Set <Integer> uniqueSet = new HashSet<>();
        
        for (int num : array) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num);
            }
        }
        
        System.out.println("Unique numbers in the array:");
        for (int uniqueNum : uniqueSet) {
            System.out.println(uniqueNum);
        }
    }
}


