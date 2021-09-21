public class enum_9 {
    public static void main(String[] args) {
        for (House h : House.values()) {
            System.out.println(h + " = " + h.getPrice());
        }

    }
}

