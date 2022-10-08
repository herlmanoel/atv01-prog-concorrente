package executors;

import entities.CalculatorTime;
import services.TaskService;

import java.util.ArrayList;
import java.util.List;

public class TasksExecutor {
    List<CalculatorTime> repeatCalculatorTimes;
    private final List<TaskService> taskServiceList;

    public TasksExecutor(List<TaskService> taskServiceList) {
        this.taskServiceList = taskServiceList;
        repeatCalculatorTimes = new ArrayList<>();
    }

    private long min = Long.MAX_VALUE;
    private double avg;
    private long max;

    CalculatorTime elapsed;

    public void getTasksAndCalculatorTime() {
        elapsed = new CalculatorTime();
        elapsed.setStart();

        for (int i = 0; i < this.taskServiceList.size(); i++) {
            CalculatorTime time = taskServiceList.get(i).getTasksAndCalculatorTime();
            min = Math.min(min, time.getTime());
            max = Math.max(max, time.getTime());
            avg += time.getTime();
        }

        avg /= (double) this.taskServiceList.size();
        elapsed.setEnd();

        System.out.println("Min.: " + min + " ms");
        System.out.println("Max.: " + max + " ms");
        System.out.println("Avg.: " + avg + " ms");
        System.out.println("Total: " + elapsed.getTime() + " ms");
        System.out.println("------");
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

    public long getTime() {
        return this.elapsed.getTime();
    }
}
