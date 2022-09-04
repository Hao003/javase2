package Project4;

public class TanKe extends Weapon implements Moveable,Shoot {

    @Override
    public void move() {
        System.out.println("坦克行动!");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮!");
    }
}
