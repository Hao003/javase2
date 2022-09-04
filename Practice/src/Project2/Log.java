package Project2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.module.FindException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static void out (String msg){
        try{
            PrintStream printStream=new PrintStream(new FileOutputStream("Practice/src/Project2/Hao.txt",true));
            System.setOut(printStream);
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM--dd HH:mm:ss SSS");
            String str=simpleDateFormat.format(date);
            System.out.println(str+":"+msg);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
