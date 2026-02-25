import java.util.Random;
import java.util.Scanner;
import Personajes.Personaje;
import Personajes.ScarletWitch;
import Personajes.VictorVonDoom;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        ScarletWitch wanda = new ScarletWitch("Wanda", 100);
        VictorVonDoom doom = new VictorVonDoom("Doctor Doom", 100, "Energy Blast", "Power up of Molecule Man",
                "Magic Guard" );

        System.out.println("After the disasters due to incursions around multiverse, there was no hope for our heroes, but at the end of all \n" +
                "one man stands up against the responsibles of the incursions. Thanks to Doctor Strange and Molecule Man, Victor Von Doom was able to absorb and control \n" +
                "one of the biggest powers on the multiverse, Beyonders power.");

        System.out.println("Suddenly, there was no caos, only a world reigned by Victor Von Doom.");
        System.out.println("Doom, with Beyonder's power, created \n");

        System.out.println("####    ###   #####  #####  #      #####  #     #   ###   ####   #      #### ");
        System.out.println("#   #  #   #    #      #    #      #      #     #  #   #  #   #  #      #   #");
        System.out.println("####   #####    #      #    #      ###    #  #  #  #   #  ####   #      #   #");
        System.out.println("#   #  #   #    #      #    #      #      ## # ##  #   #  # #    #      #   #");
        System.out.println("####   #   #    #      #    #####  #####   #   #    ###   #  #   #####  #### ");

        System.out.println();

        System.out.println("After 3 years, a group of heroes that survived to the end of all, raised up against Doom, but only one was able to face Doom");
        System.out.println(wanda.getName() + " also well-known as Scarlet Witch");
        System.out.println("The battle for restore the multiverse begins");

        int turn = 1;
        boolean battle = true;
        int whoBegin = random.nextInt(2);

        while (battle) {
            System.out.println("Turn " + turn);

            if (whoBegin == 0) {
                System.out.println(wanda.getName() + " starts the battle");
            } else {
                System.out.println(doom.getName() + " starts the battle");
            }

            
        }
    }
}
