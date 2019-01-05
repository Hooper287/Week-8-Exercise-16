/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author RyanH
 */
public class Jump {
    private Generate generator;
    
    
    public Jump()
    {
        this.generator = new Generate();
    }
    
    
    //return random jump distance for this jump, between 60 and 120    
    public int jumpLength()
    {
        return generator.jump();
    }      
    
    //return judges' response for this jump 
    //which is an arraylist of 5 random ints between 10 and 20
    public ArrayList<Integer> judgeScores()
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        for(int i = 0; i < 5; i++)
        {
            scores.add(generator.score());
        }            
        
        return scores;
        
    }
    
    //removes min and max from score list
    public ArrayList<Integer> trimScore(ArrayList<Integer> list){
       list.remove(Collections.min(list));
       list.remove(Collections.max(list));
       return list;
    }
    
    
}
