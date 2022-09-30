package services;

import entities.Task;
import utils.RequestHttp;

import java.util.List;

public class TaskService {
    private String url;

    public TaskService() {
        this.url = "https://jsonplaceholder.typicode.com/todos/";
    }

    public List<Task> findAll() {
        RequestHttp request = new RequestHttp(url);
        return request.getData();
    }
}
