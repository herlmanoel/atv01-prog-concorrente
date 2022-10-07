package entities;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Product {
    @JsonProperty("id")
    int id;

    @JsonProperty("title")
    String title;

    @JsonProperty("description")
    String description;

    @JsonProperty("price")
    int price;

    @JsonProperty("discountPercentage")
    double discountPercentage;

    @JsonProperty("rating")
    double rating;

    @JsonProperty("stock")
    int stock;

    @JsonProperty("brand")
    String brand;

    @JsonProperty("category")
    String category;

    @JsonProperty("thumbnail")
    String thumbnail;

    @JsonProperty("images")
    ArrayList < String > images;

    public ArrayList < String > getImages() {
        return this.images;
    }
    public void setImages(ArrayList < String > images) {
        this.images = images;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getRating() {
        return this.rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}