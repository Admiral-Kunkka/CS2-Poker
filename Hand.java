import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush
   Straight Flush
   Four of a Kind
   Full House
   Flush
   Straight
   Three of a Kind
   Two Pair
   One Pair
   High Card
   WORST
   */
   public String handValue() {
     return "";
   }
   private boolean isFlush(){
     String suit =hand.get(0).suit;
     for(Card c : hand){
       if(c.suit.equals(suit))
        return false;
     }
     return true;
   }
   private boolean isStraight(){
      for(int i =0;i<4;i++){
        if(hand.get(i).value+1 != hand.get(i+1).value)
          return false;
      }
      return true;
   }
   private boolean hasRow(int feels){
     int matching = 0;
     int val = hand.get(0).value;
     for(Card c : hand){
       if(c.value == val)
        matching++;
      else{
          matching = 1;
          val = c.value;
      }
     }
     return feels == matching;
   }
   private boolean isFullHouse(){
      if(hasRow(3) && hand.get(3).value == hand.get(4).value)
        return true;
      return (hasRow(2) && hasRow(3) && hand.get(2).value == hand.get(4).value);
   }
   private boolean isTwoPair(){
     boolean pair1 = false;
     boolean pair2 = false;
     for(int i=0;i<hand.size();i++){
       if(hand.get(i).value == hand.get(i+1).value){
         if(pair1)
          pair2 = true;
        else
          pair1 = true;
       }
     }
     return pair1 && pair2;
   }




   public int compareTo(Object x){
      Hand other = (Hand)x;


       return 0; //if hands are equal
   }
}
