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
public interface FibonacciInterface {
    // generate a random number
    int createRandom();
    // make Fibonacci
    int createFibonacci( int number);
    //
    boolean checkFibonacci(int current , int generated_number);
    
}
