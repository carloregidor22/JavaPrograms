package collections;

import java.util.*;
import static collections.StaticTestData.*;

public class SortedSetTest {

  public static void main(String[] args) {
    
	Set<Task> naturallyOrderedTasks = new TreeSet<Task>(mondayTasks);

    naturallyOrderedTasks.addAll(tuesdayTasks);
  
    
    NavigableSet<PriorityTask> priorityTasks = new TreeSet<PriorityTask>();

    priorityTasks.add(new PriorityTask(interfaceCode, Priority.LOW));
    priorityTasks.add(new PriorityTask(mikePhone, Priority.MEDIUM));
    priorityTasks.add(new PriorityTask(databaseCode, Priority.MEDIUM));
    priorityTasks.add(new PriorityTask(paulPhone, Priority.HIGH));
    

    //p(priorityTasks);
    
    PriorityTask firstLowPriorityTask =
            new PriorityTask(new CodingTask("db2"), Priority.LOW);
    
    
    SortedSet<PriorityTask> highAndMediumPriorityTasks =
            priorityTasks.headSet(firstLowPriorityTask);
    
   // p(highAndMediumPriorityTasks);
    
    PriorityTask firstMediumPriorityTask =
            new PriorityTask(new EmptyTask(), Priority.MEDIUM);
    
    PriorityTask highPriorityTask =
            new PriorityTask(new EmptyTask(), Priority.HIGH);

    PriorityTask lowPriorityTask =
            new PriorityTask( new CodingTask("db1"), Priority.LOW);
    
    SortedSet<PriorityTask> mediumPriorityTasks =
            priorityTasks.subSet(
            		 lowPriorityTask, firstLowPriorityTask);
    
    p(mediumPriorityTasks);
    
    PriorityTask logicCodeMedium =
            new PriorityTask(logicCode, Priority.MEDIUM);
    
    
    priorityTasks.add(logicCodeMedium);
    
    mediumPriorityTasks.remove(logicCodeMedium);
    
    
    PriorityTask nextTask = priorityTasks.pollFirst();
  
    
    PriorityTask mikePhoneMedium = new PriorityTask(mikePhone, Priority.MEDIUM);
    
    NavigableSet closedInterval = priorityTasks.subSet(
            firstMediumPriorityTask, true, mikePhoneMedium, true);
  
  
  
  }
  
  public static void p(Collection p){
	  System.out.println(p);
  }
  
}