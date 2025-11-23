public class Conversion {
    public static void main(String[] args) {
        System.out.println(string_to_int("a23 4-5"));}
    public static int string_to_int(String s){
        String b = "";
        int k = 0;
        for(int i = 0; i<s.length();i++){
            if (s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)== '3'|| s.charAt(i)=='4'|| s.charAt(i)=='5'|| s.charAt(i)=='6'|| s.charAt(i)=='7'|| s.charAt(i)=='8'|| s.charAt(i)=='9'|| s.charAt(i)== '0'){
                b = b + s.charAt(i);
            }
        }
        k = Integer.parseInt(b);
        return k;
        
    }
}

