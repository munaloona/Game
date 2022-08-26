import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;

public class releases implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("There are 0 current old versions available.");

    releases() {

        label.setBounds(35, 30, 700, 100);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(560, 420);
        frame.setResizable(false);
        frame.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Help");

        JMenuItem helpItem = new JMenuItem("For help or suggestions, please message Moona#2200 on discord.");

        helpMenu.add(helpItem);

        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}