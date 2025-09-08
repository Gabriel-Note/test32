public class FoodProducts {

    String[] product = {
            "Mjölk",
            "Bröd",
            "Ägg",
            "Smör"
    };
    int[] productPrice = {
            15, // Mjölk
            25, // Bröd
            30, // Ägg
            45  // Smör
    };
    int[] cart = {
            0,
            0,
            0,
            0
    };
    int[] total = {
            0,
            0,
            0,
            0
    };

    public boolean validInputs (int i){
        boolean result = switch (i) {
            case 1, 2, 3, 4 -> true;
            default -> false;
        };
        return result;
    }

    public void printSelection(){
        System.out.println("1. Visa varor och handla");
        System.out.println("2. Visa varukorg");
        System.out.println("3. Betala");
        System.out.println("4. Avsluta");
    }
    public void printStoreItemsAndPrice(){
        String format4_2 = "%-10s%s%n";
        for (int i = 0; i < product.length; i++) {
            System.out.printf(
                    format4_2,
                    i + 1 + ". " + product[i] + ": ",
                    productPrice[i] + " kr"
            );
        }
        System.out.println("0. För att gå tillbaka");
    }

    public void printReceipt(int row) {
        String format4_2 = "%-18s%s%n";
        System.out.printf(
                format4_2,
                cart[row] + "x " + product[row] + " à " + productPrice[row] + " kr",
                "= " + total[row] + " kr"
        );

    }

    public void printCart(){
        String format4_2 = "%-10s%s%n";
        for (int i = 0; i < product.length; i++) {
            System.out.printf(
                    format4_2,
                    i + 1 + ". " + product[i] + ": ",
                    cart[i] + " st"
            );
        }

    }
    public void printInvalidInput (){
        System.out.println("Ogiltigt val");
        System.out.println("");
    }



}
