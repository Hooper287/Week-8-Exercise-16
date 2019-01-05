/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RyanH
 */
public class UI {
    private Scanner reader;
    private Panel panel;
        
    
    public UI(){
        this.reader = new Scanner(System.in);
        this.panel = new Panel();
    }
    //starts the game
    public void start(){
        System.out.println("Kumpula ski jumping week\n");
        while(true){
            
            //runs first part, where you type the name
            this.name();
            //runs 2nd part, where you can say 'jump' and the Jumpers do their jumps
            this.tournament();
            //runs 3rd part, where you're shown the results of the tournament
            this.endResults();
            
            break;
        }
    }
    /*
    Asks the user for names, which get past to a method in the panel class
    which creates a new Jumper object and adds it to a list.
    */
    public void name(){
        System.out.println("Write the names of the participants one at a "
                    + "time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.isEmpty()){                
                break;                
            }else{
            panel.add(name);                
            }
        }       
        System.out.println("");
        
    }
    
    /*
    Runs the tournament portion of the game, which is where the Contestants
    (Jumpers) being the jumping() process. SEE JUMPING()
    */
    public void tournament(){
        System.out.println("The tournament begins!\n ");
        while(true){
           
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            
            String option = reader.nextLine();
            if (option.equals("jump")){
                System.out.println("");
                jumping();
                
            }else{
                System.out.println("");
                System.out.println("\nThanks!\n");
                break;
            }
        }
    }
    /*
    In hindsight I might've been able to remove a bunch of steps here: 
    jumpOrder sorts the jumpers from least to greatest points and they Jump
    in that order (executeJumps())
    */
    public void jumping(){
        panel.nextRound();
        System.out.println("Round " + panel.getRound());
        System.out.println("");
        this.jumpOrder();
        this.executeJumps();
        System.out.println("");
       
        
    }
    //orders the jumpers from least points to greatest, they jump in that order
    public void jumpOrder(){
        System.out.println("Jumping order: ");
        
        int size = panel.sortJumpers().size();
        ArrayList<Jumper> jumpees = panel.sortJumpers();
        for(Jumper jumper : jumpees){
            System.out.println("  " + (jumpees.indexOf(jumper)+1) +". "  + jumper);
        }
        System.out.println("");
    }
    //for each Jumper, they now run the jump method in their own object
    
    public void executeJumps(){
        System.out.println("Results of round " + panel.getRound());
        for(Jumper jumper : panel.sortJumpers()){
            jumper.jump();
            
        }
        
        
        
        
    }
    //prints the end results
    public void endResults(){
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        ArrayList<Jumper> finals = panel.sortForWin();
       for(Jumper jumper :finals){
            System.out.println((finals.indexOf(jumper)+1) +"           " + jumper);
            System.out.println("            jump lengths: " + jumper.getLengths());
        }
        
    }
    
    
    
    
    
}
