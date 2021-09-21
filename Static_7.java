public class Static_7 {

    static String First_Name;
    static String Last_Name;
    static int Age;


    static String First_name ="Mayank";
    static String Last_name="Mishra";
    static int age=23;


    //static block
    static{
        System.out.println("print by static block -------");
        First_Name = "Pranav";
        Last_Name = "Mishra";
        Age = 24;
    }


    //static method
    public static void print(String f_name, String l_name, int agee){
        System.out.println("print by static Method-------");

        System.out.println("First name : "+f_name+"\n"+"Last name : "+l_name+"\n"+"age : "+agee);

    }
    public static void main (String[] args) {

        //by static block
        System.out.println("First Name : "+First_Name+"\n"+"Last Name : "+Last_Name+"\n"+"Age : "+Age+"\n");


        //by static variable
        System.out.println("print by static variable -------");
        System.out.println("First name : "+First_name+"\n"+"Last name : "+Last_name+"\n"+"age : "+age+"\n");


        //by static method
        print("PS","Mishra",22);

    }
}
