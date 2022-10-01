import entities.Task;
import executors.TasksExecutor;
import services.TaskService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TaskService> taskServiceList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            taskServiceList.add(new TaskService("Task "+ i));
        }
        TasksExecutor tasksExecutor = new TasksExecutor(taskServiceList);
        tasksExecutor.getTasksAndCalculatorTime();
    }
}
