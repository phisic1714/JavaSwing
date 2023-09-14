/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstgui;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author phisic1714
 */
public class MyFirstGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame frame
            = new JFrame(); // creating instance of JFrame
 
        JButton button = new JButton(
            " GFG WebSite Click"); // creating instance of
                                   // JButton
        button.setBounds(
            150, 200, 220,
            50); // x axis, y axis, width, height
 
        frame.add(button); // adding button in JFrame
 
        frame.setSize(500, 600); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible
    }
    
}
