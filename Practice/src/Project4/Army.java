package Project4;

public class Army {
    private int i;
    private int index=0;
    private Weapon [] w;
    public Army() {

    }

    public Army(int i) {
        this.i = i;
        for(int j=0;j<i;j++){
            w=new Weapon[i];
        }
    }
    public void addWeapon (Weapon wa) throws MaxExpection{
        if(this.index>=w.length){
            throw new MaxExpection ("不能再输入武器了！！");
        }
        w[index++]=wa;
    }
    public void moveXingDong (){
        for(int j=0;j<w.length;j++) {
            if (w[j] instanceof Moveable) {
                Moveable a = (Moveable) w[j];
                a.move();
            }

        }
    }
    public void shootXingDong (){
        for (int j=0;j<w.length;j++){
            if(w[j] instanceof Shoot){
                Shoot b=(Shoot) w[j];
                b.shoot();
            }
        }
    }
}
