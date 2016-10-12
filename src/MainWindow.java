import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by B on 12.10.2016.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700,700);
        JButton update = new JButton("Update");

        DrawPanel drawPanel = new DrawPanel();
        add(new JScrollPane(drawPanel),BorderLayout.CENTER);

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.calculateNewDots();
                repaint();
            }
        });
        JButton file1 = new JButton("Scan 1 file");
        JButton file2 = new JButton("Scan 2 file");
        JButton file3 = new JButton("Scan 3 file");
        JButton file4 = new JButton("Scan 4 file");

        file1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setDots(ScanFile.scanFile("Release-RNG0/out.txt"));
                repaint();
            }
        });
        file2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setDots(ScanFile.scanFile("Release-RNG1/out.txt"));
                repaint();
            }
        });
        file3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setDots(ScanFile.scanFile("Release-RNG2/out.txt"));
                repaint();
            }
        });
        file4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setDots(ScanFile.scanFile("Release-RNG-rand_seed/out.txt"));
                repaint();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        //buttonPanel.add(update);
        buttonPanel.add(file1);
        buttonPanel.add(file2);
        buttonPanel.add(file3);
        buttonPanel.add(file4);
        add(buttonPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args){

        MainWindow wnd = new MainWindow();
        wnd.setVisible(true);
    }


}
