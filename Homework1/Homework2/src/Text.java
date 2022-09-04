public class Text {
    public static void main(String[] args) {
        Customer a=new Customer();
        FoodMenu b=new ChineseCooker();
        FoodMenu c=new AmericanCooker();
        a.setCooker(b);
        a.order();
        a.setCooker(c);
        a.order();
    }
}

