public class Char_percentage_4 {
    void percentage(String s){
        int upper=0;
        int lower=0;
        int integer=0;
        int other =0;
        char ch ;
        for(int i =0;i<s.length();i++){
            ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                upper++;
            }

            else if(Character.isLowerCase(ch)){
                lower++;
            }

            else if(Character.isDigit(ch)){
                integer++;
            }

            else{
                other++;
            }
        }
        System.out.println("Upper case : "+upper+"\n"+"Lower case : "+lower+"\n"+"Integer : "+integer+"\n"+"Other : "+other);
    }
    public static void main (String[] args) {

        Char_percentage_4 c = new Char_percentage_4();
        String s ="Pranav@12345";
        c.percentage(s);

    }
}
