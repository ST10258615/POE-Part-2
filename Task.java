/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Task {
    //All variable declarations
    private String taskName = "";
    private int taskNum = 0;
    private String taskDes = "";
    private int taskDuration = 0;
    private int taskStatusChoice = 0;
    private String taskStatus = "";
    private String dev = "";
    private String taskID = "";
    private int totalDuration = 0;
    int sum = 0;
    
    public Task()//Contructor
    {
    }
    public boolean checkTaskDescription(String d)
    {
        //Checks if task description is less than 50
        if(d.length() <= 50)
        {
            return true;
        }
        return false;
    }
    
    public String createTaskID(String tN, int tNum, String d)
    {
        //cretes the task ID
        String tID = (tN.substring(0,2) + ":" + tNum + ":" + d.substring(d.indexOf(' ')- 3, d.indexOf(' '))).toUpperCase();
        return tID;
    }
    public String printTaskDetails(String tN, int tNum, String taskDes, String dev, int duration, String tID, String tStatus)
    {
        //Appends the necessary information to later be displayed
        return "Task Status:\t" + tStatus + "\nDeveloper Details:\t" + dev + "\nTask Number:\t" + tNum + "\nTask Name:\t" + tN +  "\nTask Description:\t" + taskDes +  "\nDuration:\t" + duration + "\nTask ID:\t" + tID;
    }
    public int returnTotalHours(int h)
    {
        //calculates the total duration of all tasks
        
        sum = sum + h;
        return sum;
    }
    public void addTask()
    {
        int numTask = 0;
        
        //Ask for the number of tasks the user would like to add
        numTask = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of tasks"));
        
        //For loop run until i reaches the number of task the user wanted to add
        for(int i = 0; i < numTask; i++)
        {
            //Instantiates all necessary variables
            taskName = JOptionPane.showInputDialog("Please enter task name");
            taskDes = JOptionPane.showInputDialog("Please enter a description of the task(NO MORE THAN 50 CHARACTERS)");
            dev = JOptionPane.showInputDialog("Please enter your full name");
            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the task"));
            taskStatusChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose task status\n1) To do\n2) Done\n3) Doing"));
            //checks which task status the user chose
            if(taskStatusChoice == 1)
            {
                taskStatus = "To do";
            }
            else if(taskStatusChoice == 2)
            {
                taskStatus = "Done";
            }
            else if(taskStatusChoice == 3)
            {
                taskStatus = "Doing";
            } 
            
            //only runs is the task description is less than 50 characters
            while(checkTaskDescription(taskDes) == false)
            {
                //Asks the user to re-enter all the task details
                JOptionPane.showMessageDialog(null, "Please enter a task decription of less than 50 characters");
                taskName = JOptionPane.showInputDialog("Please enter task name");
                taskDes = JOptionPane.showInputDialog("Please enter a description of the task(NO MORE THAN 50 CHARACTERS)");
                dev = JOptionPane.showInputDialog("Please enter the developer's full name");
                taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the task"));
                taskStatusChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose task status\n1) To do\n2) Done\n3) Doing"));
                if(taskStatusChoice == 1)
                {
                    taskStatus = "To do";
                }
                else if(taskStatusChoice == 2)
                {
                    taskStatus = "Done";
                }
                else if(taskStatusChoice == 3)
                {
                    taskStatus = "Doing";
                } 
            }
            //Lets the user know that they have successfully added a task
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            //Calls createTaskID class
            taskID = createTaskID(taskName, taskNum, dev);
            //calls returnTotalHoirs method
            totalDuration = returnTotalHours(taskDuration);
            //Prints all the task details useing printTaskDetails method
            JOptionPane.showMessageDialog(null, printTaskDetails(taskName, taskNum, taskDes, dev, taskDuration, taskID, taskStatus));
            JOptionPane.showMessageDialog(null, "Total Duration: " + totalDuration);
            taskNum++;
                    
            }
    }
}

