
import java.util.Scanner;


public class DogPark {

    public static void main(String[] args) {
        Dog roger = new Dog(); //roger is an instance of the dog class
        if(roger instanceof Dog)
            System.out.println("Roger is a dog");
        
        
        //assign properties to roger
        roger.age = 5;
        roger.breed = "Collie";
        roger.color = "tan";
        roger.weight = 28;
        roger.name = "Roger";
        
        //get roger to do things
        roger.sayHello();
        roger.bark();
        roger.eat();
        roger.eat();
        roger.bark();
        
        
        //lets make bob
        Dog bob = new Dog("Terrier", "Bob", "Black", 10, 2);
        bob.sayHello();
        bob.bark();
        bob.eat();
        
        
        
        
    }
    
}
