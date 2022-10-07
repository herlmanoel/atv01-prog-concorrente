package services;

import entities.CalculatorTime;
import entities.Root;
import utils.RequestHttp;

public class TaskService extends Thread {
    private final String url;
    private CalculatorTime calculatorTime;
    private String name;

    public TaskService(String name) {
        super(name);
        this.name = name;
        this.url = "https://dummyjson.com/products/";
    }

    public Root findAll() {
        RequestHttp request = new RequestHttp(url);
        return request.getData();
    }

    public CalculatorTime getTasksAndCalculatorTime() {
        System.out.println("executando... " + this.name);

        this.calculatorTime = new CalculatorTime(this.name);
        calculatorTime.setStart();
        Root root = this.findAll();
        System.out.println(root.toString());
        calculatorTime.setEnd();
        System.out.println("finalizada " + calculatorTime);

        return calculatorTime;
    }

    public CalculatorTime getCalculatorTime() {
        return calculatorTime;
    }

    @Override
    public void run() {
        getTasksAndCalculatorTime();
    }

    public CalculatorTime tryJoin() {
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.calculatorTime;
    }

}
