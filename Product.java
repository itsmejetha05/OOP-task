// 1. You are developing an e-commerce application and need to implement a Product class. The Product class should have 
// private instance variables for the product name, product ID, and price. Implement getter and setter methods for these 
// variables, ensuring that the price cannot be negative. Additionally, include a private variable to track the stock quantity 
// and provide public methods to update the stock when a product is purchased or restocked.

public class Product {
    // Private instance variables
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productName, String productId, double price, int stockQuantity) {
        this.productName = productName;
        this.productId = productId;
        setPrice(price); // Use setter to ensure validation
        this.stockQuantity = stockQuantity;
    }

    // Getter and Setter for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter for productId
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    // Getter for stockQuantity
    public int getStockQuantity() {
        return stockQuantity;
    }

    // Method to update stock when a product is purchased
    public void purchaseProduct(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Purchase quantity must be greater than zero.");
        }
        if (quantity > stockQuantity) {
            throw new IllegalArgumentException("Insufficient stock.");
        }
        stockQuantity -= quantity;
    }

    // Method to restock the product
    public void restockProduct(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Restock quantity must be greater than zero.");
        }
        stockQuantity += quantity;
    }

    // Optional: toString method for easy printing
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
