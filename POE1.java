/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe1;
import javax.swing.*;
/**
 *
 * @author lab_services_student
 */
public class POE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //All variable declarations
        Task t = new Task();
        //Displays Weclome message, with the options
        int option = Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban\n1) Add Task\n2) Show Report\n3) Quit"));
        
        //Only runs if the user does not want to quit
        while(option != 3)
        {
            //if statement check if option 1 or 2 has been selected
            if(option == 1)
            {   
                //Adds new task
                t.addTask();
            }
            else if(option == 2)
            {
                //Displays coming soon message
                JOptionPane.showMessageDialog(null, "Coming Soon");
            }
            option = Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban\n1) Add Task\n2) Show Report\n3) Quit"));
        }
        
    }
}


