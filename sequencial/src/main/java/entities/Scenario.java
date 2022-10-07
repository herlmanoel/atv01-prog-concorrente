package entities;

import executors.TasksExecutor;
import services.TaskService;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private long min = Long.MAX_VALUE;
    private double avg;
    private long max = 0;
    private final Integer REPEAT = 20;

    public Scenario(int amount) {
        for (int b = 0; b < REPEAT; b++) {
            System.out.println((b + 1) + "/" + REPEAT);
            List<TaskService> taskServiceList = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                taskServiceList.add(new TaskService("Service " + i));
            }
            TasksExecutor tasksExecutor = new TasksExecutor(taskServiceList);
            tasksExecutor.getTasksAndCalculatorTime();

            min = Math.min(min, tasksExecutor.getTime());
            max = Math.max(max, tasksExecutor.getTime());
            avg += tasksExecutor.getTime();
        }
        avg /= (double) amount;
    }

    public long getMin() {
        return this.min;
    }

    public double getAvg() {
        return this.avg;
    }

    public long getMax() {
        return this.max;
    }
}
