import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
  public static void main(String[] args) {
    //Create Deck
    String[] deck = {"2club","3club","4club","5club","6club","7club","8club","9club","10club","Jclub","Qclubs","Kclubs","Aclubs" ,"2heart","3heart","4heart","5heart","6heart","7heart","8heart","9heart","10heart","Jheart","Qheart","Kheart","Aheart","2diamond","3diamond","4diamond","5diamond","6diamond","7diamond","8diamond","9diamond","10diamond","Jdiamond","Qdiamond","Kdiamond","Adiamond","2spade","3spade","4spade","5spade","6spade","7spade","8spade","9spade","10spade","Jspade","Qspade","Kspade","Aspade"};
    //Shuffle Deck
    //List<String> deckList = Arrays.asList(deck);

    List<String> al = new ArrayList<>();
    for(int i=0;i < deck.length;++i) {
      al.add(deck[i]);
    }
    //Collections.shuffle(deckList);
    Collections.shuffle(al);
    

    System.out.println("Dealing cards");
    String card1 = al.remove(0);
    String card2 = al.remove(0);
    System.out.println("You're cards: "+card1 + " " + card2);
    //Insert deal to opponents hand
    //Create flop of 3 cards
    List<String> river = new ArrayList<>();
    for(int i=0;i < 5;++i) {
    river.add(al.remove(0));
    System.out.print("The river is: ");
    System.out.print(river.get(i));
    System.out.println();
    }
    //Insert checking players hands for pairs.
    //Check if already have
    Chance obj = new Chance();
    String[] handChar = new String[2];
    handChar[0] = card1; //al.get
    handChar[1] = card2; //used to be decklist
    String[] riverChar = new String[5];
    riverChar[0] = river.get(0);
    riverChar[1] = river.get(1);
    riverChar[2] = "river.get(2)";
    riverChar[3] = "river.get(3)";
    riverChar[4] = "river.get(4)";
    //System.out.println(obj.isPair(riverChar, handChar));
    
    //Calculating Chances
    System.out.println("Chances of a pair:");
    obj.pair(deck,riverChar,handChar);

    System.out.println("Chances of a three of a kind:");
    obj.triple(deck,riverChar,handChar);

    System.out.println("Chances of a four of a kind:");
    obj.four(deck);

    System.out.println("Chances of a full house:");
    obj.fullHouse(deck);

    System.out.println("Chances of a straight:");
    obj.straight(deck);

    System.out.println("Chances of a flush:");
    obj.flush(deck);

  }
}
// Need to have everything in just deck instead of al and deckList
//Only show chances of the first handing of cards, do this by changing the chance1,2,3 if deck does already have two of the same number


/*Pseudo code
Code hands out 2 random cards to the user
Deal two to your "opponent" // do this after
Deals 3 random cards on the table
What are your chances of getting a straight, two pair, three, four, full house, flush, royal flush,straight flush, and high card
Deal card

Give out new chances
Deal next card
Chances of you beating a random hand that is generated right then. With all of the cards that you have plus on the table accounted for.
See if you won or not // Do later
*/

/* Determining chances of getting a two pair
C(13,1) C(4,4) C(48,1) out of (52,5)
Has to take in account of cards already on table
If it is the card you want on the table then its easy just take one out of the four suits
else if its not then take one out of the 13 to pick from other suits

*/