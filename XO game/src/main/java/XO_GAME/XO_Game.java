//Tic Tac Toe Game, simple in CUI
// our pacage for the game
package XO_GAME;
  
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
        // the class of our game 
        
public class XO_Game{
    
            static JFrame frame;
             static JLabel Text_Side, Play_Side;
            static int playturn=1, play=0;
            static boolean Game_Go_On=true;
            
            static void GUI(){
                Text_Side = new JLabel();
                Play_Side=new JLabel();
                frame = new JFrame();
                frame.setSize(1200,800);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Tic Tac Toe Game");
                Play_Side.setLayout(new GridLayout(3,3,10,10));
                Text_Side.setLayout(new GridLayout(3,3,10,10));
                Text_Side.setBounds(800, 0, 400, 800);
                Play_Side.setBounds(0, 0, 800, 800);
                Text_Side.setText("Now the Turn on");
                Text_Side.setFont(new Font("Comic Sans",Font.BOLD,50));
                Text_Side.setHorizontalAlignment(JLabel.CENTER);
                Text_Side.setVerticalAlignment(JLabel.CENTER);
                Text_Side.setForeground(Color.red);
                Text_Side.setBackground(Color.BLACK);
                Text_Side.setOpaque(true);
                Play_Side.setBackground(Color.orange);
                Play_Side.setOpaque(true);
                frame.add(Text_Side);
                frame.add(Play_Side);
                frame.setLayout(null);
                
                for(int i=1; i <10;i++){
                    Play_Side.add(new JButton(""+i){
                        @Override
                        public void setBackground(Color bg) {
                            super.setBackground(Color.white);
                            super.setFocusable(false);
                            super.addActionListener((ActionEvent e) -> {
                                if (Game_Go_On){
                                int x= Integer.valueOf(super.getText());
                                if (playturn % 2 != 0) {
                                    super.setText("O");
                                    super.setFont(new Font("Comic Sans", Font.BOLD, 150));
                                } else {
                                    super.setText("X");
                                    super.setFont(new Font("Comic Sans", Font.BOLD, 150));}
                                System.out.println("btata bsokara");
                                playturn++;
                                play=x;
                                
                                super.setEnabled(false);
                                }
                            });}});
                }
                frame.setVisible(true);
            }
         
            static void playsceen(Player player){
                play = 0;
                while(play==0){
                if (playturn%2!=0){
                    Text_Side.setText("O Turn");
                }
                else{
                    Text_Side.setText("X Turn");}
                }
                System.out.printf("%d\n",play);
                player.getMark(play);
            }
               
        static void game_loop(Player player1,Player player2){
            while(true){
                   if(playturn%2!=0){
                       playsceen(player1);
                       if( player1.check_win()){
                           Text_Side.setText("O Player wins");
                           Game_Go_On=false;
                           
                           break;
                       }
                        if(player1.getCount()==5){
                           Text_Side.setText("WoW a Draw!!");
                           Game_Go_On=false;
                           
                           break;
                        }   
                       
                   }
                   else {
                       playsceen(player2);
                       if(player2.check_win()){
                           Text_Side.setText("X Player wins");
                           Game_Go_On=false;
                          
                           break;
                       }
                   }
            }
        }

            // our main Method
            public static void main(String args[]){
               playturn=1;                    
                GUI();
                game_loop( new Player(),new Player());
                
        }
        }