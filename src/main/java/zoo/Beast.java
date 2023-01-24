package zoo;
import java.util.Scanner;

public class Beast extends Creature{
     public Beast(String name, int age, String type) {
        super(name, age, type);
    }

    public static void giveVoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a beast voice: ");
        String str = String.valueOf(scanner.nextLine());
        System.out.println(str);}


    public void Breath() {
        super.Breath("Hey, I have lungs and they help me to breath. So I prefer fresh air!");
    }
    public void Move(){
        super.Move(" I like to move it, move it. I have 4 paws!");

    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
