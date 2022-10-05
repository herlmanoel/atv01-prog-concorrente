package executors;

import entities.CalculatorTime;
import services.TaskService;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class TasksExecutor {
    List<List<CalculatorTime>> repeatCalculatorTimes;
    private final List<TaskService> taskServiceList;

    public TasksExecutor(List<TaskService> taskServiceList) {
        this.taskServiceList = taskServiceList;
        repeatCalculatorTimes = new ArrayList<>();
    }

    public void getTasksAndCalculatorTime() {
        for (int i = 0; i < this.taskServiceList.size(); i++) {
            repeatCalculatorTimes.add(taskServiceList.get(i).getTasksAndCalculatorTime());
        }
        printRepeatCalculatorTimes();
    }

    public void printRepeatCalculatorTimes() {
        System.out.println("printRepeatCalculatorTimes");
        repeatCalculatorTimes.forEach(i -> i.forEach(j -> System.out.println(j.toString())));
        if (averageOfRepeatCalculatorTimes().isPresent()) {
            System.out.println("Avg.: " + averageOfRepeatCalculatorTimes().getAsDouble()  + " ms");
        } else {
            System.out.println("is not present");
        }
    }

    public OptionalDouble averageOfRepeatCalculatorTimes() {
        return repeatCalculatorTimes
                .stream()
                .mapToDouble(list -> list
                        .stream()
                        .mapToDouble(item -> item
                                .getTime())
                        .average()
                        .getAsDouble())
                .average();
    }
}
