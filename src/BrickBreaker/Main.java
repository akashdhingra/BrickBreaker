package BrickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10, 10, 700, 600);        // size of frame
        obj.setTitle("Breakout Game");                             // Title of frame
        obj.setResizable(false);                                   // Resizable frame
        obj.setVisible(true);                                      // visibility of frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // close on pressing exit button
        obj.add(gameplay);
    }
}
