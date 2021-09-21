public class repeated_twice_6 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3,4};
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
