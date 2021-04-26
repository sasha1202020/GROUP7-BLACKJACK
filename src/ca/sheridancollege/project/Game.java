/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {

    private int ptotal = 0;
    private int dtotal = 0;

    public void getCard() {
        Game game = new Game();
        RandomCard rc1 = new RandomCard();
        int pc1 = rc1.DrawRandomCard();
        int pc2 = rc1.DrawRandomCard();
        int dc1 = rc1.DrawRandomCard();
        int dc2 = rc1.DrawRandomCard();
        GroupOfCards pl = new GroupOfCards();

        String p1 = (String) pl.AllCards.get(pc1);
        int card1 = Integer.parseInt(p1);

        String p2 = (String) pl.AllCards.get(pc2);
        int card2 = Integer.parseInt(p2);

        String d1 = (String) pl.AllCards.get(dc1);
        int card3 = Integer.parseInt(d1);

        String d2 = (String) pl.AllCards.get(dc2);
        int card4 = Integer.parseInt(d2);

        int ptotal = card1 + card2;
        int dtotal = card3 + card4;

        System.out.println("Player cards: " + card1 + " " + card2 + " Player total: " + ptotal);
        System.out.println("Dealer cards: " + card3 + " " + card4 + " Dealer total: " + dtotal);

        while (ptotal < 21) {

            System.out.println("Would you like anothe card? y/n");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            if (input.equals("y")) {

                int pc3 = rc1.DrawRandomCard();
                String p3 = (String) pl.AllCards.get(pc3);
                int card5 = Integer.parseInt(p3);
                ptotal += card5;
                System.out.println("Player cards: " + card1 + " " + card2 + " " + card5 + " Player total: " + ptotal);

                //If you want to test "FIRST" if statement, exit the while loop when Player has more scores than the Dealer and Player scores is not more than 21.
                //If you want to test the "SECOND" if statement, exit the while loop when Player and Dealer scores are equal.
                //If you want to test the "THIRD" if statement, exit the while loop when Player scores equals 21
                //If you want to test the "ELSE" Player scores have to be more than 21
            } else {
                System.out.println("Player cards: " + card1 + " " + card2 + " Player total: " + ptotal);
                System.out.println("Dealer cards: " + card3 + " " + card4 + " Dealer total: " + dtotal);
                if (ptotal > dtotal && ptotal <= 21 && dtotal <= 21) {
                    System.out.println("Player wins");
                }//end of the first If statement
                else if (ptotal == dtotal) {
                    System.out.println("You push");
                }//end of the second if statement
                else if (ptotal == 21) {
                    System.out.println(" BLACKJACK!! Player wins");
                } //end of the third if statement
                else if (ptotal > 21) {
                    System.out.println("Dealer wins");
                } else {
                    System.out.println("Dealer wins");//end of the els statement          

                }
                break;

            }

        }
        //This if statements are created if the player does not go inside while loop
        if (ptotal > 21) {
            System.out.println("Dealer wins");
        } else if(ptotal==21){
        System.out.println("BLACKJACK!! Player wins");
        } else if (ptotal==dtotal){
            System.out.println("You push");
        }

    }

    /*   public void win() {

        if (ptotal > dtotal && ptotal <= 21 && dtotal <= 21) {
            System.out.println("Player wins");
        } else if (ptotal == dtotal) {
            System.out.println("You push");
        } else if (ptotal == 21) {
            System.out.println(" BLACKJACK!! Player wins");
        } else {
            System.out.println("Dealer wins");
        }
        System.out.println(ptotal);
        System.out.println(dtotal);
    }*/
}
//end class
