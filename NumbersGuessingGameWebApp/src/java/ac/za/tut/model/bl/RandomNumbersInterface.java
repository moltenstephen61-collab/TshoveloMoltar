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
public interface RandomNumbersInterface {
    //
    int createRandomNumber();
    boolean compareGuess(int generatedNum , int user_answer);
    //
}
