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
    public voidDeckStartsEmpty(){
    assertEquals(0, deck.countCards());
        }
        
        

}
