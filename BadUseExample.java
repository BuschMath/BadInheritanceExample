/*In this example, we have a superclass Animal that has two 
    methods eat() and sleep(). The subclasses Dog, Cat, and 
    Bird inherit from the Animal class, but they do not override 
    or add any new functionality to the eat() and sleep() 
    methods. However, the Dog, Cat, and Bird classes have 
    additional methods bark(), meow(), and fly(), respectively.

    In the BadUseExample class, we create instances of each 
    subclass and call the eat() method on them. However, this 
    demonstrates a bad use of inheritance because the Dog, Cat, 
    and Bird classes do not actually need to inherit the eat() 
    and sleep() methods from the Animal class since they do not 
    add any new functionality to these methods. This can lead to 
    unnecessary code bloat and confusion for future developers 
    who may think that these methods are important to the subclasses. */

public class BadUseExample{
    public static void main(String[] args) {
        Dog myDog = new Dog("Rufus");
        Cat myCat = new Cat("Fluffy");
        Bird myBird = new Bird("Tweety");
    
        myDog.eat();
        myCat.eat();
        myBird.eat();
    }
}
