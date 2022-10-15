import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/**
 * @author habdiallo
 * @version 1.0
 * @since 2022
 */
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
    private final ArrayList <Product> products;

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

    /**
     *
     * @param pdct
     * @return
     */
    public boolean addProductToList(Product pdct){
        if (returnProduct(pdct.getNameProd())==null){
            products.add(pdct);
            return true;
        }
        return false;
    }

    /**
     * Return un produit s'il existe dans la liste, sinon retourn null
     * @param nameP
     * @return
     */
    public Product returnProduct(String nameP){
        ListIterator<Product> listIterator = products.listIterator();
        while (listIterator.hasNext()){
            Product prod = listIterator.next();
            if (prod.getNameProd().equals(nameP))
                return prod;
        }
        return null;
    }

}
