import entities.Task;
import services.TaskService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        List<Task> taskList = taskService.findAll();

        taskList.forEach(i -> i.toString());
    }
}
