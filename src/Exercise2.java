import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Övning 2.1

        System.out.println("Skriv ert namn: ");
        String name2_1 = scanner.nextLine();
        System.out.println("Skriv er ålder: ");
        String age2_1 = scanner.nextLine();
        System.out.println("Skriv var ni bor: ");
        String placeOfResidence = scanner.nextLine();
        System.out.println("Hej " + name2_1 + " välkommen till " + placeOfResidence + "! (trotts att ni är " + age2_1 + " år gammal.");


        // Övning 2.2

        String format2_2 = "%-24s%s%n";

        System.out.println("Ange två tal så kan jag räkna ut summan, produkten och genomsnittet av dessa till dig");
        System.out.println("Ange första nummret: ");
        float x = scanner.nextFloat();
        System.out.println("Ange andra nummret: ");
        float y = scanner.nextFloat();
        float sum = x + y;
        float product = x * y;
        float average = sum/2;
        System.out.printf(format2_2, "Summan: ",sum);
        System.out.printf(format2_2, "Produkten: ",product);
        System.out.printf(format2_2, "Genomsnittet: ",average);
        System.out.println(" ");


        //Övning 2.3

        String format2_3 = "%-15s%s%n";

        System.out.println("lokal valutakonverterare från SEK till EUR och USD");
        System.out.println("Ange ett belopp i SEK som ni vill konvertera");
        float money = scanner.nextFloat();
        float euro = money * 0.085f;
        float dollar = money * 0.091f;
        System.out.println(money + " SEK konverteras till: ");
        System.out.printf(format2_3, euro,"EUR");
        System.out.printf(format2_3, dollar,"USD");

    }
}
