package Project3;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) throws Exception{
        Class studentClass=Class.forName("Project3.Student");
      /*  Method method=studentClass.getDeclaredMethod("sum",int.class);
        Object obj=studentClass.newInstance();
        System.out.println(method.invoke(obj,12));*/
        Field field=studentClass.getDeclaredField("name");
        field.setAccessible(true);
        Object obj=studentClass.newInstance();
        field.set(obj,"张三");
        System.out.println(field.get(obj));
        System.out.println(studentClass.getDeclaredField("name").getName());
        System.out.println(studentClass.getSimpleName());
    }


}
