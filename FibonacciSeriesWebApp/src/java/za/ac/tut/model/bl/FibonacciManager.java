/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class FibonacciManager implements FibonacciInterface {

    @Override
    public int createRandom() {
      //  
      int randomNumber = (int)Math.floor(Math.random()*(100- 2 + 1) ) +2;
      //
      return randomNumber; 
    }

    @Override
    public int createFibonacci(int number) {
     //
     if (number <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (number == 1 || number == 2) {
            return 1; // first two numbers are 1
        }

        int previous = 1;
        int current = 1;
        int next = 0;

        for (int i = 3; i <= number; i++) {
            next = previous + current; // formula: next = previous + current
            previous = current;        // shift forward
            current = next;
        }

        return current;
    }
    //

    @Override
    public boolean checkFibonacci(int current, int generated_number) {
     //
     boolean isValid = false;
     //
     if(current == generated_number){
         isValid = true;
     }
     //
     return isValid;
    }
    
}
