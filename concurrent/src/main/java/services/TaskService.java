package services;

import entities.CalculatorTime;
import entities.Root;
import entities.Task;
import utils.RequestHttp;

import java.util.List;

public class TaskService extends Thread {
    private final String url;
    private CalculatorTime calculatorTime;
    private String name;

    public TaskService(String name) {
        super(name);
        this.name = name;
        this.url = "https://api.openweathermap.org/data/2.5/forecast?lat=-5.832138&lon=-35.205358&appid=a3ea32ec773a895cc162c8253f613b2e";
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
        System.out.println(root.toString()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                );
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
