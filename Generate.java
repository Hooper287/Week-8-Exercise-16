/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author RyanH
 */
public class Generate {
    private Random generator;
    
    public Generate(){
        this.generator = new Random();
    }
    
    public int jump(){
        return generator.nextInt(60) + 61;
    }
    
    public int score(){
        return generator.nextInt(10) + 11;
    }
        
}
