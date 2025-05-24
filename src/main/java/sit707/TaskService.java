package sit707;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    public static List<Task> getSubmittedTasks(String studentId) {
        // Mocked task list based on studentId
        List<Task> tasks = new ArrayList<>();
        if ("SIT12".equals(studentId)) {
            tasks.add(new Task("7P", "Task 1", "Marked"));
            tasks.add(new Task("8P", "Task 2", "Pending Feedback"));
        }
        return tasks;
    }
}