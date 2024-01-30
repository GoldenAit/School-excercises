import java.util.Scanner;

public class LettersinArray {
    public static void main(String[] args) {
        System.out.println(" geef het woord in");
        Scanner input = new Scanner(System.in);
        String naam = input.nextLine();
        int woordLengt = naam.length();
        char[]lettersVanWoord = new char[woordLengt];

        for ( int i=0; i<woordLengt;  i++){
        lettersVanWoord[i]= naam.charAt(i);

        }
        
        for (int i=0; i<lettersVanWoord.length ; i++){
            System.out.print(lettersVanWoord[i]);
        }
    }
}
