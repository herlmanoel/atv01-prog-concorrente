package entities;

import executors.TasksExecutor;
import services.TaskService;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private long min = Long.MAX_VALUE;
    private double avg = 0;
    private long max = 0;
    private double dev;
    private final Integer REPEAT = 20;

    private long[] times;

    public Scenario(int amount) {
        times = new long[REPEAT];
        for (int b = 0; b < REPEAT; b++) {
            System.out.println((b + 1) + "/" + REPEAT);
            List<TaskService> taskServiceList = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                taskServiceList.add(new TaskService("Thread " + i));
            }
            TasksExecutor tasksExecutor = new TasksExecutor(taskServiceList);
            tasksExecutor.getTasksAndCalculatorTime();

            times[b] = tasksExecutor.getTime();

            min = Math.min(min, tasksExecutor.getTime());
            max = Math.max(max, tasksExecutor.getTime());
            avg += tasksExecutor.getTime();
        }
        avg /= (double) REPEAT;

        double variance = 0;
        for (int i = 0; i < REPEAT; i++) {
            variance += Math.pow(times[i] - avg, 2);
        }
        dev = Math.sqrt(variance / REPEAT);
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

    public double getDev() {
        return this.dev;
    }
}
