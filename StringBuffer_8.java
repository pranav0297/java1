import java.util.*;
public class StringBuffer_8 {

    void reverse (String s){
        StringBuffer sb = new StringBuffer();

        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }

        System.out.println("Reverse String is = "+sb);

        sb.delete(4,10);
        System.out.println("String after deletion = "+sb);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        
        StringBuffer_8 m = new StringBuffer_8();

        m.reverse(s);
    }
}
