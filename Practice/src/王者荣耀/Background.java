package 王者荣耀;

import java.awt.*;

public class Background {
    String path=Thread.currentThread().getContextClassLoader().
            getResource("img/map.jpeg").getPath();
    Image bg=Toolkit.getDefaultToolkit().getImage(path);
    public void paintSelf (Graphics g){
        g.drawImage(bg,0,0,null);
    }
}
