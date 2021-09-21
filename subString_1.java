public class subString_1 {
    public String replace(String s , String sub_string, String re_sub_string){

        s= s.replace(sub_string,re_sub_string);
        return s;
    }
    public static void main (String[] args) {
        subString_1 ss = new subString_1();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.nextLine();

        System.out.println("Enter the Sub String: ");
        String s2 = sc.nextLine(); 

        System.out.println("Enter the Replace String: ");
        String s3 = sc.nextLine();
        System.out.println(ss.replace(s1,s2,s3));
    }
}
