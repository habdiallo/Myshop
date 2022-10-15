import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;


/**
 * @author habdiallo
 * @version 1.0
 * @since 2022
 */
public class Myshop {

    public static ArrayList <Stock> stocks = new ArrayList<>();

    public static void createStock () {
        System.out.println("Saisissez le nom du Stock");
        String nameSt = saisieChaine();
        System.out.println("Saisissez l'adresse du Stock");
        String addressSt = saisieChaine();
        Stock st = new Stock(nameSt, addressSt);
        stocks.add(st);
        System.out.println("Stock créer avec succés");
    }

    /**
     * Ajouter un produit dans un stock
     */
    public static void addProduct() {
        System.out.println("Choissez le nom stock");
        String nameStk = saisieChaine();
        Stock st = returnStock(nameStk);
        if (st != null) {
            System.out.println("saisissez le nom du produit");
            String nameP = saisieChaine();
            System.out.println("saisissez la quantité du produit");
            int qty = Integer.parseInt(Objects.requireNonNull(saisieChaine()));
            Product product = new Product(nameP, qty);
            if (st.addProductToList(product)){
                System.out.println("produit ajouter avec succés");
            }
            else {
                System.out.println("Le produit existe deja, voulez vous modifier la quantité");
            }
        } else {
            System.out.println("Le stock saisie n'existe pas");
        }
    }


    /**
     * Ajouter/Retirer une quantité à un produit s'il existe dans le stock
     */
    public static void addQtyProd() {
        System.out.println("Choissez le nom stock");
        String nameStk = saisieChaine();
        Stock st = returnStock(nameStk);
        if ( st != null){
            System.out.println("Saisissez le nom du produit");
            String name = saisieChaine();
            if (st.returnProduct(name) != null) {
                System.out.println("Saisissez quantité que vous voulez ajouter");
                int qty = Integer.parseInt(Objects.requireNonNull(saisieChaine()));
                if (st.returnProduct(name).editQtyProd(qty)) {
                    System.out.println(st.returnProduct(name).getQuantityProd());
                } else
                    System.out.println("pas assez de produit dans le stock pour supprimer la valeur inserer");
            } else
                System.out.println("Ce produit n'existe pas dans le stock");
        } else System.out.println("Le stock saisie n'existe pas");
    }

    /**
     * Afficher les details d'un produit
     */
    public static void printProduct (){
        System.out.println("Choissez le nom stock");
        String nameStk = saisieChaine();
        Stock st = returnStock(nameStk);
        if (st != null){
            System.out.println("Saisissez le nom du produit");
            String name = saisieChaine();
            if (st.returnProduct(name)==null)
                System.out.println("Ce produit n'existe pas dans le stock");
            else {
                System.out.println(st);
                System.out.println(st.returnProduct(name));
            }
        }else System.out.println("Le stock saisie n'existe pas");
    }

    /**
     * Retourner un stock s'il existe ou null
     * @param nameStk Recuppere le nom du stock saisie par l'utilisateur
     * @return retourne n ou null
     */
    public static Stock returnStock(String nameStk){
        for(Stock n : stocks){
            if (n.getNameStock().equals(nameStk))
                return n;
        }
        return null;
    }

    /**
     * MENU PRINCIPAL
     */
    public static void printMenu () {
        System.out.println("--------------------------------Menu-------------------------------------");
        System.out.println("          1. Creer un stock                                               ");
        System.out.println("          2. Ajouter des produits au Stock                                ");
        System.out.println("          3. Affricher les caracteristiques d'un produit                  ");
        System.out.println("          4. Ajouter/ Retirer une quantité d'un produit                   ");
        System.out.println("          Q. Quiter                           ");
    }

    /**
     * SAISIE DE CHAINE
     * @return la chaine saisie
     */
    public static String saisieChaine () {
        try {
            BufferedReader buff = new BufferedReader
                    (new InputStreamReader(System.in));
            return buff.readLine();
        }
        catch(IOException e) {
            System.out.println(" impossible de travailler"
                    +e);
            return null;
        }
    }

}
