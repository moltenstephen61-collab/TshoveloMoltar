/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class RandomNumbersManager implements RandomNumbersInterface{

    @Override
    public int createRandomNumber() {
     //
     int generateNum = (int)Math.floor(Math.random()*10) +1;
     //
     return generateNum;
    }

    @Override
    public boolean compareGuess(int generatedNum, int user_answer) {
     // 
     boolean areTheSame = false; 
     if(generatedNum == user_answer){
         areTheSame = true;
     }
     //
     return areTheSame;
    }
    
}
