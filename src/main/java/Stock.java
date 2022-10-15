import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


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
     *
     * @param nameP
     * @return
     */
    public Product returnProduct(String nameP){
        for(Product n : products){
            if (n !=null && n.getNameProd().equals(nameP))
                return n;
        }
        return null;
    }

}
