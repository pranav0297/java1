import java.util.*;
public class Duplicate_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        Duplicate_2 d = new Duplicate_2();
        d.words(s);
    }
    void words(String s) {
        String[] s1 = s.split(" ");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            count = 1;
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    count++;
                    s1[j] = "0";
                }
            }
            if (count > 1 && s1[i] != "0") {
                System.out.println(s1[i] + " repeated " + count + " times");
            }
        }
    }
}
