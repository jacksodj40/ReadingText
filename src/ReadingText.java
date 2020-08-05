import java.io.BufferedReader; //scanner
import java.io.File;
import java.io.FileNotFoundException;
import  java.io.FileReader;

public class ReadingText {
    public static void main(String[] args) throws Exception {

        //Scanner read = new Scanner(System.in);
        try {
            FileReader file = new FileReader("C:/Users/getri/Desktop/JavaTraining/ReadingText/ReadingText.txt");
            BufferedReader reader = new BufferedReader(file);

            String text = "";
            String line = reader.readLine();
            while (line != null){
                text += line;
                line = reader.readLine();
            }

            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
