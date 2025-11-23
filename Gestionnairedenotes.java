public class portfolio2 {



    public static void main(String[] args){
        int[] notes = {18, 12, 9, 15, 4, 20};
        for(int i = 0; i<notes.length; i++){
            char b = calculerGrade(notes[i]);
            String a = Appreciation(b);
            System.out.println(notes [i] + " : " + b + " ("+a+")");
        }
    }
    

    public static char calculerGrade(int note){
        if(note >= 16){
            return 'A';


        }else if(note >= 14){
            return 'B';
        }else if (note >= 12){
            return 'C';
        }else if (note >= 10){
            return 'D';
        }else{
            return 'F';
        }
        }
    public static String Appreciation(char grade){
        switch (grade){
            case 'A' : return "Excellent";
            case 'B' : return "Très bien";
            case 'C' : return "Bien";
            case 'D' : return "Passable";
            case 'F' : return "Insuffisant";
            default : return "erreur";
    }
    
        

}
}

