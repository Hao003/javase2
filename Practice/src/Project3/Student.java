package Project3;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int num=14;

    public Student() {
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }
    public int sum (int numm){
        return this.num+numm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
