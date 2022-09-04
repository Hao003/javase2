package Project5;

public class Text {
    public static void main(String[] args) {
        Thread t=new Thread(new My());
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
    }

class My implements Runnable{
    public void run (){
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

