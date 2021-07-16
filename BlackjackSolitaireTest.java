/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anya
 */
public class BlackjackSolitaireTest {
    
    BlackjackSolitaire instance;

    
    public BlackjackSolitaireTest() {
        instance = new BlackjackSolitaire();
    }
    
//    @Test
//    public void printTableTest(){
//    
//    }
    
    @Test
    public void sumTest(){
        int expected = 5;
        int actual = instance.sum(20);
        assertEquals(expected, actual);
               
    
    }
    
      @Test
       public void sumLineTest(){
        int expected = 3;
        int actual = instance.sumLine(8,1); // если сумма баллов 8, но при этом 1 балл-туз. всего 1 туз. Баллы пересчитываются с 8 до 18 и итоговые баллы  - 3.
        assertEquals(expected, actual);
        
        expected = 7;
        instance.sum = 0;
        actual = instance.sumLine(21,0); 
        assertEquals(expected, actual);
        
        expected = 7;
        instance.sum = 0;
        actual = instance.sumLine(11, 2); //2 туза пока по 1 баллу посчитаны
        assertEquals(expected, actual);
               
    
    }
       
       @Test
       public void scoreTest(){ 
       // ПРИМЕР ИЗ СКРИНА, КОТОРЫЙ БЫЛ В ЗАДАНИИ К ПРОЕКТУ
       int expected = 42;
       instance.tableVal[0] = 1;
       instance.tableVal[1] = 5;
       instance.tableVal[2] = 3;
       instance.tableVal[3] = 2;
       instance.tableVal[4] = 10;
       instance.tableVal[5] = 10;
       instance.tableVal[6] = 4;
       instance.tableVal[7] = 2;
       instance.tableVal[8] = 10;
       instance.tableVal[9] = 1;
       instance.tableVal[10] = 7;
       instance.tableVal[11] = 8;
       instance.tableVal[12] = 3;
       instance.tableVal[13] = 3;
       instance.tableVal[14] = 6;
       instance.tableVal[15] = 10;
       instance.score();
       int actual = instance.sum;
       assertEquals(expected, actual);
       
       // ПРИМЕР ИЗ СКРИНА, КОТОРЫЙ БЫЛ В ЗАДАНИИ К ПРОЕКТУ
       instance.sum=0;
       expected = 67;
       instance.tableVal[0] = 10;
       instance.tableVal[1] = 2;
       instance.tableVal[2] = 5;
       instance.tableVal[3] = 3;
       instance.tableVal[4] = 1;
       instance.tableVal[5] = 1;
       instance.tableVal[6] = 4;
       instance.tableVal[7] = 4;
       instance.tableVal[8] = 2;
       instance.tableVal[9] = 10;
       instance.tableVal[10] = 5;
       instance.tableVal[11] = 9;
       instance.tableVal[12] = 7;
       instance.tableVal[13] = 10;
       instance.tableVal[14] = 3;
       instance.tableVal[15] = 8;
       instance.score();
       actual = instance.sum;
       assertEquals(expected, actual);
       
       }
    
}
