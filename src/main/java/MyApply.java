public class MyApply {
    public static void main(String[] args) {
        String choix;
        Myshop.printMenu();
        choix = Myshop.saisieChaine();

        while (true) {
            assert choix != null;
            if (choix.equals("q")) break;
            switch (choix) {
                case "1":
                    Myshop.createStock();
                    break;
                case "2":
                    Myshop.addProduct();
                    break;
                case "3":
                    Myshop.printProduct();
                    break;
                case "4":
                    Myshop.addQtyProd();
                    break;
                case "5":
                    System.out.println("choix 5");
                    break;
                default:
                    System.out.println("choix incorrect!");
            }
            Myshop.printMenu();
            choix = Myshop.saisieChaine();
        }
    }
}
