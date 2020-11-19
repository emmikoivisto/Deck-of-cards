import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private SuitType suit;
    private RankType rank;
    private Card card;

    public Deck(){
    this.cards = new ArrayList<>();
    }

    public int countCards(){
    return this.cards.size();
    }


    public void populateCards() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffleDeckOfCards(){
        Collections.shuffle(cards);
    }

    public void dealCard(){
        cards.remove(0);
    }
}
