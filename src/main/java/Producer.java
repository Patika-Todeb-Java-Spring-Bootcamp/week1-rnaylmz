import java.util.Scanner;

public class Producer {
    String team1;
    String team2;
    int score1;
    int score2;

    public Producer() {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Team1: ");
        team1 = input.nextLine();
        System.out.println("Enter Team2: ");
        team2 = input.nextLine();

        System.out.println("Score of Team1: ");

        if (input.hasNextInt()) {
            score1 = input.nextInt();
        }else{
            System.out.println("Enter a number");
        }

        System.out.println("Score of Team2: ");

        if (input.hasNextInt()) {
            score2 = input.nextInt();
        }else {
            System.out.println("Enter a number");
        }

        System.out.println(team1 + "  " + score1 + "-" + score2 + "  " + team2);


    }
}
