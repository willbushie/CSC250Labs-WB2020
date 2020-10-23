import java.util.ArrayList;
import java.util.Scanner;

public class GolfBag
{
    // declare
    public static ArrayList<GolfClub> golfBag = new ArrayList<GolfClub>();

    // method to add a club to the bag
    public static void addClub(GolfClub club) 
    {
        golfBag.add(club);
    }

    // method to print each item in the bag
    public static void contents() 
    {
        for (GolfClub club : golfBag)
        {
            club.displayGolfClubInfo();
        }
    }

    // method to display the correctly selected club based on distance input
    public static void clubSelection(Scanner userInput)
    {
        // change scanner to int
        int testDist = userInput.nextInt();
        // loop through the distances of each club
        int count = 0;
        GolfClub finalClub;
        while (count <= golfBag.size())
        {
            // store object at index in a variable
            GolfClub club = golfBag.get(count++);
            if (club.distance >= testDist)
            {
                finalClub = golfBag.get((count-2));
                System.out.println("\nIdeal Club:");
                finalClub.displayGolfClubInfo();
                System.out.println("\n");
                return;
            }
        }
        // print statment to say that no club was found to match
        System.out.println("\nNo matching club was found.");
    }
}
