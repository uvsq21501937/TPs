/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_2;

/**
 *
 * @author Yarmanuel
 */
public class Game {
    private int score=0;
    
    public void roll(int pins){
        score+=pins;
    }
    public int score(){
        return score;
    }
}
