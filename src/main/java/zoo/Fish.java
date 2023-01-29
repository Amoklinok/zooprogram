package zoo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Fish extends Creature{
    public Fish(String name, int age, String type) {
        super(name, age, type);
    }

    // Extended methods
    @Override
    public void Breath() {
        System.out.println("Hey, I have gills and get the air from water :). Bloop ");
;    }

    @Override
    public void Move() {
        System.out.println("I love swimming!");
    }
    @Override
    public void printInfo() {
    }

// Personal method
    public static void makeBubbles()throws FileNotFoundException {
        try {
            File file = new File(".\\src\\main\\resources\\fish_bubbles!.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println("Fish makes bubbles\n");

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (IOException var5) {
            throw new RuntimeException(var5);
        }
    }

}
