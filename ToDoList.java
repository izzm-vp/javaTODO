import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Adds a new task
    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("New task added: " + newTask.Getdescription());
    }

    // Views all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).Getdescription());
            }
        }
    }

    // Removes a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index); // Should work correctly
            System.out.println("Task removed: " + removedTask.Getdescription());
        } else {
            System.out.println("Invalid task number");
        }
    }

    // Marks a task as completed by its index
    public void markAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).MarkAsComplet();; // Calls the correct method in Task class
            System.out.println("Marked as Done: " + tasks.get(index).Getdescription());
        } else {
            System.out.println("Invalid task number");
        }
    }
}
