package services;

import entities.CalculatorTime;
import entities.Task;
import utils.RequestHttp;

import java.util.ArrayList;
import java.util.List;

public class TaskService extends Thread {
    private final String url;
    private List<CalculatorTime> calculatorTimes;
    private String name;

    public TaskService(String name) {
        super(name);
        this.name = name;
        calculatorTimes = new ArrayList<>();
        this.url = "https://jsonplaceholder.typicode.com/todos/";
    }

    public List<Task> findAll() {
        RequestHttp request = new RequestHttp(url);
        return request.getData();
    }


    public void getTasksAndCalculatorTime() {
        System.out.println("executando... "+ this.name);
        CalculatorTime calculatorTime = new CalculatorTime();
        calculatorTime.setStart();
        this.findAll();
        calculatorTime.setEnd();
        calculatorTime.setNameThread(this.name);
        calculatorTimes.add(calculatorTime);
    }

    public List<CalculatorTime> getCalculatorTimes() {
        return  calculatorTimes;
    }

    @Override
    public void run() {
        getTasksAndCalculatorTime();
    }

    public List<CalculatorTime> tryJoin() {
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            return this.calculatorTimes;
        }
    }

}
