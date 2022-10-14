import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Stock {
    @Override
    public String toString() {
        return "Stock----------\n" +
                "nameStock= " + nameStock + "\n" +
                "addressStock= " + addressStock + "\n";
                //"tabProd =" + Arrays.toString(tabProd);
    }

    private String nameStock;
    private String addressStock;
    private ArrayList <Product> products;

    public String getNameStock() {
        return nameStock;
    }

    public void setNameStock(String nameStock) {
        this.nameStock = nameStock;
    }

    public String getAddressStock() {
        return addressStock;
    }

    public void setAddressStock(String addressStock) {
        this.addressStock = addressStock;
    }

    public Stock(String nameStock, String addressStock) {
        this.nameStock = nameStock;
        this.addressStock = addressStock;
        this.products = new ArrayList<>();
    }

    public boolean createProduct(){
        System.out.println("Saisissez le nom du produit");
        String nameP = saisieChaine();
        if (returnProduct(nameP) == null){
            System.out.println("Saisissez quantité du produit");
            int qty = Integer.parseInt(saisieChaine());
            Product pd = new Product(nameP, qty);
            products.add(pd);
            return true;
        }

        return false;
    }

    public Product returnProduct(String nameP){
        for(Product n : products){
            if (n !=null && n.getNameProd().equals(nameP))
                return n;
        }
        return null;
    }

    public static String saisieChaine () {
        try {
            BufferedReader buff = new BufferedReader
                    (new InputStreamReader(System.in));
            String chaine=buff.readLine();
            return chaine;
        }
        catch(IOException e) {
            System.out.println(" impossible de travailler"
                    +e);
            return null;
        }
    }



}
