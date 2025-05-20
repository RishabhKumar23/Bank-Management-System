package smbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel title_label, card_label, pin_label;
    JTextField card_text_field;
    JPasswordField pin_text_field;
    JButton signin_button, signup_button, clear_button;

    //Constructor
    Login() {
        // Creating UI
        super("SM Bank"); // Always on top

        // Adding Bank Image
        ImageIcon bank_img = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // To load image
        Image bank_img_Scale = bank_img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // To scale the image
        ImageIcon bank_img_Icon = new ImageIcon(bank_img_Scale); // To display on the frame
        JLabel bank_img_display = new JLabel(bank_img_Icon);
        bank_img_display.setBounds(350, 10, 100, 100);
        add(bank_img_display); // To add on the frame

        // Adding Card Image
        ImageIcon card_img = new ImageIcon(ClassLoader.getSystemResource("icons/card.png")); // To load image
        Image card_img_Scale = card_img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // To scale the image
        ImageIcon card_img_Icon = new ImageIcon(card_img_Scale); // To display on the frame
        JLabel card_img_display = new JLabel(card_img_Icon);
        card_img_display.setBounds(650, 350, 100, 100);
        add(card_img_display); // To add on the frame

        // Title Label
        title_label = new JLabel("WELCOME TO ATM");
        title_label.setForeground(Color.WHITE);
        title_label.setFont(new Font("AvantGarde", Font.BOLD, 38));
        title_label.setBounds(230, 125, 450, 40);
        add(title_label);

        // Card Label
        card_label = new JLabel("Card No: ");
        card_label.setForeground(Color.WHITE);
        card_label.setFont(new Font("Ralway", Font.BOLD, 28));
        card_label.setBounds(150, 190, 375, 30);
        add(card_label);

        // Pin Label
        pin_label = new JLabel("Pin: ");
        pin_label.setForeground(Color.WHITE);
        pin_label.setFont(new Font("Ralway", Font.BOLD, 28));
        pin_label.setBounds(220, 245, 375, 30);
        add(pin_label);

        // Card Text Field
        card_text_field = new JTextField(15);
        card_text_field.setFont(new Font("Arial", Font.BOLD, 14));
        card_text_field.setBounds(300, 194, 230, 30);
        add(card_text_field);

        // Pin Text Field
        pin_text_field = new JPasswordField(15);
        pin_text_field.setFont(new Font("Arial", Font.BOLD, 14));
        pin_text_field.setBounds(300, 245, 230, 30);
        add(pin_text_field);

        // Adding SignIn Button
        signin_button = new JButton("Sign In");
        signin_button.setFont(new Font("Arial", Font.BOLD, 14));
        signin_button.setForeground(Color.BLACK);
        signin_button.setBounds(300, 290, 100, 30);
        signin_button.addActionListener(this);
        add(signin_button);

        // Adding Clear Button
        clear_button = new JButton("Clear");
        clear_button.setFont(new Font("Arial", Font.BOLD, 14));
        clear_button.setForeground(Color.BLACK);
        clear_button.setBounds(428, 290, 100, 30);
        clear_button.addActionListener(this);
        add(clear_button);

        // Adding Clear Button
        signup_button = new JButton("Sign Up");
        signup_button.setFont(new Font("Arial", Font.BOLD, 14));
        signup_button.setForeground(Color.BLACK);
        signup_button.setBounds(300, 320, 230, 30);
        signup_button.addActionListener(this);
        add(signup_button);

        // Adding Background Image
        ImageIcon background_img = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png")); // To load image
        Image background_img_Scale = background_img.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT); // To scale the image
        ImageIcon background_img_Icon = new ImageIcon(background_img_Scale); // To display on the frame
        JLabel background_img_display = new JLabel(background_img_Icon);
        background_img_display.setBounds(0, 0, 850, 480);
        add(background_img_display); // To add on the frame


        setLayout(null);
        setSize(850, 480); // Setting frame size
        setLocation(450, 200); // To make frame opening location

        setVisible(true); // By Default frame is hidden => Always on the bottom to avoid visibility issues

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == signin_button) {

            } else if (e.getSource() == signup_button) {

            } else if (e.getSource() == clear_button) {
                card_text_field.setText("");
                pin_text_field.setText("");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
