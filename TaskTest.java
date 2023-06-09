/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author lab_services_student
 */

public class TaskTest {
    Task testData  = new Task();
    
    String taskName1 = "Login Feature";
    String developerName1 = "Robyn Harrisson";
    int taskDuration1 = 8;
    String description1 = "Create login feature to authenticate users";
    String taskStatus1 = "To Do";
    
    String taskName2 = "Add Task feature";
    String developerName2 = "Mike Smith";
    int taskDuration2 = 10;
    String description2 = "Create add task feature to add task users";
    String taskStatus2 = "Doing"; 
    public TaskTest() {
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
       testData = new Task();
       assertTrue(testData.checkTaskDescription(description1));
       
       String actual1;
       String expected1 = "Task successfully captured";
       
       if(testData.checkTaskDescription(description1))
       {
           actual1 = "Task successfully captured";
       }
       else
       {
           actual1 = "Please enter a task decription of less than 50 characters";
       }
       assertEquals(expected1, actual1);
       
       testData = new Task();
       assertTrue(testData.checkTaskDescription(description2));

       String actual2;
       String expected2 = "Task successfully captured";
       
       if(testData.checkTaskDescription(description2))
       {
           actual2 = "Task successfully captured";
       }
       else
       {
           actual2 = "Please enter a task decription of less than 50 characters";
       }
       assertEquals(expected2, actual2); 
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test

    public void TestCreateTaskID() {
        String expected1 = "LO:0:BYN";
        int taskNumber1 = 0;
        String actual1 = testData.createTaskID(taskName1, taskNumber1, developerName1);
        assertEquals(expected1, actual1);
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        assertEquals(8,testData.returnTotalHours(8));
        assertEquals(18,testData.returnTotalHours(10));
    }
    
}
