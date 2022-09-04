public class Day1 {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        a.setSpeed(100);
        System.out.println(a.getSpeed());
        a.speedUp();
        System.out.println(a.getSpeed());
        a.speedDown();
        System.out.println(a.getSpeed());
    }
}

    class Vehicle {
        private double speed;
        private double size;

        public Vehicle() {
        }

        public Vehicle(float speed, float size) {
            this.speed = speed;
            this.size = size;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void speedUp() {
            setSpeed(getSpeed() + 100);
        }

        public void speedDown() {
            setSpeed(getSpeed() - 120);
        }
    }