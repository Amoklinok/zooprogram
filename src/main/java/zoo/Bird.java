package zoo;
import java.util.Scanner;

public class Bird extends Creature{
    public Bird(String name, int age, String type) {
        super(name, age, type);
    }

    // Extended methods
    @Override
    public void Breath() {
        System.out.println("I'm breathing with the air");
    }
    @Override
    public void Move() {
    System.out.println("I'm flying in the sky");
    }
    @Override
    public void printInfo() {
    }

    //Personal method
    public static void birdScream(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a bird voice: ");
    String st = String.valueOf(scanner.nextLine());
    System.out.println(st);}



    }



