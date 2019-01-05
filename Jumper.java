/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author RyanH
 */
public class Jumper {
    private String name;
    private int score;
    private ArrayList<Integer> lengths;
    
    
    public Jumper(String name){
        this.name = name;
        this.score = 0;
        this.lengths = new ArrayList<Integer>();
    }
    
    public int getScore(){
        return this.score;
    }
    
    public String toString(){
        
        return name + " (" + score + " points)";
    }
    
    
    // this is a bulky method so I probably did something not cool here.
  
    
    public void jump(){
        
        //fresh int for each round they jump
        int roundScore = 0;
        //creates new jump object
        Jump jump = new Jump();
        //length receives random int
        int length = jump.jumpLength();
        //adds the length to the object's list
        this.lengths.add(length);        
        //gemerate scores from judges
        ArrayList<Integer> points = jump.judgeScores();
        System.out.println("  " + this.name + "\n    " + "length: " + length);
        System.out.println("    judge votes: " + points);
        //add scores and length to points
        //removing min and max before doing final score math
        points = jump.trimScore(points);
        roundScore += length;
        for(int score : points){
            roundScore+= score;
            
        }
        this.score += roundScore;
        
    }
    
    public ArrayList<Integer> getLengths(){
        return this.lengths;
    }
}
