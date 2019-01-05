/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author RyanH
 */
public class jumpComparator implements Comparator<Jumper> {
    
    public int compare(Jumper jumper1, Jumper jumper2){
        return jumper2.getScore() - jumper1.getScore();
    }
    
}
