package ch.bbw.jl.craps;

import java.util.Random;

/**
 * Dice.java
 * @author Jamie Lam
 * @version 24.01.2020
 */
public class Dice
{
   private Random random;
   
   public Dice()
   {
      random = new Random();
   }
   
   public int roll()
   {
      return (random.nextInt(5)+1); 
   }
}
