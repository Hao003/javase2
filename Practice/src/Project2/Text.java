package Project2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Text {
    public static void main(String[] args) {
        File src = new File("C:/Java1");
        //C:\Java1\ss"
        //C:\Java1\fsa\fasdf.txt"
        //"C:\Java1\fsa\fasdf.txt"
        File dir = new File("D:\\\\");
        copy(src, dir);
    }

    public static void copy(File src, File dir) {
        if (src.isFile()) {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream=null;
            try {
                String s4=src.getAbsolutePath();
                fileInputStream = new FileInputStream(src.getAbsoluteFile());
                fileOutputStream = new FileOutputStream("D:\\" + s4.substring(3));
                System.out.println("D:\\" + s4.substring(3));
                byte[] bytes = new byte[1024 * 1024];
                int read = 0;
                while ((read = fileInputStream.read()) != -1) {
                    fileInputStream.read(bytes, 0, read);
                }
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
            }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if ( fileInputStream!= null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }}
        return;
    }
    File []files=src.listFiles();
    for(File file1 : files){
        String s1=file1.getAbsolutePath();
        String s2="D:\\"+s1.substring(3);
        if(file1.isDirectory()){
            File a=new File("s2");
                    if(!a.exists()){
                        a.mkdirs();
                    }
        }
        File b=new File("s2");
        copy(file1,b);
    }

    }
}