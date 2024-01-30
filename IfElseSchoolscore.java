import java.util.Scanner;

public class IfElseSchoolscore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welk is het resultaat op 20");
        float resultaat = input.nextFloat();
        char letter;

        if (resultaat>0 && resultaat <=20) {
            if (resultaat >=12) {
                letter = 'A';
                System.out.println(" je score is " + letter);
            } else if ( resultaat <10) {
                letter = 'C';
                System.out.println(" je score is " + letter);
            }
            else {
                letter = 'B';
                System.out.println(" je score is " + letter);

            }

        } else {
            System.out.println( "je hebt een foute waarde ingegeven");


        }


        }


    }

