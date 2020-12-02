package ch.bbw.jl.craps;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

/**
 * Craps.java
 * @author Jamie Lam
 * @version 24.01.2020
 */
public class Craps
{
   private Dice dice;
   private int diceNumber1;
   private int diceNumber2;
   private int[] diceNumbers;

   public Craps(Dice dice)
   {
      this.dice = dice;
   }

   public boolean play()
   {
      int sum=0;
      int oldSum=0;

      // first round
      sum = dice.roll();
      
      int tempSum = sum;
      
      sum = sum + dice.roll();

      setNumbers(tempSum, sum - tempSum);

      switch (sum)
      {
         // Get one of these cases then you'll win!
         case 7:
         case 11:
            return true;

         // Get one of these cases then you'll lose...
         case 2:
         case 12:
         case 3:
            return false;

         default:
            break;
      }
      
      // second round
      while (true)
      {
         oldSum=sum;
         sum = dice.roll();
         sum = sum + dice.roll();
         
         if (sum == oldSum) {
            return true;
         } else if (sum == 7) {
            return false;
         }
      }
   }
   
   public void setNumbers(int diceNumber1, int diceNumber2) {
	   this.diceNumber1 = diceNumber1;
	   this.diceNumber2 = diceNumber2;
   }
   
   public int[] getDiceNumbers() {
	   return new int[] {diceNumber1, diceNumber2};
   }

}