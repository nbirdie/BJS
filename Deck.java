/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

import java.util.ArrayList;
import java.util.List;

/***
 * Class Deck described the deck of card
 * @author anya
 */
public class Deck{
    
    List<Card> d = new ArrayList <>();  // The Deck as ArrayList
    int a[] = new int[52];              // the mass of indexes of the cards
    

    /***
     * The constructer initializes class fields
     * 
     */    
    public Deck(){  
        
        for (int i=0;i<=51;i++){
        int flag=0;
        int b;
         
            while(flag==0){
                flag =1;
                b = (int)(Math.random()*52);
                for(int j=0;j<i;j++){
                    if( b == a[j]) flag = 0; 
                }
                if (flag==1){ 
                    a[i] = b; 
                }
            }
        }
 
        int index=0;
        for(int i=0; i<=3;i++){
            for(int j=0; j<=12;j++){
                Card c = new Card();
                if(i==0) c.setName(Suit.H);
                if(i==1) c.setName(Suit.C);
                if(i==2) c.setName(Suit.S);
                if(i==3) c.setName(Suit.D);
        
                if(j==0){ c.setName(Rank.TWO); c.setName(2);}
                if(j==1){ c.setName(Rank.THREE);c.setName(3);}
                if(j==2){ c.setName(Rank.FOUR); c.setName(4);}
                if(j==3){ c.setName(Rank.FIVE); c.setName(5); }
                if(j==4){ c.setName(Rank.SIX); c.setName(6);}
                if(j==5){ c.setName(Rank.SEVEN); c.setName(7);}
                if(j==6){ c.setName(Rank.EIGHT); c.setName(8);}
                if(j==7){ c.setName(Rank.NINE); c.setName(9); }
                if(j==8){ c.setName(Rank.TEN); c.setName(10); }
                if(j==9){ c.setName(Rank.J); c.setName(10); }
                if(j==10){ c.setName(Rank.Q); c.setName(10); } 
                if(j==11){ c.setName(Rank.K); c.setName(10);} 
                if(j==12){ c.setName(Rank.A); c.setName(1);}
    
                c.setID(a[index]);
                d.add(c);
                index++;
        
           
           }
        }
    }
}

