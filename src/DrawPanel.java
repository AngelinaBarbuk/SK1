import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by B on 12.10.2016.
 */
public class DrawPanel extends JPanel {
    private int N = 20000;
    private int dots[];
    private int x;

    DrawPanel(){
        super();
        calculateNewDots();
    }

    public void calculateNewDots(){
        x=700;
        dots = new int[N];
        for(int i=0; i<N; i++){
            dots[i]= (int) (Math.random()*700);
        }
        setSize(x,x);
    }

    public void setDots(int[] dots){
        this.dots=dots;
        x=0;
        for(int i=0; i<dots.length;i++)
            x=Math.max(x,dots[i]);
        setSize(x,x);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2.0f));
        for (int i=1; i<dots.length;i++)
            g2.drawLine(dots[i-1],dots[i],dots[i-1],dots[i]);

    }
}
