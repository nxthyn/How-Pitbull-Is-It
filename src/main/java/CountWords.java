import java.util.*;
import java.io.*;

public class CountWords {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("What magic word are you testing?");
        System.out.println();

        String word = scanner.nextLine();

        int total = 0;

        File file = new File("C:\\Users\\mariev718_lpsk12\\Desktop\\Projects\\test\\src\\main\\java\\formatMIAMI.txt");

        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()) {

            if (fileScanner.nextLine().equals(word)) { total++; }

        }

        System.out.println("Amount mentioned: " + total);


































        System.out.print("RIP pop smoke free young thug free gunna😇😇😇😇😇😇😇 Carti i want you forever and ever 😁❤️❤️❤️❤️❤️");





    }

}