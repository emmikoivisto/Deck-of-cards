import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card){
       this.hand.add(card);
    }

    public int countHand(){
        return this.hand.size();
    }

}
