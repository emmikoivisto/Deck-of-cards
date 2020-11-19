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


    public void populateCards(){
        for (RankType rank : RankType.values());{
        for (SuitType suit : SuitType.values());
        Card card = new Card(suit, rank);
        cards.add(card);}
    }

}
