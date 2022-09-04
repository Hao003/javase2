package Project3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class Text2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
