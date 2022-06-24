import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProducerConsumerThread implements Runnable {

    private Thread thread;
    private final String threadName;

    public ProducerConsumerThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        String team1;
        String team2;
        int score1 = 0;
        int score2 = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Team1: ");
        team1 = input.nextLine();
        System.out.println("Enter Team2: ");
        team2 = input.nextLine();

        System.out.println("Score of Team1: ");

        if (input.hasNextInt()) {
            score1 = input.nextInt();
        } else {
            System.out.println("Enter a number");
        }

        System.out.println("Score of Team2: ");

        if (input.hasNextInt()) {
            score2 = input.nextInt();
        } else {
            System.out.println("Enter a number");
        }

        System.out.println(team1 + "  " + score1 + "-" + score2 + "  " + team2);

        FileWriter fileWriter = null;
        File file = null;


        try {
            file = new File("score.txt");

            boolean newFile;
            if (file.createNewFile()) newFile = true;
            else newFile = false;

            fileWriter = new FileWriter(file);
            fileWriter.write(team1 + " " + score1 + "-" + score2 + " " + team2);
            fileWriter.flush();
            fileWriter.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        if (thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
