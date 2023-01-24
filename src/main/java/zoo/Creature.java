package zoo;

import java.util.Scanner;

//Creation of the class Creature
public abstract class Creature {
private String name;
private int age;
private String type;

//Constructor
public Creature(String name, int age, String type) {
    this.name = name;
    this.age = age;
    this.type = type;
}

//Get and Set methods
public String getName() {
    return name;}
public void setName(String NewName) {
    name = NewName;
    }
public int getAge() {
    return age;
}
public void setAge(int NewAge) {
    age = NewAge;
}
public String getType(){
    return type;
}
public void setType(String NewType){
    type = NewType;
}

//Common methods
public void Breath(String wayOfBreathing) {
    System.out.println(wayOfBreathing);
}
public void Move(String wayOfMoving){

    System.out.println(wayOfMoving);
}
public void printInfo() {
    System.out.printf("Here is %s, it's a %s and it's age is %d", name, type, age, "\n");

   }
}
