 abstract public class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle!");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle!");
    }
}
class Test{
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.draw();
        s2.draw();
    }
}
