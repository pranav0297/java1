public class Char_percentage_4 {
    void percentage(String s){
        int upper=0;
        int lower=0;
        int integer=0;
        int other =0;
        char ch ;
        double p_upper;
        double p_lower;
        double p_integer;
        double p_other;
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
        p_upper = ((double)upper)/s.length()*100;
        p_lower = ((double)lower)/s.length()*100;
        p_integer = ((double)integer)/s.length()*100;
        p_other = ((double)other)/s.length()*100;
        
        System.out.println("Upper case : "+upper+" ,"+p_upper+"\n"+"Lower case : "+lower+" ,"+p_lower+"\n"+"Integer : "+integer+" ,"+p_integer+"\n"+"Other : "+other+" ,"+p_other);
    }
    public static void main (String[] args) {

        Char_percentage_4 c = new Char_percentage_4();
        String s ="Pranav@12345";
        c.percentage(s);

    }
}
