package collectionsAndStreams;

import java.util.Objects;

public class Book {

    private String title;
    private double price;
    private double discountedPrice;

    public Book(String title, double price, double discountedPrice) {
        this.title = title;
        this.price = price;
        this.discountedPrice = discountedPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, discountedPrice);
    }

    @Override
    public String toString() {
        return "CollectionsAndStreams.Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", discountedPrice=" + discountedPrice +
                '}';
    }
}
