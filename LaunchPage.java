import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton1 = new JButton("Launch");
    JButton myButton2 = new JButton("Old Releases");

    LaunchPage() {

        myButton1.setBounds(100, 300, 200, 40);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);

        myButton2.setBounds(100, 5, 180, 60);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);

        frame.add(myButton1);
        frame.add(myButton2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
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
        if (e.getSource() == myButton1) {
            frame.dispose();
            new Game();
        }

        if (e.getSource() == myButton2) {
            frame.dispose();
            new releases();
        }
    }
}