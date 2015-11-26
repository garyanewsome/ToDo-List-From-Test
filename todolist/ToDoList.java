/*
 * ToDoList Application to simulate Test 2 Question
 */
package todolist;

import java.util.Scanner;

/**
 *
 * @author garyanewsome
 */
public class ToDoList {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    ToDo todo = new ToDo();
      
    todo.addToDo("Intro to Programming");
    todo.addCompleted("Yes");
    todo.addToDo("C++");
    todo.addCompleted("Yes");
    todo.addToDo("VB1");
    todo.addCompleted("Yes");
    todo.addToDo("VB2");
    todo.addCompleted("No");
    todo.addToDo("Java 1");
    todo.addCompleted("No");
           
    println("Welcome to your ToDo List.");
     
    int selection;
    
    do {
      println("\nMenu:\n" +
              "1. Add ToDo to list\n"+
              "2. Find a ToDo by INDEX\n"+
              "3. Mark a ToDo as complete\n"+
              "4. Print your ToDo list to the screen\n"+
              "0. To Exit the program\n");
      
      print("Please enter your selection: ");
      selection = keyboard.nextInt();
      
          switch (selection){
      case 1:
        print("Please enter your new todo: ");
        String newToDo = keyboard.next();
        todo.addToDo(newToDo);
        todo.addCompleted("No");
        break;
        
      case 2:
        print("Please enter the index you wish to view: ");
        int viewIndex = keyboard.nextInt();
        
        println("Index: " + viewIndex + ": " +
                todo.getToDoByIndex(viewIndex) + " - Complete: " +
                todo.getCompletedByIndex(viewIndex));
        break;
      case 3:
        print("Please select an index to mark complete: ");
        int completeIndex = keyboard.nextInt();
        todo.markComplete(completeIndex);
        
        break;
      case 4:
        for(int i = 0; i < todo.getLength(); i++){
          println("Index: " + i + ": " + todo.getToDoByIndex(i) +
                  " - Complete: " + todo.getCompletedByIndex(i));
        }
        break;
    }

    } while (selection != 0);
    

    
    println("Have a pleasant day.");
  }
  
  

  public static void println(String msg) {
    System.out.println(msg);
  }
  public static void print(String msg) {
    System.out.print(msg);
  }
}
