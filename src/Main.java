import com.sun.source.tree.WhileLoopTree;

import javax.sound.midi.MidiFileFormat;
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

            int selection5_1 = scanner.nextInt();
            int k;
            switch (selection5_1) {
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



        // Övning 5.2

        System.out.println("För vilket nummer vill ni ha en multiplikationstabell?");
        System.out.println("ange ett heltal (funkar bäst för 1-10)");
        int multiplicationNumber = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            int result = i * multiplicationNumber;
            System.out.println(i + " * " + multiplicationNumber + " = " + result);
        }



        // Övning 5.3

        int secretNumber = 42;

        System.out.println("Gissa det hemliga nummret mellan 1-100 (heltal)");
        int guess = 0;
        while (guess != secretNumber) {
            guess = scanner.nextInt();
            if (guess > secretNumber) {
                System.out.println("För högt");
            } else if (guess < secretNumber) {
                System.out.println("för lågt");
            } else {
                System.out.println("Mitt i prick");
            }
        }




        // Övning 6.1

        System.out.println("Välkommen, Gör ett val för att komma vidare");
        boolean loopCheck6_1 = true;
        while (loopCheck6_1) {
            System.out.println(" ");
            System.out.println("1 för att räkna ut arean av en rektangel");
            System.out.println("2 för att räkna ut arean av en cirkel");
            System.out.println("3 för att avsluta programmet");
            int selection6_1 = scanner.nextInt();
            double result6_1 = 0;
            switch (selection6_1) {
                case 1:
                    System.out.println("Ange första sidans längd");
                    double sideA = scanner.nextDouble();
                    System.out.println("Ange andra sidans längd");
                    double sideB = scanner.nextDouble();
                    result6_1 = sideA * sideB;
                    System.out.println("Arean är " + result6_1 + " (" + sideA + " * " + sideB + ")");
                    break;
                case 2:
                    System.out.println("Ange cirkelns radie");
                    double radius6_1 = scanner.nextDouble();
                    result6_1 = Math.PI * radius6_1 * radius6_1;
                    System.out.println("Arean av cirkeln är " + result6_1);
                    break;
                case 3:
                    System.out.println("Tack för att ni använde vår areaberäknare");
                    loopCheck6_1 = false;
                    break;
            }
        }



        // Övning 6.2

        System.out.println("Ange ålder (mellan 1-120): ");
        int age6_2;
        String tryAgain = "";
        do {
            System.out.println(tryAgain);
            tryAgain = "Ogiltigt, ange din ålder igen (1-120)";
            age6_2 = scanner.nextInt();
        } while (age6_2 < 1 || age6_2 > 120);
        System.out.println("Er ålder är " + age6_2);


        // Program A: Interaktiv quiz

        System.out.println("Välkommen till den triviala quizzen");
        System.out.println("Varje fråga kommer ha 4 alternativ mellan siffrorna 1-4");
        System.out.println("Vänligen ange det alternativet som passar bäst genom att trycka på tillhörande siffra på vänster sida (1-4)");
        System.out.println("");
        boolean loopCheck = true;
        int currentAnswer;
        int correctAnswer1 = 2;
        int correctAnswer2 = 1;
        int correctAnswer3 = 4;
        int correctAnswer4 = 1;
        int correctAnswer5 = 2;
        int numberOfCorrectAnswers = 0;
        String grade = "Ej tilldelad än";
        boolean allCorrect = false;
        // Fråga  1
        System.out.println("Fråga 1: vad är 1+4?");
        System.out.println(" ");
        System.out.println("1:    4");
        System.out.println("2:    5");
        System.out.println("3:    14");
        System.out.println("4:    1");
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 1, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer1 + " var rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                case 2:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 2
        System.out.println("Fråga 2: Vad är 4/0");
        System.out.println(" ");
        System.out.println("1:    Det går inte");
        System.out.println("2:    0");
        System.out.println("3:    Oändligt");
        System.out.println("4:    40");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 2, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer2 + " var rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                case 1:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 3
        System.out.println("Fråga 3: Vad är 7*8");
        System.out.println(" ");
        System.out.println("1:    49");
        System.out.println("2:    63");
        System.out.println("3:    78");
        System.out.println("4:    56");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 1, 2, 3:
                    System.out.println("Tyvärr, nummer " + correctAnswer3 + " var rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                case 4:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 4
        System.out.println("Fråga 4: Vad är 3-4");
        System.out.println(" ");
        System.out.println("1:    -1");
        System.out.println("2:    34");
        System.out.println("3:    0");
        System.out.println("4:    1");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 2, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer4 + " var rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                case 1:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 5
        System.out.println("Fråga 5: Vad är 10% av 100");
        System.out.println(" ");
        System.out.println("1:    1");
        System.out.println("2:    10");
        System.out.println("3:    0,1");
        System.out.println("4:    110");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 1, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer5 + " var rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                case 2:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println("");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Resultat och betyg
        switch (numberOfCorrectAnswers){
            case 0:
                grade = "F";
                break;
            case 1:
                grade = "E";
                break;
            case 2:
                grade = "D";
                break;
            case 3:
                grade = "C";
                break;
            case 4:
                grade = "B";
                break;
            case 5:
                grade = "A";
                allCorrect = true;
                break;
            default:
                System.out.println("Omöjligt betyg, något fuffens försigår");
        }
        System.out.println("Tack för att ni tog mitt quiz, här kommer ert resultat");
        if (allCorrect){
            System.out.println("Grattis! Ni fick rätt på alla frågor! Betyg " + grade + "!");
        }
        else {
            System.out.println(numberOfCorrectAnswers + "/5 rätta svar, vilket ger er betyget " + grade + "!");
        }

         */
        // Program B

        int health = 100;
        int treasure = 0;
        int currentSelection = 999;
        int currentRoom = 0;
        boolean loopCheck = true;
        System.out.println("Hej och välkommen Äventysspelet");
        System.out.println("Ni kommer utforska en grotta med ett stort tunnelsystem");
        System.out.println("Ni måste välja rätt väg för att kunna ta er ut");
        System.out.println("Men akta er för enligt rykten finns det fällor och monster i grottan");
        System.out.println("Vi står nu utanför grottan och du ska göra ditt första av många beslut");
        System.out.println("går du in i grottan eller inte?");
        System.out.println("");
        System.out.println("Var god välj ett alternativ 1 eller 0");
        System.out.println("(PS ni kan alltid välja noll för att avsluta spelet)");
        System.out.println("");
        System.out.println("1: Gå in i grottan");
        System.out.println("0: Gå tillbaka till stan (Avslutar spelet)");
        while (loopCheck) {
            currentSelection = scanner.nextInt();
            switch (currentSelection) {
                case 0:
                    System.out.println("Är ni säkra på att ni vill avsluta? (poäng kommer inte sparas/visas)");
                    System.out.println("");
                    System.out.println("1: Ja, avsluta");
                    System.out.println("2: Nej, fortsätt");
                    currentSelection = scanner.nextInt();
                    if (currentSelection == 1){
                        currentSelection = 0;
                        loopCheck = false;
                    }
                    break;
                // Första rummet (starten på spelet)
                case 1:
                    if (currentRoom == 0){
                        currentRoom = 1;
                        System.out.println("När du går in i grottan märker du hur lite ljus det finns och du tänder din fackla");
                        System.out.println("Du ser två tydliga tunnelvägar, en till höger och en till vänster");
                        System.out.println("Vilken väg tar ni?");
                        System.out.println("");
                        System.out.println("2: Gå vänster");
                        System.out.println("3: Gå höger");
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 1: Vänstra tunneln från rum 1 till 2
                case 2:
                    if (currentRoom == 1){
                        currentRoom = 2;
                        System.out.println("Tunneln leder djupt in innan det öppnar upp sig till ett stort rum med ett stort hål i taket som tillåter månskenet att lysa igenom");
                        System.out.println("På en vägg finns det en på gränsen till onaturligt rund sten, täkt med en massa mossa och klängväxter");
                        System.out.println("Det är svårt att se men det är något inristat i stenen som ser ut som en uppochnervänd stol");
                        System.out.println("Ni ser även en dörr i bergsväggen och en till tunnel vid sidan om");
                        System.out.println("");
                        // Hemligt val: 4 för att komma till rum 4
                        System.out.println("5: Ta tunneln");
                        System.out.println("6: Öppna dörren");
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 1:Högra tunneln från rum 1 till 3
                case 3:
                    if (currentRoom == 1){
                        currentRoom = 3;
                        System.out.println("Du går genom tunneln och stöter på en dörr i sidan av väggen, men tunneln fortsätter även frammåt");
                        System.out.println("");
                        System.out.println("6: Öppna dörren");
                        System.out.println("7: Fortsätt fram i tunneln");
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 2: Hemligt val, stendörr som leder till skatter
                case 4:
                    if (currentRoom == 2){
                        currentRoom = 4;
                        System.out.println("Du blir väldigt nyfiken av stenen och river ner all mossa och växter");
                        System.out.println("Du ser inte längre en uppochnervänd stol eller en fyra");
                        System.out.println("Du ser en treudd");
                        System.out.println("");
                        System.out.println("        |   |   |");
                        System.out.println("        |   |   |");
                        System.out.println("        |___|___|");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("");
                        System.out.println("Du kommer ihåg gammla texter om atlantis och dess starka koppling till månen");
                        System.out.println("Du väntar tills månskenet träffar treudden och den börjar svagt lysa blått");
                        System.out.println("Stenen ger vika och sjunker som om marken var gjord av vatten, och försvinner helt ner under marken");
                        System.out.println("Du går genom den nya öppningen och kommer fram till avsatts, nedanför ser du ett hav av skatter, täck av vatten");
                        System.out.println("Detta är vad du kommit hit för");
                        System.out.println("");
                        System.out.println("Du vet att skatter och fällor går hand i hand, vad gör du?");
                        System.out.println("");
                        System.out.println("8: Detta känns inte bra, du vänder om och går ut ur grottan");
                        System.out.println("9: Står still och spejar efter fällor");
                        System.out.println("10: Går försiktigt runt i rummet och letar efter fällor");

  //-------------------------System.out.println("BEHÖVER UPPDATERAS!!");----------------------------------------------------------
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 2: Tar tunneln från rum 2 till 5
                case 5:
                    if (currentRoom == 2){
                        currentRoom = 5;
                        System.out.println("Ju djupare du går destu mer spindelnät tycker du att det finns");
                        System.out.println("Det ligger en massa utspridda skatter längs tunneln som lätt åker ner i fickan, men du är lite fundersam till varför de låg där");
                        System.out.println("Du kommer ut ur tunneln täckt i spinelnät för att mötas av en stor spindel, större än dig själv");
                        System.out.println("Men den har ryggen vänd och ser ut att vara upptagen med att äta på något");
                        System.out.println("Du ser även att det ligger mer skatter utspridda mellan dig och spindeln");
                        System.out.println("");
                        System.out.println("Vad vill du göra nu?");
                        System.out.println("");
                        System.out.println("11: Plocka upp skatterna och sen lämna grottan");
                        System.out.println("12: Nöja dig med de få skatterna du redan hittat och lämna grottan");
                        treasure += 5;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 2: Öppnar dörren från rum 2 eller 3 till 6
                // Rum 3:
                case 6:
                    if (currentRoom == 2 || currentRoom == 3){
                        currentRoom = 6;
                        System.out.println("Du kommer in i ett rum med lite enklare möbler, ett bord och några pallar, två vitrinskåp och några bänkskåp");
                        System.out.println("Det finns även en eld som knappt har några lågor kvar och en gryta med till synes mat i, som troligen snart kommer brännas");
                        System.out.println("Någon måste ha varit här nyligen men du ser ingen");
                        System.out.println("Det ligger en påse på bordet med lite skatter i");
                        System.out.println("");
                        System.out.println("Vad gör du?");
                        System.out.println("");
                        System.out.println("13: Själ skatterna och lämnar grottan");
                        System.out.println("14: Lämnar grottan men tar lite mat och släcker elden först");
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 3: Fortsätter i tunneln från rum 3 till 7
                case 7:
                    if (currentRoom == 3){
                        currentRoom = 7;
                        System.out.println("Du fortsätter fram i tunneln som blir smalare och smalare och allt svårare att ta sig fram i");
                        System.out.println("Du kan inte gå vidare frammåt men du kan se skatter genom hålen som du kan komma åt med lite tålamod");
                        System.out.println("Samtidigt soom du ser detta hör du något, nästan som att något kravlar i tunnlarna");
                        System.out.println("");
                        System.out.println("Vad gör du?");
                        System.out.println("");
                        System.out.println("15: Stannar och försöker få tag i skatterna");
                        System.out.println("16: Ljuden bådar inte bra så du beger dig tillbaka ut ur grottan");
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 4: Går ut ur grottan (triggar fällan)
                case 8, 10:
                    if (currentRoom == 4){
                        System.out.println("Så fort du tar ett steg fram hör du ett click!");
                        System.out.println("Du stod på en fälla hela tiden!");
                        System.out.println("Det börjar mullra och du ser att stendörren börjar komma upp ur marken igen");
                        System.out.println("Du springer allt du kan men är inte tillräckligt snabb");
                        System.out.println("Allt du har till din tröst nu är dina skatter");
                        loopCheck = false;
                        treasure += 999999;
                        health = 0;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 4: Spejar efter fällor(överkommer fällan)
                case 9:
                    if (currentRoom == 4){
                        System.out.println("Du ser inga fällor runtomkring och ska precis gå fram då du märker att du står på en platta");
                        System.out.println("En platta som du misstänker kan vara en fälla");
                        System.out.println("Du samlar ihop de stenar omkring dig som du kan nå och ersätter din vikt med stenarna och kliver av");
                        System.out.println("..........");
                        System.out.println("Inget händer");
                        System.out.println("Du dyker ner och samlar på dig allt du kan bära innan du beger dig tillbaka ut ur grottan");
                        treasure += 50;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 5: Plockar upp skatterna(besegrar spindeln men dör)
                case 11:
                    if (currentRoom == 5){
                        System.out.println("Du lyckas plocka upp majoriteten av skatterna men tappar en och spindeln vänder sig om");
                        System.out.println("Du slåss för ditt liv och lyckas besegra spindeln");
                        System.out.println("Du hurrar för din seger och går ut ur grottan med dina välförtjänta skatter");
                        System.out.println("Fram tills ditt synfält täcks av stengolv medan du ramlar framlänges, förlamad");
                        treasure += 20;
                        health = 0;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 5: Tappar en skatt men lyckas fly från spindeln
                case 12:
                    if (currentRoom == 5) {
                        System.out.println("Du vänder om men tappar en av dina skatter, spindeln vänder sig om och rusar mot dig");
                        System.out.println("Du lyckas precis komma ttillbaka ut i tunneln som är för liten för spindeln att komma in i");
                        System.out.println("Du flyr grottan så snabbt du kan");
                        treasure -= 1;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 6: Stjäl skatter
                case 13:
                    if (currentRoom == 6) {
                        System.out.println("Du plockar upp påsen och går ut ur grottan lite rikare än innan");
                        treasure += 10;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 6: Äter maten
                case 14:
                    if (currentRoom == 6) {
                        System.out.println("Du är ingen tjuv men en bit mat kan man ju ta, den skulle ju bränts om du inte hade kommit");
                        System.out.println("Det smakar för jävligt men det gick ned");
                        health += 999;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 7: Tar skatterna men blir biten
                case 15:
                    if (currentRoom == 7) {
                        System.out.println("Du tänker inte lämna utan något och börjar fiska åt dig skatterna");
                        System.out.println("Plötsligt känner du att du blir biten av något och drar tillbaka handen");
                        System.out.println("Det är en spindel nästan lika stor som din egen hand");
                        System.out.println("Du slänger snabbt av den och tar några steg bak, du ser hur det börjar kravla ut MÅNGA spindlar i samma storlek");
                        System.out.println("Du springer snabbt ut ur grottan och märker hur hela din arm är förlamad");
                        treasure += 20;
                        health -= 30;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 7: Ljuden bådar inte bra så du beger dig tillbaka ut ur grottan
                case 16:
                    if (currentRoom == 7) {
                        System.out.println("Du beger dig ut ur grottan tomhänt, men det känns som att det nog var bättre än alternativen");
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                default:
                    System.out.println("Du gick in i en vägg, försök igen");
            }
        }
        if (currentSelection == 0){
            System.out.println("Spelet avslutas");
        }

        System.out.println("ni kom ut yay");
    }
}






