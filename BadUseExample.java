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
