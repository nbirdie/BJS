/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *This class create the game
 * @author anya
 */
public class BlackjackSolitaire {
    
    Deck d = new Deck();  // the deck of the cads
    String table[] = new String[20]; // The playing table
    int [] tableVal = new int[20];   // The Score of table cards
    
    int col; // количество карт на столе
    int trash; // сброшенные карты
    int sum; // итоговая сумма
    
    /***
     * The constructer initializes class fields
     */
    BlackjackSolitaire(){
        for(int i=1;i<=20;i++){
            table[i-1]=""+i;
            tableVal[i-1]=0;
        }
        col = 0;
        trash = 0;
        sum = 0;
    
    }
    
    /***
     * The Method prints the playing table
     */
    
    void printTable(){
        System.out.println();
        System.out.println("The Table:                              "+"The Trash:"   );
    
        for(int k=0;k<5;k++){
            if(table[k].length()==1) System.out.print(table[k]+"      ");
            if(table[k].length()==2) System.out.print(table[k]+"     ");
            if(table[k].length()==3) System.out.print(table[k]+"    ");
        }
    
        System.out.print("     ");
        for(int k=16;k<18;k++){
            if(table[k].length()==1) System.out.print(table[k]+"      ");
            if(table[k].length()==2) System.out.print(table[k]+"     ");
            if(table[k].length()==3) System.out.print(table[k]+"    ");
        }
        System.out.println();
        for(int k=5;k<10;k++){
            if(table[k].length()==1) System.out.print(table[k]+"      ");
            if(table[k].length()==2) System.out.print(table[k]+"     ");
            if(table[k].length()==3) System.out.print(table[k]+"    ");
        }
  
        System.out.print("     ");
        for(int k=18;k<20;k++){  
            if(table[k].length()==1) System.out.print(table[k]+"      ");
            if(table[k].length()==2) System.out.print(table[k]+"     ");
            if(table[k].length()==3) System.out.print(table[k]+"    ");
        }
        System.out.println();
        System.out.print("       ");
        for(int k=10;k<13;k++){
            if(table[k].length()==1) System.out.print(table[k]+"      ");
            if(table[k].length()==2) System.out.print(table[k]+"     ");
            if(table[k].length()==3) System.out.print(table[k]+"    ");
        }
        System.out.println();
        System.out.print("       ");
        for(int k=13;k<16;k++){
            if(table[k].length()==1) System.out.print(table[k]+"      ");
            if(table[k].length()==2) System.out.print(table[k]+"     ");
            if(table[k].length()==3) System.out.print(table[k]+"    ");
        }
        System.out.println();
    }
    
    /***
     * The Method calculates the score of the line or the colomn 
     * @param sumOfLine - the value of the line/colomn
     * @sum - the score jf the line/colomn
     */
    
    int sum(int sumOfLine){
            if(sumOfLine<22){ 
            if (sumOfLine==21) sum = sum + 7;
            if (sumOfLine==20) sum = sum + 5;
            if (sumOfLine==19) sum = sum + 4;
            if (sumOfLine==18) sum = sum + 3;
            if (sumOfLine==17) sum = sum + 2;
            if (sumOfLine<17) sum++;                  
             }
    return sum;
    }
    
      /***
     * The Method calculates the score of the line or the colomn 
     * @param sumOfLine - the value of the line/colomn
     * @a_col - number of Aces in a row
     * @sum - the score jf the line/colomn
     */
    
