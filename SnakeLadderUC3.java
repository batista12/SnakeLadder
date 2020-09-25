public class SnakeLadderUC3 {
   public static void main(String[] args){
   
      int rollDice =(int)(Math.random() * 6) +1;
      int PLAYER_POSITION=0;
      int option =(int)(Math.random() * 3);
      switch(option){
      case LADDER:
                  PLAYER_POSITION+=rollDice;
                  System.out.println("Ladder " + PLAYER_POSITION);
                  break;
      case SNAKE:
                  PLAYER_POSITION-=rollDice;
                  System.out.println("Snake " + PLAYER_POSITION);
                  break;
       default:
                  System.out.println("No Play" + PLAYER_POSITION);
      
   }
}
}
