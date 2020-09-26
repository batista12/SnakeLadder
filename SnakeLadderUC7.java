public class SnakeLadderUC7 {

   
     public static void main(String[] args){
      int PLAYER_POSITION1=0,PLAYER_POSITION2=0,Count=0,Times1=0,Times2=0,option=0;
      while(PLAYER_POSITION1<100 && PLAYER_POSITION2<100){
      Count++;
      if(Count%2==0){
      do{
      int rollDice =(int)(Math.random() * 6) +1;
      System.out.println("Dice Roll " + rollDice);
      option =(int)(Math.random() * 3);
      switch(option){
      case 1:
                  PLAYER_POSITION1+=rollDice;
                  System.out.println("Ladder");
                  break;
      case 2:
                  PLAYER_POSITION1-=rollDice;
                  System.out.println("Snake");
                  break;
       default:
                  System.out.println("No Play");

   }Times1++;
   if(PLAYER_POSITION1<0)
   PLAYER_POSITION1=0;
   if(PLAYER_POSITION1>100)
   PLAYER_POSITION1=rollDice;
   System.out.println("Current position : " + PLAYER_POSITION1);
   
   }while(PLAYER_POSITION1 !=100 && option==1);
   
   }else{
 
      
      do{
      int rollDice =(int)(Math.random() * 6) +1;
      System.out.println("Dice Roll " + rollDice);
      option =(int)(Math.random() * 3);
      switch(option){
      case 1:
                  PLAYER_POSITION2+=rollDice;
                  System.out.println("Ladder");
                  break;
      case 2:
                  PLAYER_POSITION2-=rollDice;
                  System.out.println("Snake");
                  break;
       default:
                  System.out.println("No Play");

   }Times2++;
   if(PLAYER_POSITION2<0)
   PLAYER_POSITION2=0;
   if(PLAYER_POSITION2>100)
   PLAYER_POSITION2=rollDice;
   System.out.println("Current position : " + PLAYER_POSITION2);
   
   }while(PLAYER_POSITION2 !=100 && option==1);
   
   }}
   
   if(PLAYER_POSITION1==100)
   System.out.println("player 1 is winner with count " + Times1);
   else
   System.out.println("player 2 is winner with count " + Times2);
}
}
