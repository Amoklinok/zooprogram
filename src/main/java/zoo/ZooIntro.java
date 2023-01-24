package zoo;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZooIntro {
    public static void main(String[] args) {

// Create new objects
    Beast snowLeopard = new Beast("Barsik", 1, "beast");
    Bird Dodo = new Bird("Miki", 2, "bird");
    Fish Roach = new Fish("Zigi",0, "fish");

        Scanner scanner = new Scanner(System.in);
        int num;
        do {System.out.println("Enter your number from 0 to 3: ");
        num = scanner.nextInt();
        switch (num){
            case 1:
                snowLeopard.giveVoice();
                snowLeopard.printInfo();
                snowLeopard.Breath();
                snowLeopard.Move();
            break;
            case 2:
                Dodo.birdScream();
                Dodo.printInfo();
                Dodo.Breath();
                Dodo.Move();
            break;
            case 3:
                try {
                    Roach.makeBubbles();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                Roach.printInfo();
                Roach.Breath();
                Roach.Move();
                break;
            default:
                System.out.println("Exit");
                break;

        }} while (num > 0 && num < 4);

}}