import java.util.Scanner;
import dedicnost.Ferrari;
import dedicnost.Audi;
import dedicnost.Fabia;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ferrari ferrari = new Ferrari(700, 8000000, "červená");
        Audi audi = new Audi(500, 1000000, "hnědá metalíza");
        Fabia fabia = new Fabia(9000, 4000000, "nehořlavá");

        ferrari.jizdaStart();
        audi.jizdaStart();
        fabia.jizdaStart();

        System.out.println("Ferrari:");
        ferrari.vypisInfo();
        System.out.println("Audi:");
        audi.vypisInfo();
        System.out.println("Fabia:");
        fabia.vypisInfo();


    }
}