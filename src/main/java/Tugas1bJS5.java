//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Tugas1bJS5 {
    public static void main(String[] args) {
       BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
       
       String word1 = "", word2 = "", word3 = "";
       
       try {
           System.out.print("Enter word1 : ");
           word1 = dataIn.readLine();
           System.out.print("Enter word2 : ");
           word2 = dataIn.readLine();
           System.out.print("Enter word3 : ");
           word3 = dataIn.readLine();
       }
       
       catch (IOException e) {
           System.out.println("gagal membaca keyboard");
       }
       
       System.out.println("\n"+word1+" "+word2+" "+ word3);
    }
}
