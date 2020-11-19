import org.junit.Before;

public class CardTest {

    Card playingCard;

    @Before
    public void before(){
        playingCard = new Card(SuitType.CLUBS, RankType.ACE);
    }


}
