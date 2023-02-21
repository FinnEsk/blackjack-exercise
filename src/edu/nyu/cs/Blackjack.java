package edu.nyu.cs;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
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

  public static boolean hit(){
    Scanner scnr = new Scanner(System.in);
    String choice = scnr.nextLine();
    System.out.println("Would you like to hit or stand? ");


    String hit = "hit";
    
    if (choice.equals(hit)){
      return true;
    }
    else {
      return false;
    }

  

    
  }
  public static void main(String[] args) throws Exception {

    // complete this function according to the instructions

    // random class    


    System.out.println("Welcome to Blackjack!");
    int player_card1 = generate_card();
    int player_card2 = generate_card();
    int player_total = player_card1 + player_card2;

    System.out.println("Your cards are: " + player_card1 + "and " + player_card2);


// card sentences

ArrayList<Integer> player_cards = new ArrayList<Integer>();
String player_sentence = "";



for (int i = 0; i < player_cards.length; i++){
    player_sentence += player_cards[i];
    player_sentence += ", ";
}


      // player choice loop (this is where they decide whether to hit or stand)
      while (true){
        //if player busts
        if (player_total > 21){
          System.out.println("You have bust!\nDealer wins!");
          break;
        }
        // 
        if (hit()){
          int new_card = generate_card();
          player_total += new_card;
          System.out.println("Your cards are: " + player_card1 + ", " + player_card2 + );
        }
        else{
          break;
        }
      }



    
    




  } // main

}