    int sumLine(int sumOfLine, int a_col){
        
        if(a_col==0){
            sum=sum(sumOfLine);
        }
        else{
            if(a_col==1){
            if((sumOfLine+10)<=21){ sumOfLine=sumOfLine+10; }
            
            sum=sum(sumOfLine);
            }else{
                if(a_col==2){
                if((sumOfLine+20)<22) { 
                    sumOfLine=sumOfLine+20;
                }
                else{
                     if((sumOfLine+10)<22) sumOfLine=sumOfLine+10;
                }
                
                    sum=sum(sumOfLine);
                    }
                
             
                }
            }
        return sum;
    }

    
    /***
     * The Method calculates the score of the game
     */
    void score(){
        //1st line 
        int a_col=0; // количество тузов в строке
        int sumOfLine = 0 ; // the value of line or colomn
        for(int i1=0;i1<5;i1++) {
            sumOfLine =  sumOfLine + tableVal[i1];
            if(tableVal[i1]==1) a_col++;
        }
        sum = sumLine(sumOfLine, a_col);         //           System.out.println(sum+ " " + sumOfLine);         
        
        //2st line 
        a_col=0;
        sumOfLine = 0 ;
        for(int i1=5;i1<10;i1++){ 
            sumOfLine =  sumOfLine + tableVal[i1];
            if(tableVal[i1]==1) a_col++;
        }
        sum = sumLine(sumOfLine, a_col);//SumLine(sumOfLine);       //        System.out.println(sum+ " " + sumOfLine); 
        
        //3st line 
        a_col=0;
        sumOfLine = 0 ;
        for(int i1=10;i1<13;i1++){
            sumOfLine =  sumOfLine + tableVal[i1];
            if(tableVal[i1]==1) a_col++;
        }
        sum = sumLine(sumOfLine, a_col);// SumLine(sumOfLine); //         System.out.println(sum+ " " + sumOfLine);  
                
        //4st line 
        a_col=0;
        sumOfLine = 0 ;
        for(int i1=13;i1<16;i1++){ 
            sumOfLine =  sumOfLine + tableVal[i1];
            if(tableVal[i1]==1) a_col++;
        }
        //        System.out.println(A_col+" "+ sumOfLine);  
        sum = sumLine(sumOfLine, a_col);//SumLine(sumOfLine); //   System.out.println(sum+ " " + sumOfLine);  
         
        //1st colomn
        a_col=0;
        sumOfLine = 0 ;
        if(tableVal[0]==1){ 
            if(tableVal[5]==10) sum = sum+10;
        }
        else{
            if(tableVal[5]==1){
                if(tableVal[0]==10)sum = sum +10;
            }
            else{ 
                if(tableVal[0]==1) a_col++;
                if(tableVal[5]==1) a_col++;
                sumOfLine = tableVal[0] + tableVal[5];
                sum = sumLine(sumOfLine, a_col);//SumLine(sumOfLine); //   System.out.println(sum+ " " + sumOfLine); 
            }
        }  
          
        //5st colomn
        a_col=0;
        sumOfLine = 0 ;
        if(tableVal[4]==1){ 
            if(tableVal[9]==10) sum = sum +10;
        }
        else{
            if(tableVal[9]==1){
                if(tableVal[4]==10 )sum = sum+10;
            }
            else {
                if(tableVal[4]==1)a_col++;
                if(tableVal[9]==1) a_col++;
                sumOfLine =   tableVal[4] + tableVal[9];
                sum = sumLine(sumOfLine, a_col);//SumLine(sumOfLine); //        System.out.println(sum+ " " + sumOfLine); 
            }
        } 
                
        //2st colomn
        a_col=0;
        sumOfLine = 0 ;
        if(tableVal[1]==1) a_col++;
        if(tableVal[6]==1) a_col++;
        if(tableVal[10]==1) a_col++;
        if(tableVal[13]==1) a_col++;
        sumOfLine =   tableVal[1] + tableVal[6] +  tableVal[10] + tableVal[13];
        sum = sumLine(sumOfLine, a_col);// SumLine(sumOfLine);//    System.out.println(sum+ " " + sumOfLine); 
        
        //3st colomn
        sumOfLine = 0 ;
        a_col=0;
        if(tableVal[2]==1) a_col++;
        if(tableVal[7]==1) a_col++;
        if(tableVal[11]==1)a_col++;
        if(tableVal[14]==1) a_col++;
        sumOfLine =   tableVal[2] + tableVal[7] +  tableVal[11] + tableVal[14];
        sum = sumLine(sumOfLine, a_col);//SumLine(sumOfLine);//      System.out.println(sum+ " " + sumOfLine); 
                      
        //4st colomn
        sumOfLine = 0 ;
        a_col=0;
        if(tableVal[3]==1) a_col++;
        if(tableVal[8]==1) a_col++;
        if(tableVal[12]==1) a_col++;
        if(tableVal[15]==1) a_col++;
        sumOfLine =   tableVal[3] + tableVal[8] +  tableVal[12] + tableVal[15];
        sum = sumLine(sumOfLine, a_col);//SumLine(sumOfLine);//      System.out.println(sum+ " " + sumOfLine); 
        
    }
    
    /***
     * the method play the game
     */
    void play(){
        int i =0;
        String currentCard;  // Save how the current card look
        Scanner sc = new Scanner(System.in);  // Input stream
        int place;    // the entered place of the card as int
        String placeS;  // the entered place of the card as String
        boolean flag;   // Flag - if incorrect number
        
        while(col-trash<16){
            printTable();
            if(trash<=3) System.out.print("The card is " + d.d.get(d.a[i]).getCard((d.d.get(d.a[i])).rank, (d.d.get(d.a[i])).suit)+". Where do you want to put it? (Also you can put it into the trash):  " );
            else System.out.print("The card is " + d.d.get(d.a[i]).getCard((d.d.get(d.a[i])).rank, (d.d.get(d.a[i])).suit)+". Where do you want to put it? (The Trash is full):" );
            
            while (true) {
                try {       
                    place=sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please, put the correct data: ");
                    sc.next();
                }
            }
                
            if(place<=20){
                if(place>0){
                    placeS = String.valueOf(place);
                    flag=(placeS.equals(table[place-1])); 
        
                    if( !flag ) System.out.println("Place has been filled, try another");
        
                    else{
                        if (place>16) trash++;
                        table[place-1]=d.d.get(d.a[i]).getCard((d.d.get(d.a[i])).rank, (d.d.get(d.a[i])).suit);
                        tableVal[place-1]=(d.d.get(d.a[i])).val;
                        col++;
                        i++;
                    }
                } 
                else System.out.print("You entered an incorrect number!!! Please, try arain :) ");
            } 
            else System.out.print("You entered an incorrect number!!! Please,try arain :) ");
        }
        
        printTable();
        score();
        System.out.println("Your score: "+ sum);
    }
    
}
