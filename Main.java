import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();




        panel.setLayout(null);

        frame.setSize(600, 400);
        frame.setTitle("Facebook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        //email label
        JLabel email = new JLabel("Enter email: ");
        email.setBounds(10, 30, 80, 20);
        panel.add(email);

        //password label
        JLabel password = new JLabel("Enter password: ");
        password.setBounds(10, 90, 80, 20);
        panel.add(password);

        //email input
        JTextField emailField = new JTextField();
        emailField.setBounds(10, 60, 140, 20);
        panel.add(emailField);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(10, 120, 140, 20);
        panel.add(passwordField);


        //button
        JButton button = new JButton("Login");
        button.setBounds(260, 210, 100, 20);
        panel.add(button);


        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

               // sets display value
                String input = e.getActionCommand();
                if (input.equals("Login")) {


                    //display
                    JLabel display = new JLabel();
                    display.setBounds(160, 60, 80, 20);
                    panel.add(display);
                    display.setText(emailField.getText());//uzrāda, kas iekšā email

                    JLabel display1 = new JLabel();
                    display1.setBounds(160, 120, 80, 20);
                    panel.add(display1);
                    display1.setText(passwordField.getText());//uzrāda, kas iekšā parolē


                }
                }
        });






        frame.setVisible(true);
    }
}