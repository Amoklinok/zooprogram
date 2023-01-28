package zoo;
import java.util.Scanner;

public class Beast extends Creature {
    public Beast(String name, int age, String type) {
        super(name, age, type);
    }

    //Extended methods
    @Override
    public void Breath() {
        System.out.println("Hey, I have lungs and prefer fresh air!");
    }

    @Override
    public void Move() {
        System.out.println("I like ti move it, move it!");
    }

    @Override
    public void printInfo() {

    }

    //Personal method
    public static void giveVoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a beast voice: ");
        String str = String.valueOf(scanner.nextLine());
        System.out.println(str);
    }
}