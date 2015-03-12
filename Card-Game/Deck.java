public class Deck extends Card
{
    int NumOfCards;
    Card[] deck = new Card [NumOfCards];

    int length ()
    {
	return NumOfCards;
    }


    Card At (int i)
    {
	return deck [i];
    }


    void standard ()
    {
	NumOfCards = 52;
	for (int i = 0 ; i < 52 ; i++)
	{
	    deck [i] = new Card ();
	    deck [i].number = (i % 4) + 1;
	    deck [i].suit = (i % 13);
	}
    }
}

