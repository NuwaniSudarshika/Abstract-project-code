abstract class Human{
    Human(){
        System.out.println("constructor is running!");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing!");
    }
}
class Man extends Human {
    void eat(){
        System.out.println("Anything eat!");
    }
    void walk(){
        System.out.println("Any kind of walk!");
    }
    void breathing(){
        super.breathing();
        System.out.println("Lab Dab!");
    }
}
class Gawesh extends Man{
    void breathing(){
        super.breathing();
        System.out.println("Gawesh Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating Food!");
    }

    @Override
    void walk() {
        System.out.println("Running!");
    }
}
class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1= new Gawesh();
        Man m = new Gawesh();
        h.eat();
        h.walk();
        h.breathing();
        h1.eat();
        h1.walk();
        h1.breathing();
        m.eat();
        m.walk();
        m.breathing();
    }
}
