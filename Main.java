import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("\nYour To-Do List:");
            System.out.println("1 : Add new task");
            System.out.println("2 : List tasks");
            System.out.println("3 : Remove task");
            System.out.println("4 : Mark task as done");
            System.out.println("5 : Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine(); // Reads the full line as task description
                    toDoList.addTask(description);
                    break;
                    
                case 2:
                    toDoList.viewTasks(); // Shows all tasks
                    break;
                    
                case 3:
                    toDoList.viewTasks();
                    System.out.print("Choose the task number to delete: ");
                    int taskToRemove = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    toDoList.removeTask(taskToRemove);
                    break;
                    
                case 4:
                    toDoList.viewTasks(); 
                    System.out.print("Enter the task number to mark as done: ");
                    int taskToMark = scanner.nextInt() - 1; 
                    scanner.nextLine(); 
                    toDoList.markAsCompleted(taskToMark);
                    break;
                    
                case 5:
                    running = false;
                    System.out.println("Exiting To-Do List. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close(); 
    }
}
