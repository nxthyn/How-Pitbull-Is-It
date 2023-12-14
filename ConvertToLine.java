import java.util.*;
import java.io.*;

public class ConvertToLine {

    public static void main(String[] args) {

        try {
            File file = new File("MIAMI.txt");
            File out = new File("formatMIAMI.txt");
            Scanner input = new Scanner(file);
            FileWriter write = new FileWriter(out);

            while (input.hasNextLine()) {

                String[] temp = input.nextLine().split(" ");
                for (String str : temp) {

                    write.write(str + "\n");

                }

            }

            input.close();
            write.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
