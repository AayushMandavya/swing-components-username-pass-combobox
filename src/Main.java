import javax.swing.*;
import java.awt.*;


public class Main  {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("new frame");
        frame.setSize(500, 500);
        JLabel name = new JLabel("Login Page");
        JTextField username = new JTextField("enter username");


        JPasswordField password = new JPasswordField("enter password");
        String[] fruits = {"apple", "banana", "mango"};
        JComboBox comboBox = new JComboBox<>(fruits);
        JButton button = new JButton("click me plz");
        name.setBounds(20, 20, 100, 40);
        button.setBounds(20, 170, 200, 40);
        username.setBounds(20, 60, 300, 50);
        password.setBounds(20, 100, 300, 50);
        comboBox.setBounds(20,230,100,40);
        frame.add(name);
        frame.add(button);
        frame.add(username);
        frame.add(password);
        frame.add(comboBox);

        frame.setLayout(null);
        frame.setVisible(true);


    }
}