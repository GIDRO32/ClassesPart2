class GameType
{
    private String genre;
    private int number;
    public GameType(String genre, int number)
    {
        this.genre = genre;
        this.number = number;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumber() {
        return number;
    }

    public void print()
   {
       System.out.println("This output has no sense: " + genre + number);
   }
}
public class Main
{
    public static void main(String[] args)
    {
        GameType shooter = new GameType("shooter", 35);//Setting properties via constructor
        shooter.setGenre("Random");//setting properties via method
        shooter.setNumber(37);
        shooter.print();
    }
}