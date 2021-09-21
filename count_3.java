public class count_3 {
    public static void main(String[] args) {
        count_3 c = new count_3();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch + " occure " + c.occurence(s, ch) + " times in the string");
    }

    public int occurence(String s, char ch) {
        int len = s.length();
        s = s.replace("a", "");

        int len1 = len - s.length();
        return len1;
    }

}
