 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author seane
 */
public class Game {
boolean keepplaying=true;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double wins=0;
        double losses=0;
        double winrate;
       for(int i=0; i<1; i++){
           start newgame=new start();
           if(newgame.prompt()==true){
              if (newgame.wl()){
        wins++;
              }else{
                  losses++;
              }
        System.out.println("Wins "+ wins);
        System.out.println("Losses "+ losses);
        if(wins>0){
            winrate=((wins/(wins+losses))*100);
            System.out.println("Winrate:"+winrate+"%");
        }
               i--;
           }
       }
    }
    
}
