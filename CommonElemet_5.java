import java.util.*;
public class CommonElemet_5 {

    public void common(int[] arr1,int[] arr2)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input in array1: ");
        for(int i=0;i<5;i++) {
             arr1 [i] = sc.nextInt();
        }
        System.out.println("Enter the input in array2: ");
        for(int i=0;i<5;i++) {
            arr2 [i] = sc.nextInt();
        }
        
        CommonElemet_5 ce = new CommonElemet_5();
        System.out.println("Duplicate number are");
        ce.common(arr1, arr2);
    }
}
