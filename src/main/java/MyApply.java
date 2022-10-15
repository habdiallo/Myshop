public class MyApply {
    /**
     * @author habdiallo
     * @version 2.0
     * @since 2022
     */
    public static void main(String[] args) {
        String choix;
        Myshop.printMenuPrincipal();
        choix = Myshop.saisieChaine();

        while (true) {
            assert choix != null;
            if (choix.equals("q")) break;
            switch (choix) {
                case "1":
                    Myshop.createStock();
                    break;
                case "2":
                    Myshop.manageStock();
                    break;
                default:
                    System.out.println("choix incorrect!");
            }
            Myshop.printMenuPrincipal();
            choix = Myshop.saisieChaine();
        }
    }
}
