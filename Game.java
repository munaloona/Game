import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome to the Moona area!");
    JLabel label0 = new JLabel("This is just an area to play around.");
    JButton myButton1 = new JButton("Maid Dragon Series");

    Game() {

        label.setBounds(35, 30, 700, 100);
        label.setFont(new Font(null, Font.PLAIN, 25));

        label0.setBounds(10, 60, 900, 100);
        label0.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);
        frame.add(label0);
        frame.add(myButton1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setTitle("Game");
        frame.setLayout(null);

        myButton1.setBounds(100, 5, 180, 60);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);

        frame.add(myButton1);

        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Help");

        JMenuItem helpItem = new JMenuItem("For Help or suggestions, please message Moona#2200 on discord.");

        helpMenu.add(helpItem);

        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    public static void audio() {
        try {
            File file = new File("audio.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.err.println(
                    "Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }

    private static String arg;

    public static void main(String[] args) {

        arg = "background.gif";
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        ImageIcon icon = new ImageIcon(arg);
        f.setSize(480, 360);
        f.setVisible(true);
        l.setIcon(icon);
        p.add(l);
        f.getContentPane().add(p);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        audio();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton1) {
            frame.dispose();
            new video();
        }
    }
}
