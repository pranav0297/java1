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
        int[] arr1= { 1,2,3,4,5};

        int[] arr2 = {3,4,5,3,6,7,8};
        CommonElemet_5 ce = new CommonElemet_5();
        System.out.println("Duplicate number are");
        ce.common(arr1, arr2);
    }
}
