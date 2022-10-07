package entities;

import com.fasterxml.jackson.annotation.JsonProperty; 
public class Rain{
    @JsonProperty("3h") 
    public double _3h;

    @Override
    public String toString() {
        return "Rain{" +
                "_3h=" + _3h +
                '}';
    }
}
