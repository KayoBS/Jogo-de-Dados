package entities;

public class Player
{
    private int id;
    private String name;
    private int betAmount;
    private int victories;


    public Player()
    {
        setId(-1);
        this.victories = 0;
    }
    public Player( String name, int betAmount)
    {
        this.victories = 0;
        setId(-1);
        setName(name);
        setBetAmount(betAmount);
    }

    public void setInitialValues()
    {
        System.out.print("INSIRA O NOME DO NOVO JOGADOR: ");
        setName(scan.nextLine());
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBetAmount()
    {
        return betAmount;
    }

    public void setBetAmount(int betAmount)
    {
        this.betAmount = betAmount;
    }

    public void addVictory()
    {
        this.victories++;
    }

    public int getVictories()
    {
        return this.victories;
    }
}
