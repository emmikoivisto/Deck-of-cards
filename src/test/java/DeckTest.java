import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
    assertEquals(0, deck.countCards());
        }

    @Test
    public void canPopulateDeck(){
    deck.populateCards();
    assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealCard(){ 
        deck.populateCards();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }
}
