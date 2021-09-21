public class overloading_10 {
    public static void main(String[] args) {

        overloading_10 o = new overloading_10();

        System.out.println(o.operation(2, 3));

        System.out.println(o.operation(5.5d, 5.5d));

        System.out.println(o.operation(5.5f, 5.5f));

        System.out.println(o.operation(2, 5, 0));

        System.out.println(o.operation("Hello", "World"));

        System.out.println(o.operation("Welcome", "Pranav", "Mishra"));
    }

    public int operation(int a, int b) {
        return a + b;
    }
    public double operation(double a, double b) {
        return a + b;
    }
    public float operation(float a, float b) {
        return a * b;
    }
    public int operation(int a, int b, int c) {
        c = a * b;
        return c;
    }
    public String operation(String s1, String s2) {
        s1 += s2;
        return s1;
    }
    public String operation(String s1, String s2, String s3) {
        s1 += s2;
        s1 += s3;
        return s1;
    }
}
