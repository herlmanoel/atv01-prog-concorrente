package entities;

import java.util.ArrayList;

public class List {

    public int id;
    public String title;
    public String description;
    public int price;
    public double discountPercentage;
    public double rating;
    public int stock;
    public String brand;
    public String category;
    public String thumbnail;
    public ArrayList<String> images;

    @Override
    public String toString() {
        return "List{" +
                "id=" + id + "," +
                "title=" + title + "," +
                "description=" + description + "," +
                "price=" + price + "," +
                "discountPercentage=" + discountPercentage + "," +
                "rating=" + rating + "," +
                "stock=" + stock + "," +
                "brand=" + brand + "," +
                "category=" + category + "," +
                "thumbnail=" + thumbnail + "," +
                "images=" + images +
                '}';
    }
}
