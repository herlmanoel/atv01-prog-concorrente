import executors.TasksExecutor;
import services.TaskService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long min;
        long avg;
        long max = 0;
        for (int b = 0; b < 20; b++) {
            List<TaskService> taskServiceList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                taskServiceList.add(new TaskService("Thread " + i));
            }
            TasksExecutor tasksExecutor = new TasksExecutor(taskServiceList);
            tasksExecutor.getTasksAndCalculatorTime();
        }
    }
}
