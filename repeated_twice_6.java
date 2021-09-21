import java.util.*;
public class repeated_twice_6 {
    public static void main(String[] args) {
        
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input in array: ");
        for(int i=0;i<9;i++) {
            arr [i] = sc.nextInt();
        }
        repeated_twice_6 rt = new repeated_twice_6();
        System.out.println("the element occure single time is : "+rt.xor(arr));
    }

    public int xor(int[] arr) {
        int store_xor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            store_xor ^= arr[i];

        }
        return store_xor;
    }
}
