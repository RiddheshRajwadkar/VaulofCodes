package Week3;

import java.util.ArrayList;
//imports
import java.util.Scanner;

public class ToDoList {

    private static ArrayList<String> taskList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("\n     To-Do List Application     ");
        System.out.println("1) Add a task");
        System.out.println("2) Delete a task");
        System.out.println("3) Display tasks");
        System.out.println("4) Mark a task as complete");
        System.out.println("5) Exit");

        System.out.print("Choose the operation (1-5): ");
        int Operation = scanner.nextInt();
        scanner.nextLine();

        switch(Operation){
            case 1:
            addTask(scanner);
            break;
            case 2:
            deleteTask(scanner);
            break;
            case 3:
            displayTask(scanner);
            break;
            case 4:
            markTask(scanner);
            break;
            case 5:
            System.out.println("Exiting the application.");
            System.exit(0);
            default:
            System.out.println("Invalid operation. Please enter a number between 1 and 5");
        }
    }
}
    private static void addTask(Scanner scanner){
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        taskList.add(task);
        System.out.println("Task " + task + " added successfully.");
    } 

    private static void deleteTask(Scanner scanner) {
        System.out.print("Enter  index of the task to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index>0 && index<=taskList.size()){
            String deletedTask = taskList.remove(index);
            System.out.println("Task " + deletedTask + " deleted successfully");
        }else{
            System.out.println("Invalid index. Please Enter valid index.");
        }
        
    }

    private static void displayTask(Scanner scanner) {
        if(taskList.isEmpty()){
            System.out.println("To-Do List empty.");
        }else{
            System.out.println("      To-Do List      ");
            for(int i=0; i < taskList.size(); i++){
                System.out.println(i+1 + ") " + taskList.get(i));
            }
        }
    }

    private static void markTask(Scanner scanner) {
        System.out.print("Enter the index of the task to be marked complete: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index > 0 && index <= taskList.size()){
            String completedTask = taskList.get(index);
            System.out.println("Task " + completedTask + " marked as completed.");
    }else{
        System.out.println("Invalid index. Please enter valid index.");
    }
}
}
