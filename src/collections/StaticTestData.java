package collections;

import java.util.*;

public class StaticTestData {
  
  public static PhoneTask mikePhone = new PhoneTask("Mike", "987 6543");
  public static PhoneTask paulPhone = new PhoneTask("Paul", "123 4567");
  public static PhoneTask markPhone = new PhoneTask("Paul", "123 4567");
  public static PhoneTask shaunPhone = new PhoneTask("Paul", "123 4567");
  public static PhoneTask seanPhone = new PhoneTask("Paul", "123 4567");
  
  
  public static CodingTask databaseCode = new CodingTask("db");
  public static CodingTask interfaceCode = new CodingTask("gui");
  public static CodingTask logicCode = new CodingTask("logic");
  public static CodingTask genericsCode = new CodingTask("generics");
  
  public static List<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();
  public static List<CodingTask> codingTasks = new ArrayList<CodingTask>();
  
  
  public static List<Task> mondayTasks = new ArrayList<Task>();
  public static List<Task> tuesdayTasks = new ArrayList<Task>();
  public static List<Task> wedTasks = new ArrayList<Task>();
  public static List<Task> thuTasks = new ArrayList<Task>();
  public static List<Task> friTasks = new ArrayList<Task>();
  public static List<Task> satTasks = new ArrayList<Task>();
  public static List<Task> sunTasks = new ArrayList<Task>();
  
  
  
  
  
  
  static{
	
	  sunTasks.add(new EmptyTask());
	  
	  satTasks.add(markPhone);
	  satTasks.add(genericsCode);
	 
	  
	  phoneTasks.add(mikePhone);
	  phoneTasks.add(paulPhone);
	  
	  codingTasks.add(databaseCode);
	  codingTasks.add(interfaceCode);
	  codingTasks.add(logicCode);
	  
	  mondayTasks.add(mikePhone);
	  mondayTasks.add(logicCode);
	  mondayTasks.add(new EmptyTask());
	  
	  tuesdayTasks.add(seanPhone);
	  tuesdayTasks.add(paulPhone);
	  tuesdayTasks.add(databaseCode);
	  tuesdayTasks.add(interfaceCode);
	  
	  wedTasks.add(paulPhone);
	  wedTasks.add(interfaceCode);
	  
	  thuTasks.add(shaunPhone);
	  thuTasks.add(logicCode);
	  thuTasks.add(databaseCode);
	  
	  friTasks.add(mikePhone);
	  friTasks.add(logicCode);
	  friTasks.add(databaseCode);
	  friTasks.add(interfaceCode);
	  friTasks.add(genericsCode);
	  
	  
/*    Collections.addAll(phoneTasks, mikePhone, paulPhone);
    Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
    Collections.addAll(mondayTasks, logicCode, mikePhone);
    Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);
*/    
  }
}