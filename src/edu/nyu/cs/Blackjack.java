package edu.nyu.cs;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
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

  /**
   * @param args
   * @throws Exception
   */

  public static boolean hitornot(String choice){
    String hit = "hit";
    
    if (choice.equals(hit)){
      return true;
    }
    else {
      return false;
    }
  }

  public static int generate_card(){
      Random random_class = new Random();
      int card = random_class.nextInt(9) + 2;
      return card;
  }





  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {

    // complete this function according to the instructions
    String player_sentence = "";
    String dealer_sentence = "";
  
    System.out.println("Welcome to Blackjack!");
    int player_card1 = generate_card();
    int player_card2 = generate_card();

    int dealer_card1 = generate_card();
    int dealer_card2 = generate_card();

    int player_total = player_card1 + player_card2;
    int dealer_total = dealer_card1 + dealer_card2;

    boolean player_bust = false;

    // array for cards for displaying the sentence

    ArrayList<Integer> player_cards = new ArrayList<Integer>();
    player_cards.add(player_card1);
    player_cards.add(player_card2);

    System.out.println("Your cards are " + player_card1 + " and " + player_card2);

    // hit or stand loop for player
    while (player_bust == false){
        if (player_total > 21){
            player_bust = true;
            break;
        }
        

        // get hit or stand choice
        System.out.println("Would you like to hit or stand?");
        Scanner scnr = new Scanner(System.in);
        String choice = scnr.nextLine();
        scnr.close();
        
        // if the player hits
        if (hitornot(choice) == true){
            
            //generates the new card, adds the value to the player total, and adds it to the array
            int new_card = generate_card();
            player_total += new_card;
            player_cards.add(new_card);
          // creates the string for the card sentence
            player_sentence = "";
            for (int i = 0; i < player_cards.size(); i++){
                player_sentence += player_cards.get(i);
                player_sentence += ", ";
            }
            player_sentence += player_cards.get(player_cards.size()-1);

          // 
          System.out.println("Your cards are: " + player_sentence);
        }
        
        else{
            break;
        }

        // 
    }

    boolean dealer_bust = false;

    ArrayList<Integer> dealer_cards = new ArrayList<Integer>();
    dealer_cards.add(dealer_card1);
    dealer_cards.add(dealer_card2);


    Random random_class = new Random();

// final outocme

    if (player_bust == true){
        System.out.println("You have bust!\nDealer wins!");
    }
    
    else{
        while (dealer_bust == false){
            if (dealer_total > 21){
                dealer_bust = true;
                break;
            }
            else{
                if (random_class.nextBoolean()){
                    int new_card = generate_card();
                    dealer_total += new_card;
                    dealer_cards.add(new_card);
                // creates the string for the card sentence
                    dealer_sentence = "";
                    for (int i = 0; i < dealer_cards.size(); i++){
                        dealer_sentence += dealer_cards.get(i);
                        dealer_sentence += ", ";
                }
                dealer_sentence += dealer_cards.get(dealer_cards.size()-1);
                System.out.println("The dealer hits.");
                }
                else{
                    System.out.println("The dealer stands.");
                    break;
                }
            }
        }

        System.out.println("Your cards are: " + player_sentence);
        System.out.println("The dealer's cards are: " + dealer_sentence);
        
        if(dealer_bust == true){
            System.out.println("The dealer has bust!\nYou win!");
        }
        else{
            //System.out.println("Your cards are: " + player_sentence);
            //System.out.println("The dealer's cards are: " + dealer_sentence);
            if (dealer_total == player_total){
                System.out.println("Tie");
            }
            else if (player_total > dealer_total){
                System.out.println("You win!");
            }
            else{
                System.out.println("Dealer wins!");
            }
        }
    }


  } // main

}
