/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments3;
import javax.swing.*;
/**
 *
 * @author CHITAPAIN DISHTI
 */
public class GAMEBOARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, " Welcome to the Board Game.");
        //we consider a two-dimensional array:3 rows and 3 columns
        //we declare the two-dimentional array BoardGame of the data type int
   
        int[][] BoardGame = new int[3][3];
        //populate the array with integer data values
        
        /*we use an inner for loop to populate the array  
          inner for loop: moves accross each row one after the other
          outer for loop: moves across each column one after another
        */
        int counter1,counter2,alter=1;//alter to alternate between player and computer
        String input;
        for(counter1=0;counter1<3;counter1=counter1+1){//outer loop
            for(counter2=0;counter2<3;counter2=counter2+1){//inner loop
                if (alter==1){
              
             do{
                 input = JOptionPane.showInputDialog( " Enter integer values ");
                
                //store values in the array 
                BoardGame[counter1][counter2]=Integer.parseInt(input);
                
                if(BoardGame[counter1][counter2]<1 || BoardGame[counter1][counter2]>2){
                  JOptionPane.showMessageDialog(null, "The value is invalid,Please enter the value 1 or 2");
                 }
             }while(BoardGame[counter1][counter2]<1 || BoardGame[counter1][counter2]>2);
                alter=2;
                }else{
                  //Now,it is the program's turn to play:  
                    BoardGame[counter1][counter2]=random();
                    alter=1;
                }
            }
          }int sum,sum1;
           String output1 =" ";
           output1 = " Better luck next time!!/nYou lose the game. ";
           //Verify if the alter has won
           //To verify if the alter gets the three identical numbers in any rows.
           for(sum=0;sum<3;sum++){
               if(BoardGame[0][sum]==BoardGame[1][sum]){
                  if(BoardGame[1][sum]==BoardGame[2][sum]){
                      output1 = "Congratulations.\n You win the game!!!";
                    }
                 }
             }
               
             //To verify if the alter gets the three identical numbers in any columns.
           for(sum1=0;sum1<3;sum1++){
               if(BoardGame[0][sum1]==BoardGame[1][sum1]){
                  if(BoardGame[1][sum1]==BoardGame[2][sum1]){
                      output1 = "Congratulations.You win the game!!!";
                    }
                 }
             }  
            JOptionPane.showMessageDialog(null, output1);
            
            //Display the BoardGame
            String output2 ="";
            JTextArea popo = new JTextArea();
            output2 = output2 + "List of elements in 2-dimentional array" + "\n";
            int counter3,counter4,count=1;
            for(counter3 = 0;counter3<3;counter3+=1){//outer loop
                for(counter4=0;counter4<3;counter4++,count+=1){//inner loop
                output2 = output2 + BoardGame[counter3][counter4] + " "; 
                if(count%3==0)output2 = output2 + "\n";
              
            }
         }
            popo.setText(output2);
            JOptionPane.showMessageDialog(null, popo);
            System.exit(0);   
         
        }
        //method to generate random numbers range 1-2
         public static int random(){
             return(int)(Math.random()*2)+1;
                    
    
         }
    
}
