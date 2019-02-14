public class Player
{
    private String names; //name of player
    private int points; //points player has

    /**
     *  Constructor
     */

    public Player(String name, int point)
    {
        names = name;
        points = point;
    }

    public void setName(String name)
    {
        //change name
        names = name;
    }

    public void setPoints(int point)
    {
        //change points
        points = point;
    }

    public String getName()
    {
        //name of player
        return names;
    }

    public int getPoints()
    {
        //points player has
        return points;
    }


}

