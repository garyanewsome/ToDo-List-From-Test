/*
 * class called by ToDoList
 * Stores the array and performs all relevant functions
 */
package todolist;

import java.util.ArrayList;

/**
 *
 * @author garyanewsome
 */
public class ToDo {

private ArrayList<String> todo = new ArrayList();
private ArrayList<String> completed = new ArrayList();

public void todo(){
  this.todo = todo;
  this.completed = completed;
}

public int getLength(){
  return this.todo.size();
}

public void addToDo(String newToDo){
  this.todo.add(newToDo);
}

public void addCompleted(String yesNo){
  this.completed.add(yesNo);
}

public String getToDoByIndex(int index){
  return todo.get(index);
}

public String getCompletedByIndex(int index){
  return completed.get(index);
}

public void markComplete(int index){
  completed.set(index, "Yes");
}


}
