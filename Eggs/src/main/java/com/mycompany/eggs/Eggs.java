/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eggs;
import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        int individualEggs=45;
        double dozenEggs=3.25;
        
        System.out.println("Enter number of eggs you want to order");
        int numEggs=input.nextInt();
        
        
        int dozen=numEggs/12;
        int individual=numEggs%12;
        
        double totalCost=(dozen*dozenEggs)+(individual*individualEggs);
        System.out.println("The total cost is:"+totalCost );
        input.close();
    }
}
