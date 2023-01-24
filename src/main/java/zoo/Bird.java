package zoo;
import java.util.Scanner;

public class Bird extends Creature{
    public Bird(String name, int age, String type) {
        super(name, age, type);
    }

public static void birdScream(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a bird voice: ");
    String st = String.valueOf(scanner.nextLine());
    System.out.println(st);}


    public void Breath() {
        super.Breath("Hey, I have lungs and they help me to breath. " +
                "So I prefer fresh air in the forest!");
    }
    public void Move(){
        super.Move("I'm flying in the skies");

    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
