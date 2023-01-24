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

    public static void makeBubbles()throws FileNotFoundException {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\zooprogram\\src\\main\\resources\\fish_bubbles!.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println("Fish makes bubbles\n");

            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (IOException var5) {
            throw new RuntimeException(var5);
        }
    }

    //Extended actions
    public void Breath() {
        super.Breath("Hey, I have gills and get the air from water :). Bloop ");
    }
    public void Move(){
        super.Move("I love swimming!");

    }
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
