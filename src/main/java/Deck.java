import java.util.ArrayList;

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
    
    
}
