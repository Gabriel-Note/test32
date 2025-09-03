import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

    }
}
