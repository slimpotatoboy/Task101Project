import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import sit707.TaskService;
import sit707.Task;

import java.util.List;

public class TestTask {

    @Test
    public void testGetSubmittedTasks_validStudentId_returnsTaskList() {
        List<Task> tasks = TaskService.getSubmittedTasks("SIT12");
        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals("7P", tasks.get(0).getTaskId());
        Assert.assertEquals("Task 1", tasks.get(0).getTitle());
        Assert.assertEquals("Marked", tasks.get(0).getStatus());
    }

    @Test
    public void testGetSubmittedTasks_unknownStudentId_returnsEmptyList() {
        List<Task> tasks = TaskService.getSubmittedTasks("unknown");
        Assert.assertTrue(tasks.isEmpty());
    }
}
