package 王者荣耀;

import javax.swing.*;
import java.awt.*;

public class WangZhe extends JFrame {
        private int windowWide=1400;
        private int windowHeight=700;
        private Background background=new Background();
        public void launch (){
            setSize(windowWide,windowHeight);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(3);
            setResizable(false);
            setTitle("王者荣耀 罗凯");
            setVisible(true);
            while (true){
                repaint();
                try{
                    Thread.sleep(25);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        public void paint (Graphics g){
            background.paintSelf(g);
        }

        public static void main(String[] args) {
            WangZhe wangZhe=new WangZhe();
            wangZhe.launch();
        }
    }


