package Project4;

public class Text {
    public static void main(String[] args) {
        Army a=new Army(2);
        try{
            a.addWeapon(new TanKe());
            a.addWeapon(new YIHu());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        a.shootXingDong();
    }
}
