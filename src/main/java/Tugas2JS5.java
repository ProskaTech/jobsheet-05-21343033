//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tugas2JS5 {
    public static void main(String[] args) {
        String word1 = "", word2 = "", word3 ="";
        
        word1 = JOptionPane.showInputDialog("Enter word 1: ");
        word2 = JOptionPane.showInputDialog("Enter word 2: ");
        word3 = JOptionPane.showInputDialog("Enter word 3: ");
        
        
        String msg = word1+" "+word2+" "+word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(word1+" "+word2+" "+word3);
    }
}