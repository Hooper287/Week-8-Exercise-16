/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.Collections;
/**
 *
 * @author RyanH
 */


/*
The panel is going to hold all the jumpers for the round. The panel has it's own
Generate object to generate the jump lengths and scores.

The panel will hold information like the round number, 
*/


public class Panel {
    private ArrayList<Jumper> jumpers;
    private int roundNum;
    private jumpComparator comparator;
            
            
    public Panel(){
        this.jumpers = new ArrayList<Jumper>();
        this.roundNum = 0;
        this.comparator = new jumpComparator();
    }
    
    public void nextRound(){
        this.roundNum ++;
        
    }
    
    public void add(String name){
        
        jumpers.add(new Jumper(name));
        
    }
    
            
    
            
    public int getRound(){
        return this.roundNum;
    }
    //this is supposed to sort them from lowest points to greatest
    //returning a list of Jumper objects that are ordered properly.
    public ArrayList<Jumper> sortJumpers(){
       Collections.sort(jumpers, comparator);
       Collections.reverse(jumpers);
       return this.jumpers;
    }
    //this is supposed to sort them from highest poitns to lowest
    //returning a list of Jumper objects that are ordered properly.
    public ArrayList<Jumper> sortForWin(){
        Collections.sort(jumpers, comparator);
        return this.jumpers;
    }
    
    //runs the judgeScores method in the jump object
    public ArrayList<Integer> judge(Jump jump){
        return jump.judgeScores();
        
    }
    
    
    
    
}
