package services;

import entities.CalculatorTime;
import entities.Task;
import utils.RequestHttp;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final String url;
    private List<CalculatorTime> calculatorTimes;
    private String name;

    public TaskService(String name) {
        this.name = name;
        calculatorTimes = new ArrayList<>();
        this.url = "https://jsonplaceholder.typicode.com/todos/";
    }

    public List<Task> findAll() {
        RequestHttp request = new RequestHttp(url);
        return request.getData();
    }


    public List<CalculatorTime> getTasksAndCalculatorTime() {
        System.out.println("executando... "+ this.name);
        CalculatorTime calculatorTime = new CalculatorTime();
        calculatorTime.setStart();
        this.findAll();
        calculatorTime.setEnd();
        calculatorTime.setNameThread(this.name);
        calculatorTimes.add(calculatorTime);
        return calculatorTimes;
    }

    public List<CalculatorTime> getCalculatorTimes() {
        return  calculatorTimes;
    }
}
