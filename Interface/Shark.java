//You can create many methods or constructors in interface just like a normal class.
//You don't need to create an object for interface.
public class Shark implements Predator {

    @Override
    public void hunt() {
        System.out.println("The Shark is hunting a prey");
        
    }
    
}
