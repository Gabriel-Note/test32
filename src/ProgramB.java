
import java.util.Scanner;

public class ProgramB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int treasure = 0;
        int currentSelection = 999;
        int currentRoom = 0;
        boolean loopCheck = true;
        System.out.println("Hej och välkommen till Äventysspelet");
        System.out.println("Ni kommer utforska en grotta med ett stort tunnelsystem");
        System.out.println("Ni måste välja rätt väg för att kunna ta er ut");
        System.out.println("Men akta er för enligt rykten finns det fällor och monster i grottan");
        System.out.println("Vi står nu utanför grottan och du ska göra ditt första av många beslut");
        System.out.println("Går du in i grottan eller inte?");
        System.out.println(" ");
        System.out.println("Var god välj ett alternativ 1 eller 0");
        System.out.println("(PS ni kan alltid välja noll för att avsluta spelet)");
        System.out.println(" ");
        System.out.println("1: Gå in i grottan");
        System.out.println("0: Gå tillbaka till stan (Avslutar spelet)");
        while (loopCheck) {
            currentSelection = scanner.nextInt();
            switch (currentSelection) {
                case 0:
                    System.out.println("Är ni säkra på att ni vill avsluta? (poäng kommer inte sparas/visas)");
                    System.out.println(" ");
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
                        System.out.println(" ");
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
                        System.out.println(" ");
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
                        System.out.println(" ");
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
                        System.out.println(" ");
                        System.out.println("        |   |   |");
                        System.out.println("        |   |   |");
                        System.out.println("        |___|___|");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println("            |");
                        System.out.println(" ");
                        System.out.println("Du kommer ihåg gammla texter om atlantis och dess starka koppling till månen");
                        System.out.println("Du väntar tills månskenet träffar treudden och den börjar svagt lysa blått");
                        System.out.println("Stenen ger vika och sjunker som om marken var gjord av vatten, och försvinner helt ner under marken");
                        System.out.println("Du går genom den nya öppningen och kommer fram till avsatts, nedanför ser du ett hav av skatter, täckt av vatten");
                        System.out.println("Detta är vad du kommit hit för");
                        System.out.println(" ");
                        System.out.println("Du vet att skatter och fällor går hand i hand, vad gör du?");
                        System.out.println(" ");
                        System.out.println("8: Detta känns inte bra, du vänder om och går ut ur grottan");
                        System.out.println("9: Står still och spejar efter fällor");
                        System.out.println("10: Går försiktigt runt i rummet och letar efter fällor");
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
                        System.out.println(" ");
                        System.out.println("Vad vill du göra nu?");
                        System.out.println(" ");
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
                        /*
                        String[] dialog = {
                                "hejsamn \n",
                                "akbfknsdfs"
                        };
                        for (String s : dialog){
                            System.out.println(s);
                        }
                        */
                        System.out.println("Du kommer in i ett rum med lite enklare möbler, ett bord och några pallar, två vitrinskåp och några bänkskåp");
                        System.out.println("Det finns även en eld som knappt har några lågor kvar och en gryta med till synes mat i, som troligen snart kommer brännas");
                        System.out.println("Någon måste ha varit här nyligen men du ser ingen");
                        System.out.println("Det ligger en påse på bordet med lite skatter i");
                        System.out.println(" ");
                        System.out.println("Vad gör du?");
                        System.out.println(" ");
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
                        System.out.println("Samtidigt som du ser detta hör du något, nästan som att något kravlar i tunnlarna");
                        System.out.println(" ");
                        System.out.println("Vad gör du?");
                        System.out.println(" ");
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
                        loopCheck = false;
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
                        loopCheck = false;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 5: Tappar en skatt men lyckas fly från spindeln
                case 12:
                    if (currentRoom == 5) {
                        System.out.println("Du vänder om men tappar en av dina skatter, spindeln vänder sig om och rusar mot dig");
                        System.out.println("Du lyckas precis komma tillbaka ut i tunneln som är för liten för spindeln att komma in i");
                        System.out.println("Du flyr grottan så snabbt du kan");
                        treasure -= 1;
                        loopCheck = false;
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
                        loopCheck = false;
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
                        loopCheck = false;
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
                        loopCheck = false;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                // Rum 7: Ljuden bådar inte bra så du beger dig tillbaka ut ur grottan
                case 16:
                    if (currentRoom == 7) {
                        System.out.println("Du beger dig ut ur grottan tomhänt, men det känns som att det nog var bättre än alternativen");
                        loopCheck = false;
                    }
                    else {
                        System.out.println("Du gick in i en vägg, försök igen");
                    }
                    break;
                default:
                    System.out.println("Du gick in i en vägg, försök igen");
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
            System.out.println("Du kom ut ur grottan levandes");
            System.out.println("Grytan ni åt visade sig vara ett elexir för evigt liv");
            System.out.println("Om det är en skatt eller förbannelse är upp till dig");
        }
    }
}
