package entities;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
    @JsonProperty("products")
    ArrayList < Product > products;

    @JsonProperty("total")
    int total;

    @JsonProperty("skip")
    int skip;

    @JsonProperty("limit")
    int limit;

    public int getLimit() {
        return this.limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public int getSkip() {
        return this.skip;
    }
    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getTotal() {
        return this.total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList < Product > getProducts() {
        return this.products;
    }
    public void setProducts(ArrayList < Product > products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Root{" +
                "products=" + products +
                ", total=" + total +
                ", skip=" + skip +
                ", limit=" + limit +
                '}';
    }
}