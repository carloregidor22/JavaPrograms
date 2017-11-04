package collections;

import java.util.*;
import static collections.StaticTestData.*;

public class CollectionMethodsTest {

  public static void main(String[] args) {
    mondayTasks.add(new PhoneTask("Ruth", "567 1234"));

    Collection<Task> allTasks = new ArrayList<Task>(mondayTasks);
    
    
    allTasks.addAll(tuesdayTasks);
    
    
    boolean wasPresent = mondayTasks.remove(mikePhone);
    
    mondayTasks.clear();
    
    
    Collection<Task> tuesdayNonphoneTasks = new ArrayList<Task>(tuesdayTasks);
    
    tuesdayNonphoneTasks.removeAll(phoneTasks);
    
    Collection<Task> phoneTuesdayTasks = new ArrayList<Task>(tuesdayTasks);
    
    phoneTuesdayTasks.retainAll(phoneTasks);
    
    p(phoneTuesdayTasks);
    
    Collection<PhoneTask> tuesdayPhoneTasks =
            new ArrayList<PhoneTask>(phoneTasks);
    tuesdayPhoneTasks.retainAll(tuesdayTasks);

    
    // throws ConcurrentModificationException
    /*for (Task t : tuesdayTasks) {
      if (t instanceof PhoneTask) {
        tuesdayTasks.remove(t);
      }
    }*/
    
    
// throws ConcurrentModificationException
/*   for (Iterator<Task> it = tuesdayTasks.iterator() ; it.hasNext() ; ) {
      Task t = it.next();
      if (t instanceof PhoneTask) {
        tuesdayTasks.remove(t);
      }
    }*/
    
    System.out.println("Hello, World!");
    
    for (Iterator<Task> it = tuesdayTasks.iterator() ; it.hasNext() ; ) {
      Task t = it.next();
      if (t instanceof PhoneTask || t instanceof CodingTask) {
        it.remove();
      }
    }
    
    p(tuesdayTasks);
  }
  
  public static void p(Collection p){
	  System.out.println(p);
  }
  
}