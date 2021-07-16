/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anya
 */
public class CardTest {
    
    Card instance;
    
    public CardTest() {
        instance = new Card(Suit.C, Rank.TWO,2);
    }
    @Test
    public void testGetCard(){
        String expected = "2C";
        String actual = instance.getCard(instance.rank, instance.suit);
        assertEquals(expected, actual);
      
    }
    
    @Test
    public void testSetName(){
        String expected = new Card(Suit.D, Rank.A,1).getCard(Rank.A, Suit.D);
        instance.setID(1);
        instance.setName(Rank.A);
        instance.setName(Suit.D);
        instance.setName(1);
        String actual = instance.getCard(instance.rank, instance.suit);
        assertEquals(expected, actual);
    }
}
