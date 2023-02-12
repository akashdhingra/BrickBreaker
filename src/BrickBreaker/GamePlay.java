package BrickBreaker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //This is typed just for testing

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Only checking again");
        System.out.println("Previous code is not merged");

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
