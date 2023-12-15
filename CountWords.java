import java.util.*;
import java.io.*;

public class CountWords {

    public static void main(String[] args) throws FileNotFoundException {

        final File folder = new File("Albums");

        ArrayList<File> albums = new ArrayList<File>();

        for(File fileEntry : folder.listFiles() ) {

            albums.add(fileEntry);

        }

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("What magic word are you testing?");
        System.out.println();

        String word = scanner.next();

        int total = 0;
        String mostAlbum;
        int mostCount = 0;

        for(File album : albums) {
            String albumName = album.getName();
            int currCount = 0;
            Scanner fileScanner = new Scanner(album);
            while(fileScanner.hasNextLine()) {

                if (fileScanner.nextLine().equals(word)) { currCount++; }

            }

            if (currCount > mostCount) {

                mostCount = currCount;
                mostAlbum = albumName;

            }

            total += currCount;

        }


        System.out.println("Amount mentioned: " + total);


































        System.out.print("RIP pop smoke free young thug free gunna😇😇😇😇😇😇😇 Carti i want you forever and ever 😁❤️❤️❤️❤️❤️");





    }

}
