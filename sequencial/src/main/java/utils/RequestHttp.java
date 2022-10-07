package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Root;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestHttp {
    private String url;
    public HttpRequest createUrl() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.url))
                .header("accept", "application/json")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return request;
    }

    public RequestHttp(String url) {
        this.url = url;
    }

    public Root getData () {
        HttpResponse<String> response = null;
        Root root = new Root();
        try {
            response = HttpClient.newHttpClient().send(createUrl(), HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
            root = mapper.readValue(response.body(), new TypeReference<Root>() {});
            return root;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Root();
    }
}
