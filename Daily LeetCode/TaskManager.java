import java.util.*;

class TaskManager {

    // The approach is that we use a Task class which will have UserID taskID and priority
    class Task {
        int userId, taskId, priority;

        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }
    // Then we need to implement add the task,edit the task with  newpriority of the current task and remove the task using the task ID and execute top which is at the highest priority
    // Thus we will design a map that will map the task ID with the task class having the attributes Task Id , user ID and priorty
    // Also we will maintain a tree set that stores the task in descending order of the priority

    TreeSet<Task> tasksSet;
    Map<Integer, Task> tasksMap;

    public TaskManager(List<List<Integer>> tasks) {
        tasksSet = new TreeSet<>((a, b) -> {
            if (b.priority != a.priority)
                return b.priority - a.priority;
            return b.taskId - a.taskId;
        });
        tasksMap = new HashMap<>();
        for (List<Integer> l : tasks) {
            Task t = new Task(l.get(0), l.get(1), l.get(2));
            tasksSet.add(t);
            tasksMap.put(l.get(1), t);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        tasksSet.add(task);
        tasksMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {
        Task oldTask = tasksMap.get(taskId);
        if (oldTask != null) { // Add a null check here
            tasksSet.remove(oldTask);
            oldTask.priority = newPriority;
            tasksSet.add(oldTask);
        }
    }

    public void rmv(int taskId) {
        Task task = tasksMap.get(taskId);
        tasksSet.remove(task);
        tasksMap.remove(taskId);
    }

    public int execTop() {
        if (tasksSet.isEmpty())
            return -1;
        Task top = tasksSet.pollFirst();
        tasksMap.remove(top.taskId);
        return top.userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */