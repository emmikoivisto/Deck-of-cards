import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card playingCard;

    @Before
    public void before(){
        playingCard = new Card(SuitType.CLUBS, RankType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.CLUBS, playingCard.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, playingCard.getRank());
    }

    @Test
    public void cardHasValueOfThree(){ assertEquals(1, playingCard.getValueRank());}

}
