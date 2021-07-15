/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;


import java.util.*;
import java.lang.Math;
/***
 * Suit - the enum to describe the suit of card
 * @author anya
 */


enum Suit{
H,
C,
D,
S

}

/***
 * Rank - the enum to describe the rank of card
 * @author anya
 */
enum Rank{
TWO,
THREE,
FOUR,
FIVE,
SIX,
SEVEN,
EIGHT,
NINE,
TEN,
J,
Q,
K,
A
}

/***
 * The class Card creates the playing card
 * 
 * @author anya
 */

public class Card {
    
    Suit suit;  // suit of the card
    Rank rank;  // rank of the card
    int val;    // score of the card
    int id;     // the technical param. Need to mix the deck of card
    
    
    /***
     * the constructor without parameters
     */
    Card(){
    
    }
    
    /***
     * the constructor 
     */
    Card( Suit suit, Rank rank, int val){
    this.suit = suit;
    this.rank = rank;
    this.val = val;
    
    }
    
    /***
     * Method sets the Suit of the card
     * @param s - suit of the card
     */
    public void setName(Suit s) {
       this.suit = s;
    }
    
    /***
     * Method sets the rank of the card
     * @param r - the rank of the card
     */
    public void setName(Rank r) {
       this.rank = r;
    }
   
    /***
     * Method sets the val od the card
     * @param v -  the score of the card
     */
    public void setName(int v) {
       this.val = v;
    }
    
    /***
     * Method sets ID
     * @param id  - the number of the card 
     */
   
     public void setID(int id) {
       this.id = id;
   }
     
     /***
      * Method returns the String form of the Card
      * @param rank - the rank of the card
      * @param suit - the suit of the card
      * @return  String version of the Card
      */
    public String getCard(Rank rank, Suit suit){
    switch(this.rank){
        case TWO: {
            switch(this.suit){
                case D: return "2D";
                case H: return "2H";
                case C: return "2C";
                case S: return "2S";                     
            }
        }
        case THREE: {
            switch(this.suit){
                case D: return "3D";
                case H: return "3H";
                case C: return "3C";
                case S: return "3S";                     
            }
        } 
        case FOUR: {
            switch(this.suit){
                case D: return "4D";
                case H: return "4H";
                case C: return "4C";
                case S: return "4S";                     
            }
        } 
        case FIVE: {
            switch(this.suit){
                case D: return "5D";
                case H: return "5H";
                case C: return "5C";
                case S: return "5S";                     
            }
        } 
        case SIX: {
            switch(this.suit){
                case D: return "6D";
                case H: return "6H";
                case C: return "6C";
                case S: return "6S";                     
            }
        } 
        case SEVEN :{
            switch(this.suit){
                case D: return "7D";
                case H: return "7H";
                case C: return "7C";
                case S: return "7S";                     
            }
        } 
        case EIGHT:{
            switch(this.suit){
                case D: return "8D";
                case H: return "8H";
                case C: return "8C";
                case S: return "8S";                     
            }
        } 
        case NINE: {
            switch(this.suit){
                case D: return "9D";
                case H: return "9H";
                case C: return "9C";
                case S: return "9S";                     
            }
        } 
        case TEN: {
            switch(this.suit){
                case D: return "10D";
                case H: return "10H";
                case C: return "10C";
                case S: return "10S";                     
            }
        }
        case J:{
            switch(this.suit){
                case D: return "JD";
                case H: return "JH";
                case C: return "JC";
                case S: return "JS";                     
            }
        }
        case Q:{
            switch(this.suit){
                case D: return "QD";
                case H: return "QH";
                case C: return "QC";
                case S: return "QS";                     
            }
        }
        case K: {
            switch(this.suit){
                case D: return "KD";
                case H: return "KH";
                case C: return "KC";
                case S: return "KS";                     
            }
        } 
        case A:{
            switch(this.suit){
                case D: return "AD";
                case H: return "AH";
                case C: return "AC";
                case S: return "AS";                     
            }
        }
    }
    return "AA";
    }
    

}