public class Day2 {
    public static void main(String[] args) {
    Flyable a=new Fish();
    a.fly();
    }
}
abstract class Animal{

}
class Fish extends Animal implements Flyable {
    public void fly (){
        System.out.println("我会飞");
    }
}
interface Flyable {
     void fly();
}