/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seane
 */
public class start {
    public int counter;
    ArrayList <Integer> wins= new ArrayList<>();
    ArrayList <Integer> losses= new ArrayList<>();
    public int random;
    public int num;
    Random rand=new Random();
    ArrayList <String> words=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    String choice;
    public boolean prompt(){
        System.out.println("Do you want to play another game? Y/N:");
        choice=scan.next();
        if(choice.equalsIgnoreCase("y")){
            return true;
        }else{
            return false;
        }
    }

    public start() {
        System.out.println(counter);
        populateWords();
        pickword();
        play();
        
        
    }
    public void populateWords(){
        words.add("Bird");
        words.add("Taco");
        words.add("Fish");
        words.add("House");
        words.add("Animal");
        words.add("Whale");
        words.add("Horse");
        words.add("Cloud");
        words.add("Tree");
        words.add("Computer");
        words.add("Java");
        words.add("Hangman");
        words.add("Guess");
        words.add("Guest");
        
        
    }
    public void pickword(){
        random = (int)(Math.random() * words.size() - 1);        
        num=words.get(random).length();
        
        
        
    }
    public void play(){
        int lives=5;
        String solved[]=new String[num];
        for(int i=0; i<num; i++){
            solved[i]=" ___ ";
        }
        for(int i=0; i<num; i++){
            System.out.print(solved[i]);
    }
        System.out.println("");
        char[] word=new char[num];
        for(int i=0; i<num; i++){
            word[i]=words.get(random).charAt(i);
        }
        System.out.println("");
        for(int j=0; j<1; j++){
        System.out.println("Guess a letter: ");
        String answer=scan.nextLine();
        int counter=0;
        int safe=0;
        for(int i=0; i<num; i++){
            if (answer.charAt(0)==word[i]){
                solved[i]=answer;
                safe++;
            }
            if(!solved[i].equals(" ___ ")){
                counter++;
                  
            }
            if(counter==num){
                 System.out.println("You won");
                 wins.add(1);
                 System.out.print("The word was: ");
            for(int k=0; k<word.length; k++){
            System.out.print(word[k]);
            }
                System.out.println("");
                 j++;
            }
            
                      
           
        }
        System.out.println("");
        for(int i=0; i<num; i++){
            System.out.print(" "+solved[i]+" ");
          
        }
        j--;
        if (safe==0){
            System.out.println("");
            System.out.println("You lost a life ");
            System.out.println("Lives remaining: "+(lives-1));
            lives--;
        }
        if (lives==0){
            System.out.println("");
            System.out.println("You lost");
            losses.add(1);
            System.out.print("The word was: ");
            for(int i=0; i<word.length; i++){
            System.out.print(word[i]);
            }
            System.out.println("");
            
            j++;
        }
        }
        
    }
    
   public boolean wl(){
       if (wins.isEmpty()){
           return false;
       }
       
       else{
           return true;
       }
       
   }
}
