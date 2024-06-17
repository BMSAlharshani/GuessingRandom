/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessingrandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mczo4
 */
public class GuessingRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in) ; 
        Random r = new Random(); 
        int guss = r.nextInt(99);
        System.out.println(" Pleses Eneter Your Guess:  ");
        int Guess = scan.nextInt(); 
        while (Guess != guss){
              if (guss < Guess){
                    System.out.println("try again ");


                }
                else if (guss > Guess ){ 
                    System.out.println("your guessing number is greater than");
                }
                System.out.println(" Pleses Eneter Your Guess ");
                Guess = scan.nextInt(); 
        }
        
        
        System.out.println("congrats ");
        }
     
        }
    
    

