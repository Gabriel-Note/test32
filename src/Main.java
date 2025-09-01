import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //Scan.nextline() kommer vänta på ett input från användaren
        //String fullName = scan.nextLine();

        //övning 1.2
        /*
        double x = 5;
        double y = 8;
        double area = x * y;
        double omkrets = x * 2 + y * 2;
        String format1_2 = "%-30s%s%n";
        //System.out.println("Arean för rummet är: " + "\t" + area + " kvadratmeter");
        //System.out.println("Omkretsen för rummet är: " + "\t" + omkrets + " meter");
        System.out.printf(format1_2, "Arean för rummet är: ",area + " kvadratmeter");
        System.out.printf(format1_2, "Omkretsen för rummet är: ",omkrets + " meter");
        System.out.printf(format1_2, "Omkretsen för rummet är: ",omkrets + " meter");
        System.out.println(" ");

        //övning 1.3

        String format1_3 = "%-24s%s%n";
        String name1_3 = "Gabriel Note";
        int age1_3 = 31;
        int numberOfSiblings = 2;
        String favoriteFood = "Ramen";
        double height = 1.86;
        boolean iLikeCoffe = false;
        System.out.println("lite om mig");
        System.out.printf(format1_3, "Namn: ",name1_3);
        System.out.printf(format1_3, "Favoritmat: ",favoriteFood);
        System.out.printf(format1_3, "Ålder: ",age1_3);
        System.out.printf(format1_3, "Antal syskon: ",numberOfSiblings);
        System.out.printf(format1_3, "Höjd: ",height + " m");
        System.out.printf(format1_3, "Jag gillar kaffe: ",iLikeCoffe);
        System.out.println(" ");

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

        // Övning 3.1

        System.out.println("Ålderskontroll");
        System.out.println("Ange er ålder: ");

        int age3_1 = scanner.nextInt();
        System.out.println("Okej, om ni är " + age3_1 + " eller över så får ni: ");
        if (age3_1 >= 18) {
            System.out.println("köra bil!");
            }
        else {
            System.out.println("INTE köra bil!");
        }
        if (age3_1 >= 20) {
            System.out.println("köpa alkohol!");
        }
        else {
            System.out.println("INTE köpa alkohol!");
        }
        if (age3_1 >= 20) {
            System.out.println("gå på Systembolaget!");
        }
        else {
            System.out.println("INTE gå på Systembolaget!");
        }
        if (age3_1 >= 65) {
            System.out.println("gå i pension!");
        }
        else {
            System.out.println("INTE gå i pension!");
        }



        // Övning 3.2

        System.out.println("Hur många poäng fick ni på provet?");
        int score = scanner.nextInt();
        if (score > 89){
            System.out.println("Betyg A, Grattis ni fick ett toppenbetyg!");
        }
        if (score > 79 && score <= 89){
            System.out.println("Betyg B, Grattis ni fick ett toppenbetyg!");
        }
        if (score > 69 && score <= 79){
            System.out.println("Betyg C, Grattis ni blev godkänd!");
        }
        if (score > 59 && score <= 69){
            System.out.println("Betyg D, Grattis ni blev godkänd!");
        }
        if (score < 60){
            System.out.println("Betyg F, nu får ni ha kul med att lära er mer!");
        }




        // Övning 3.3

        //Scanner scanner2 = new Scanner(System.in);

        System.out.println("Vad är temperaturen idag? (°C)");
        double temp3_3 = scanner.nextDouble();
        if (temp3_3 < 0){
            System.out.println("Ta på dig vinterjacka!");
        }
        if (temp3_3 >= 0 && temp3_3 < 10){
            System.out.println("Kläd dig varmt!");
        }
        if (temp3_3 >= 10 && temp3_3 < 20){
            System.out.println("Perfekt väder för en hoodie!");
        }
        if (temp3_3 >= 20){
            System.out.println("Shorts-väder!");
        }



        // Övning 4.1

        System.out.println("För att logga in som administratör vänligen ange användarnamn och lösenord");
        System.out.print("Användarnamn: ");
        String usernamne4_1 = scanner.next();
        System.out.print("Lösenord: ");
        String password4_1 = scanner.next();
        if (usernamne4_1.equals("admin") && password4_1.equals("password123")){
            System.out.println("Välkommen admin!");
        }
        else {
            System.out.println("Fel användarnamn eller lösenord");
        }



        //Övning 4.2

        String format4_2 = "%-20s%s%n";

        System.out.print("Vad kostar varan? ");
        double price4_2 = scanner.nextDouble();
        System.out.print("Är ni student? ");
        String isStudent4_2 = scanner.next().trim();
        System.out.print("Är ni medlem? ");
        String isMember4_2 = scanner.next().trim();
        int discount4_2 = 0;
        if (isStudent4_2.equalsIgnoreCase("ja") && isMember4_2.equalsIgnoreCase("ja")){
            discount4_2 = 15;
            System.out.println("Ni är student och medlem");
        }
        else if (isMember4_2.equalsIgnoreCase("ja")) {
            discount4_2 = 5;
            System.out.println("Ni är endast medlem");
        }
        else if (isStudent4_2.equalsIgnoreCase("ja")){
            discount4_2 = 10;
            System.out.println("Ni är endast student");
        }
        double finalPrice4_2 = price4_2 * (double) (100 - discount4_2) / 100;
        System.out.printf(format4_2, "Originalpris:",price4_2 + " kr");
        System.out.printf(format4_2,"Rabatt:", discount4_2 + "%");
        System.out.printf(format4_2,"Rabatterat pris:", finalPrice4_2 + " kr");



        // Övning 5.1

        boolean loopCheck = true;
        while (loopCheck){
            System.out.println("Ange ett nummer för vad ni vill göra");
            System.out.println("1 för att räkna från 1 till 10");
            System.out.println("2 för att räkna från 10 till 1");
            System.out.println("3 för att räkna alla jämna tal från 2 till 20");
            System.out.println("4 för att summera alla tal från 1 till 100");
            System.out.println("0 för att avsluta programmet");

            int selection = scanner.nextInt();
            int k;
            switch (selection) {
                case 0:
                    System.out.println("Tack för att ni använde räknaren");
                    loopCheck = false;
                    break;
                case 1:
                    System.out.println("Du valde nummer 1");
                    k = 1;
                    while (k <= 10) {
                        System.out.println(k);
                        k++;
                    }
                    break;
                case 2:
                    System.out.println("Du valde nummer 2");
                    k = 10;
                    while (k >= 1) {
                        System.out.println(k);
                        k--;
                    }
                    break;
                case 3:
                    System.out.println("Du valde nummer 3");
                    for (k = 2; k <= 20; k += 2){
                        System.out.println(k);
                    }
                    break;
                case 4:
                    System.out.println("Du valde nummer 4");
                    int sum = 0;
                    for (k = 1; k <= 100; k++){
                        sum += k;
                    }
                    System.out.println("Totala summan är " + sum);
                    break;
                default:
                    System.out.println("Ogiltigt val!");
            }

        }

         */

        // Övning 5.2




    }
}