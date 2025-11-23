
public class NombreParfaitOrdinauxAnglais {
    public static void main(String[] args){
        String suffixe = "";
        boolean estParfait = false;
        String message = "";
        int[] series = {6, 15, 28, 42, 12};
        for(int i = 0; series.length>i ; i++){
            suffixe = printOrdinal(series[i]);
            estParfait = isPerfect(series[i]);
            if(estParfait == true){
                message = "(PARFAIT!)";
            
            }else{
                message = "";
            }
            System.out.println(series[i] + suffixe + " " + message );


        }

    }
    public static String printOrdinal(int nb){
        String a = String.valueOf(nb);
        if (a.length()-1 == 0){
            if (a.charAt(a.length()-1) == '1') {
                return "st";
            
            }
            else if ( a.charAt(a.length()-1) == '2'){
                return "nd";
            }
            else if ( a.charAt(a.length()-1) == '3'){
                return "rd";
            }
            else{
                return "th";
            }
        }else{
        
                if(a.charAt(a.length()-2) == '1' ){
                    return "th";
                }
                else if (a.charAt(a.length()-1) == '1') {
                    return "st";
                    
                }
                else if ( a.charAt(a.length()-1) == '2'){
                    return "nd";
                }
                else if ( a.charAt(a.length()-1) == '3'){
                    return "rd";
                }
                else{
                    return "th";
                }
            }
        
        }
        public static boolean isPerfect(int n){
        int a = 0;
        for(int b =1; n>b; b++){
            if (n%b == 0){
                a = a +b;
            }}
        if( a == n){
            return true;
        
        }else{
            return false;
        }

    
    }
}
