public class count_3 {
    public static void main(String[] args) {
        count_3 c = new count_3();

        String s = "Pranav Mishra";
        char ch = 'a';
        System.out.println(ch + " occure " + c.occurence(s, ch) + " times in the string");
    }

    public int occurence(String s, char ch) {
        int len = s.length();
        s = s.replace("a", "");

        int len1 = len - s.length();
        return len1;
    }

}
