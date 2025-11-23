public class OrdinauxAnglais {
    public static void main(String[] args) {
        printOrdinal(43);
        printOrdinal(12);
        printOrdinal(1);
        printOrdinal(2);

        
    }

    public static void printOrdinal(int nb){
        String a = String.valueOf(nb);
        if (a.length()-1 == 0){
            if (a.charAt(a.length()-1) == '1') {
            System.out.println(nb +"st");
            
            }
            else if ( a.charAt(a.length()-1) == '2'){
                System.out.println(nb + "nd");
            }
            else if ( a.charAt(a.length()-1) == '3'){
                System.out.println(nb + "rd");
            }
            else{
                System.out.println(nb + "th");
            }
        }else{
        
                if(a.charAt(a.length()-2) == '1' ){
                    System.out.println(nb +"th");
                }
                else if (a.charAt(a.length()-1) == '1') {
                    System.out.println(nb +"st");
                    
                }
                else if ( a.charAt(a.length()-1) == '2'){
                    System.out.println(nb + "nd");
                }
                else if ( a.charAt(a.length()-1) == '3'){
                    System.out.println(nb + "rd");
                }
                else{
                    System.out.println(nb + "th");
                }
        
        }}


    }
    

