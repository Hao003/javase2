public class Customer {
    private FoodMenu cooker;

    public Customer(FoodMenu cooker) {
        this.cooker = cooker;
    }

    public Customer() {
    }
    public void order (){
        cooker.xiHongShi();
    }

    public FoodMenu getCooker() {
        return cooker;
    }

    public void setCooker(FoodMenu cooker) {
        this.cooker = cooker;
    }
}
