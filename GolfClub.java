public class GolfClub 
{
    // declare 
    String name;
    int distance;

    // constructor
    public GolfClub(String name, int distance) 
    {
        this.name = name;
        this.distance = distance;
    }

    // method to display golfclub info
    public void displayGolfClubInfo() 
    {
        System.out.println("Club: " + name + " Distance: " + distance);
    }

}