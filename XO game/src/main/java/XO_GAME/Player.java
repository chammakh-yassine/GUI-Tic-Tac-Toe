
package XO_GAME;


import java.lang.Math;


    public class Player {
        private char mark;
        private String name;
        private int count=0;
        private int playednumbers []=new int[10];

    public char getMark(int play) {
        this.playednumbers[this.count]=play;
        this.count++;
        return mark;
    }
    public char getMark() {
        return mark;
    }
    public boolean check_input(int play){
        for (int i = 0; i < 5; i++) {
            if(this.playednumbers[i]==play){
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        if(count==5) System.out.println("WoW a Draw!!");
        return count;
    }
    
    

    
    

    

   
    
    public boolean check_win(){
        for (int j = 0; j < 3; j++) {
            int v=0,h=0,S1=0,S2=0;
            
            for(int i=0;i<count;i++){
                int x  =playednumbers[i];
                int Row = (int) Math.ceil(((double) x)/3 -1);
                int Col = (int) (x -3*(Math.ceil(((double) x)/3 -1))-1);
               if(Row == j){
                   h++;
               }
               if(Col == j){
                   v++;
               }
               if(x==5 || (Col==0&&Row==0) || (Col==2&&Row==2)){
                   S1++;   
               }
               if(x==5 || (Col==0&&Row==2)||(Col==2&&Row==0)){
                   S2++;
               }
           }
            if(v==3||h==3||S1==3||S2==3){
                
                return true;
            } 
       }
       return false;
    }
    }
