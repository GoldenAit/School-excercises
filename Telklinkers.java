import java.util.Scanner;

public class Telklinkers {
    public static void main(String[] args) {
        System.out.println(" geef je woord in ");
        Scanner input = new Scanner(System.in);
        String woord = input.nextLine();
        System.out.println(woord);
        int lengtewoord = woord.length();
        char karaktertest = woord.charAt(2);
        System.out.println(lengtewoord);
        System.out.println(karaktertest);
        int Telklinkers = 0;
        for (int i = 0; i< lengtewoord; i++){
            System.out.println(woord.charAt(i));
            if (karaktertest == 'i' || karaktertest == 'I' ){
                Telklinkers = Telklinkers +1 ;

            }
        }

        System.out.println(" aantal i : " +Telklinkers);
    }

}
