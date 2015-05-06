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
     return "TODO: String of Best Hand; may need helper methods";
   }
   /*private String isRoyalFlush(){

   }
   */
   public int compareTo(Object x){
      Hand other = (Hand)x;
      //TODO: Compare hands by ordering above; return -1, 1, or 0
      for (int x=0; x<6; x++) //cycle through values
       {
           if (this.value[x]>that.value[x])
               return 1;
           else if (this.value[x]<that.value[x])
               return -1;
       }
       return 0; //if hands are equal
   }
}
