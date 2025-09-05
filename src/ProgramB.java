
import java.util.Scanner;

public class ProgramB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int treasure = 0;
        int currentSelection = 999;
        int currentRoom = 0;
        boolean loopCheck = true;
        String[] startDialog = {
            "Hej och välkommen till Äventysspelet",
            "Ni kommer utforska en grotta med ett stort tunnelsystem",
            "Ni måste välja rätt väg för att kunna ta er ut",
            "Men akta er för enligt rykten finns det fällor och monster i grottan",
            "Vi står nu utanför grottan och du ska göra ditt första av många beslut",
            "Går du in i grottan eller inte?",
            " ",
            "Var god välj ett alternativ 1 eller 0",
            "(PS ni kan alltid välja noll för att avsluta spelet)",
            " ",
            "1: Gå in i grottan",
            "0: Gå tillbaka till stan (Avslutar spelet)"
        };
        PrintArray(startDialog);

        while (loopCheck) {
            currentSelection = scanner.nextInt();
            switch (currentSelection) {
                case 0:
                    String[] dialog = {
                            "Är ni säkra på att ni vill avsluta? (poäng kommer inte sparas/visas)",
                            " ",
                            "1: Ja, avsluta",
                            "2: Nej, fortsätt"
                    };
                    PrintArray(dialog);

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
                        String[] dialog1 = {
                            "När du går in i grottan märker du hur lite ljus det finns och du tänder din fackla",
                            "Du ser två tydliga tunnelvägar, en till höger och en till vänster",
                            "Vilken väg tar ni?",
                            " ",
                            "2: Gå vänster",
                            "3: Gå höger"
                        };
                        PrintArray(dialog1);

                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 1: Vänstra tunneln från rum 1 till 2
                case 2:
                    if (currentRoom == 1){
                        currentRoom = 2;

                        String[] dialog2 = {
                                "Tunneln leder djupt in innan det öppnar upp sig till ett stort rum med ett stort hål i taket som tillåter månskenet att lysa igenom",
                                "På en vägg finns det en på gränsen till onaturligt rund sten, täkt med en massa mossa och klängväxter",
                                "Det är svårt att se men det är något inristat i stenen som ser ut som en uppochnervänd stol",
                                "Ni ser även en dörr i bergsväggen och en till tunnel vid sidan om",
                                " ",
                 // Hemligt val: 4: Stendörren med en treudd på (rum 4)
                                "5: Ta tunneln",
                                "6: Öppna dörren"
                        };
                        PrintArray(dialog2);


                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 1:Högra tunneln från rum 1 till 3
                case 3:
                    if (currentRoom == 1){
                        currentRoom = 3;

                        String[] dialog3 = {
                                "Du går genom tunneln och stöter på en dörr i sidan av väggen, men tunneln fortsätter även frammåt",
                                " ",
                                "6: Öppna dörren",
                                "7: Fortsätt fram i tunneln"
                        };
                        PrintArray(dialog3);
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 2: Hemligt val, stendörr som leder till skatter
                case 4:
                    if (currentRoom == 2){
                        currentRoom = 4;

                        String[] dialog4 = {
                                "Du blir väldigt nyfiken av stenen och river ner all mossa och växter",
                                "Du ser inte längre en uppochnervänd stol eller en fyra",
                                "Du ser en treudd",
                                " ",
                                "        |   |   |",
                                "        |   |   |",
                                "        |___|___|",
                                "            |",
                                "            |",
                                "            |",
                                "            |",
                                "            |",
                                "            |",
                                " ",
                                "Du kommer ihåg gammla texter om atlantis och dess starka koppling till månen",
                                "Du väntar tills månskenet träffar treudden och den börjar svagt lysa blått",
                                "Stenen ger vika och sjunker som om marken var gjord av vatten, och försvinner helt ner under marken",
                                "Du går genom den nya öppningen och kommer fram till avsatts, nedanför ser du ett hav av skatter, täckt av vatten",
                                "Detta är vad du kommit hit för",
                                " ",
                                "Du vet att skatter och fällor går hand i hand, vad gör du?",
                                " ",
                                "8: Detta känns inte bra, du vänder om och går ut ur grottan",
                                "9: Står still och spejar efter fällor",
                                "10: Går försiktigt runt i rummet och letar efter fällor"
                        };
                        PrintArray(dialog4);

                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 2: Tar tunneln från rum 2 till 5
                case 5:
                    if (currentRoom == 2){
                        currentRoom = 5;
                        String[] dialog5 = {
                                "Ju djupare du går destu mer spindelnät tycker du att det finns",
                                "Det ligger en massa utspridda skatter längs tunneln som lätt åker ner i fickan, men du är lite fundersam till varför de låg där",
                                "Du kommer ut ur tunneln täckt i spindelnät för att mötas av en stor spindel, större än dig själv",
                                "Men den har ryggen vänd och ser ut att vara upptagen med att äta på något",
                                "Du ser även att det ligger mer skatter utspridda mellan dig och spindeln",
                                " ",
                                "Vad vill du göra nu?",
                                " ",
                                "11: Plocka upp skatterna och sen lämna grottan",
                                "12: Nöja dig med de få skatterna du redan hittat och lämna grottan"
                        };
                        PrintArray(dialog5);
                        treasure += 5;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 2: Öppnar dörren från rum 2 eller 3 till 6
                // Rum 3:
                case 6:
                    if (currentRoom == 2 || currentRoom == 3){
                        currentRoom = 6;

                        String[] dialog6 = {
                            "Du kommer in i ett, rum med lite enklare möbler, ett bord och några pallar, två vitrinskåp och några bänkskåp",
                            "Det finns även en eld som knappt har några lågor kvar och en gryta med till synes mat i, som troligen snart kommer brännas",
                            "Någon måste ha varit här nyligen men du ser ingen",
                            "Det ligger en påse på bordet med lite skatter i",
                            " ",
                            "Vad gör du?",
                            " ",
                            "13: Själ skatterna och lämnar grottan",
                            "14: Lämnar grottan men tar lite mat och släcker elden först"
                        };
                        PrintArray(dialog6);

                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 3: Fortsätter i tunneln från rum 3 till 7
                case 7:
                    if (currentRoom == 3){
                        currentRoom = 7;
                        String[] dialog7 = {
                                "Du fortsätter fram i tunneln som blir smalare och smalare och allt svårare att ta sig fram i",
                                "Du kan inte gå vidare frammåt men du kan se skatter genom hålen som du kan komma åt med lite tålamod",
                                "Samtidigt som du ser detta hör du något, nästan som att något kravlar i tunnlarna",
                                " ",
                                "Vad gör du?",
                                " ",
                                "15: Stannar och försöker få tag i skatterna",
                                "16: Ljuden bådar inte bra så du beger dig tillbaka ut ur grottan"
                        };
                        PrintArray(dialog7);

                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 4: Går ut ur grottan (triggar fällan)
                case 8, 10:
                    if (currentRoom == 4){
                        String[] dialog8_10 = {
                                "Så fort du tar ett steg fram hör du ett click!",
                                "Du stod på en fälla hela tiden!",
                                "Det börjar mullra och du ser att stendörren börjar komma upp ur marken igen",
                                "Du springer allt du kan men är inte tillräckligt snabb",
                                "Allt du har till din tröst nu är dina skatter"
                        };
                        PrintArray(dialog8_10);

                        loopCheck = false;
                        treasure += 999999;
                        health = 0;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 4: Spejar efter fällor(överkommer fällan)
                case 9:
                    if (currentRoom == 4){
                        String[] dialog9 = {
                            "Du ser inga fällor runtomkring och ska precis gå fram då du märker att du står på en platta",
                            "En platta som du misstänker kan vara en fälla",
                            "Du samlar ihop de stenar omkring dig som du kan nå och ersätter din vikt med stenarna och kliver av",
                            "..........",
                            "Inget händer",
                            "Du dyker ner och samlar på dig allt du kan bära innan du beger dig tillbaka ut ur grottan"
                        };
                        PrintArray(dialog9);
                        treasure += 50;
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 5: Plockar upp skatterna(besegrar spindeln men dör)
                case 11:
                    if (currentRoom == 5){
                        String[] dialog11 = {
                            "Du lyckas plocka upp majoriteten av skatterna men tappar en och spindeln vänder sig om",
                            "Du slåss för ditt liv och lyckas besegra spindeln",
                            "Du hurrar för din seger och går ut ur grottan med dina välförtjänta skatter",
                            "Fram tills ditt synfält täcks av stengolv medan du ramlar framlänges, förlamad"
                        };
                        PrintArray(dialog11);
                        treasure += 20;
                        health = 0;
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 5: Tappar en skatt men lyckas fly från spindeln
                case 12:
                    if (currentRoom == 5) {
                        String[] dialog12 = {
                                "Du vänder om men tappar en av dina skatter, spindeln vänder sig om och rusar mot dig",
                                "Du lyckas precis komma tillbaka ut i tunneln som är för liten för spindeln att komma in i",
                                "Du flyr grottan så snabbt du kan"
                        };
                        PrintArray(dialog12);
                        treasure -= 1;
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 6: Stjäl skatter
                case 13:
                    if (currentRoom == 6) {
                        System.out.println("Du plockar upp påsen och går ut ur grottan lite rikare än innan");
                        treasure += 10;
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 6: Äter maten
                case 14:
                    if (currentRoom == 6) {
                        System.out.println("Du är ingen tjuv men en bit mat kan man ju ta, den skulle ju bränts om du inte hade kommit");
                        System.out.println("Det smakar för jävligt men det gick ned");
                        health += 999;
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 7: Tar skatterna men blir biten
                case 15:
                    if (currentRoom == 7) {
                        String[] dialog15 = {
                                "Du tänker inte lämna utan något och börjar fiska åt dig skatterna",
                                "Plötsligt känner du att du blir biten av något och drar tillbaka handen",
                                "Det är en spindel nästan lika stor som din egen hand",
                                "Du slänger snabbt av den och tar några steg bak, du ser hur det börjar kravla ut MÅNGA spindlar i samma storlek",
                                "Du springer snabbt ut ur grottan och märker hur hela din arm är förlamad"
                        };
                        PrintArray(dialog15);
                        treasure += 20;
                        health -= 30;
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                // Rum 7: Ljuden bådar inte bra så du beger dig tillbaka ut ur grottan
                case 16:
                    if (currentRoom == 7) {
                        System.out.println("Du beger dig ut ur grottan tomhänt, men det känns som att det nog var bättre än alternativen");
                        loopCheck = false;
                    }
                    else {
                        PrintWrongSelection();
                    }
                    break;
                default:
                    PrintWrongSelection();
            }
        }
        if (currentSelection == 0) {
            System.out.println("Spelet avslutas");
        }

        System.out.println(" ");
        if (health == 0) {
            System.out.println("Du hittade " + treasure + " Skatter!");
            System.out.println("Men kommer tyvärr inte kunna spendera dem");
        } else if (health > 0 && health <= 100) {
            System.out.println("Du kom ut ur grottan levandes");
            System.out.println("Och du hittade " + treasure + " Skatter!");
        } else if (health > 100) {
            String[] ifHighHealth = {
                "Du kom ut ur grottan levandes",
                "Grytan ni åt visade sig vara ett elexir för evigt liv",
                "Om det är en skatt eller förbannelse är upp till dig"
            };
            PrintArray(ifHighHealth);
        }
    }
    static void PrintArray (String[] input){
        for (String x : input){
            System.out.println(x);
        }
    }
    static void PrintWrongSelection (){
        System.out.println("Du gick in i en vägg, försök igen");
    }
}
