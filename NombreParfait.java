package portfolio;
public class NombreParfait{
    public static void main(String[] args) {
        divisor(60);
        enumPerfect(50);
                }
    public static void divisor(int n){
            for(int b = 1; n>b ; b++){
                if(n%b == 0){
                    System.out.println(b);
            }}
            }
    public static void isPerfect(int n){
        int a = 0;
        for(int b =1; n>b; b++){
            if (n%b == 0){
                a = a +b;
            }}
        if( a == n){
            System.out.println(n + " est parfait");
        }

        

}      

    public static void enumPerfect(int m){
        for (int z = 1; m >= z; z++){
            isPerfect(z
            );

    
        
    }
        
    

    
    
    }
}


