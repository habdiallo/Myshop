/**
 * @author habdiallo
 * @version 1.0
 * @since 2022
 */


public class Product {
    private int idProd;
    private String nameProd;
    private int quantityProd;

    @Override
    public String toString() {
        return "Produit----------\n" +
                "idProd :" + idProd + "\n" +
                "nameProd : " + nameProd + "\n" +
                "quantityProd : "  + quantityProd;
    }

    private static int idref;

    public Product(String nameProd, int quantityProd) {
        this.nameProd = nameProd;
        this.quantityProd = quantityProd;
        this.idProd = idref;
        idref++;
    }

    public boolean editQtyProd (int q){
        int res = this.quantityProd + q;
        if( res >= 0) {
            setQuantityProd(res);
            return true;
        }
        return false;
    }
    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public int getQuantityProd() {
        return quantityProd;
    }

    public int setQuantityProd(int quantityProd) {
        this.quantityProd = quantityProd;
        return quantityProd;
    }
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

}
