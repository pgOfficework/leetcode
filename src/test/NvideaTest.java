package test;

import javax.swing.JFrame;
import java.io.IOException;

public class NvideaTest {

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("TEST NVIDIA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}