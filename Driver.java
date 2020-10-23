import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args) 
    {
    
        // create instances (GolfClub) 
        GolfClub club1 = new GolfClub("Putter", 20);
        GolfClub club2 = new GolfClub("SW", 70);
        GolfClub club3 = new GolfClub("GW", 90);
        GolfClub club4 = new GolfClub("PW", 100);
        GolfClub club5 = new GolfClub("9 Iron", 115);
        GolfClub club6 = new GolfClub("8 Iron", 130);
        GolfClub club7 = new GolfClub("7 Iron", 140);
        GolfClub club8 = new GolfClub("6 Iron", 150);
        GolfClub club9 = new GolfClub("5 Iron", 160);
        GolfClub club10 = new GolfClub("4 Iron", 170);
        GolfClub club11 = new GolfClub("3 Iron", 180);
        GolfClub club12 = new GolfClub("3 Wood", 200);
        GolfClub club13 = new GolfClub("Driver", 230);

        // add each club to the bag
        GolfBag.addClub(club1);
        GolfBag.addClub(club2);
        GolfBag.addClub(club3);
        GolfBag.addClub(club4);
        GolfBag.addClub(club5);
        GolfBag.addClub(club6);
        GolfBag.addClub(club7);
        GolfBag.addClub(club8);
        GolfBag.addClub(club9);
        GolfBag.addClub(club10);
        GolfBag.addClub(club11);
        GolfBag.addClub(club12);
        GolfBag.addClub(club13);
  
        // print the info for each club by calling the method
        /*
        club1.displayGolfClubInfo();
        club2.displayGolfClubInfo();
        club3.displayGolfClubInfo();
        club4.displayGolfClubInfo();
        club5.displayGolfClubInfo();
        club6.displayGolfClubInfo();
        club7.displayGolfClubInfo();
        club8.displayGolfClubInfo();
        club9.displayGolfClubInfo();
        club10.displayGolfClubInfo();
        club11.displayGolfClubInfo();
        club12.displayGolfClubInfo();
        club13.displayGolfClubInfo();
        */

        // print the contents of the golf bag
        //GolfBag.contents();
        
        // use sacnner to ask user for input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the distance to evaluate:");
        // call the method from GolfBag 
        GolfBag.clubSelection(userInput);
    }
}
