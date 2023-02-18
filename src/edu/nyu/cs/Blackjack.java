package edu.nyu.cs;

import java.util.Scanner;
import java.util.Random;

/**
 * A variation of the game of Blackjack.  
 * Complete this program according to the instructions in the README.md file as well as within the given comments below.
 */
public class Blackjack {

  /**
   * The main function is automatically called first in a Java program.
   * 
   * @param args An array of any command-line arguments.
   */

  public static int generate_card(){
    Random random_class = new Random();
    int card = random_class.nextInt(9) + 2;
    return card;
  }

  public static boolean hit_stand(){
    Scanner scnr = new Scanner(System.in);
    String choice = scnr.nextLine();
    System.out.println("Would you like to hit or stand? ");
    
  }
  public static void main(String[] args) throws Exception {

    // complete this function according to the instructions

    // random class



    System.out.println("Welcome to Blackjack!");
    int player_card1 = generate_card();
    int player_card2 = generate_card();
    




  } // main

}
