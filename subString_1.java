public class subString_1 {
    public String replace(String s , String sub_string, String re_sub_string){

        s= s.replace(sub_string,re_sub_string);
        return s;
    }
    public static void main (String[] args) {
        subString_1 ss = new subString_1();

        String s1 = "Pranav Mishra is an IOS Developer";
        String s2 = "IOS";
        String s3 = "JAVA";
        System.out.println(ss.replace(s1,s2,s3));
    }
}
