package exercises.more;

public class Prodotto {
    private String productName;
    private double productPrice;
    private int productStock;

    public Prodotto(String productName, double productPrice, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return this.productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public void sale(int quantityBeingBought) {
        if (productStock >= quantityBeingBought) {
            productStock = productStock - quantityBeingBought;
            System.out.println("Thank you for your purchase!");
        } else {
            System.out.println("We apologise. There is insufficient stock available. Please contact Customer Care.");
        }
    }

    @Override
    public String toString() {
        return "{" +
                " productName='" + getProductName() + "'" +
                ", productPrice='" + getProductPrice() + "'" +
                ", productStock='" + getProductStock() + "'" +
                "}";
    }

}
