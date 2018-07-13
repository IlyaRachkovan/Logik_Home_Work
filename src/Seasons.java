import java.util.Scanner;

public class Seasons {
    public void season(int season) {
        System.out.print("Enter month number: ");
        Scanner scan = new Scanner(System.in);
        season = scan.nextInt();
        if (season == 1) {
            System.out.println("Season is winter");
        } else if (season == 2) {
            System.out.println("Season is spring");
        } else if (season == 3) {
            System.out.println("Season is summer");
        } else if (season == 4) {
            System.out.println("Season is autumn" + season);
        }

    }
}
