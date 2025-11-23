

public class MiniCalculatrice {
    public static void main(String[] args){
        double c = Math.round( executerOperation(10, 5, "+"));
        double w =  Math.round(executerOperation(20, 7, "-"));
        double m =  Math.round(executerOperation(4, 3, "*"));
        double e =  Math.round(executerOperation(10, 10, "0"));
        double t =  Math.round(executerOperation(10, 0.0, "/"));
        double d = Math.round(executerOperation(10.0, 3.0, "/"));

        System.out.println(c + "   "  + w + "   " + m + "   " + e + "   " + t + "   " + d ) ;

    }
    public static double executerOperation(double a, double b, String operateur){
        switch (operateur) {
            case "/":
                if (b == 0){
                    return -9999;
                }else{
                    return a/b;
                }

            case "+":
                return a + b;
                
            case "-": 
                 return a - b;
            
            case "*":
                return a*b;
            
            default:
                return -9999;
        }


    }
}