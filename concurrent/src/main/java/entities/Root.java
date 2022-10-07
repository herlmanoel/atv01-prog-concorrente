package entities;

import java.util.ArrayList;

public class Root {
    public ArrayList<List> products;
    public int total;
    public int skip;
    public int limit;

    @Override
    public String toString() {
        return "Root{" +
                "products='" + products + '\'' +
                ", total=" + total +
                ", skip=" + skip +
                ", limit=" + limit +
                '}';
    }
}
