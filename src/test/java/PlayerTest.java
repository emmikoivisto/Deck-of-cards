import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void setUp(){
        player = new Player("Malcolm");
        card = new Card(SuitType.HEARTS, RankType.EIGHT);
    }


    @Test
    public void canAddCard(){
        player.addCard(card);
        assertEquals(1, player.countHand());
    }

//    @Test
//    public void canGetCard(){
//        assertEquals(1, player.countHand());
//    }

}
