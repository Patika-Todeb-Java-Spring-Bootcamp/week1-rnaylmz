import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Consumer {

    FileWriter fileWriter = null;
    File file = null;

    public Consumer() {

        try {
            file = new File("score.txt");

            boolean newFile;
            if (file.createNewFile()) newFile = true;
            else newFile = false;

            Producer producer = new Producer();
            fileWriter = new FileWriter(file);
            fileWriter.write(producer.team1 + " " + producer.score1 + "-" + producer.score2 + " " + producer.team2);
            fileWriter.flush();
            fileWriter.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

