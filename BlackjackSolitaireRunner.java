/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

/***
 * The class BlackjackSolitaireRunner is the main class
 * This class runs the game
 * @author anya
 */


public class BlackjackSolitaireRunner{
    /***
     * The main void creats the new game and play it
     * 
     * @param args - not used
     */
    public static void main(String[] args){        
        
        BlackjackSolitaire bjs = new BlackjackSolitaire();
        bjs.play();
        
    }
}