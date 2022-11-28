//You can create many methods or constructors in interface just like a normal class.
//You don't need to create an object for interface.
public class Crocodile implements Predator {

    @Override
    public void hunt() {
        System.out.println("The crocodile is hunting a prey");
        
    }
    
}
