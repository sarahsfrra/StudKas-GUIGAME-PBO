/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpggame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sarah
 */
public class Apayah {
    private MilesFrame miles;
    private ImageIcon image;
    private JLabel label;
    
    public Apayah(){
        image = new ImageIcon("./images/resize.jpg");
        
        label = new JLabel(image);
        label.setSize(800,600);
        miles = new MilesFrame();
        miles.add(label);
        miles.setTitle("rpg GAME");

        
        miles.setLocationRelativeTo(null);
        miles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miles.setVisible(true); 
        
       miles.setResizable(false);
        
    }
    
}
