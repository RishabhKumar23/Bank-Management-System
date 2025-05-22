package smbank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton radioButton1, radioButton2, marred_button, single_button, other;
    JButton next;

    JTextField name, father_name, email, address, city, state, pin;
    JDateChooser dateChooser;

    // Generating random for Application Number
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        // Adding Bank Image
        ImageIcon bank_img = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // To load image
        Image bank_img_Scale = bank_img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // To scale the image
        ImageIcon bank_img_Icon = new ImageIcon(bank_img_Scale); // To display on the frame
        JLabel bank_img_display = new JLabel(bank_img_Icon);
        bank_img_display.setBounds(25, 10, 100, 100);
        add(bank_img_display); // To add on the frame

        // For Application number
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        // For page number
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        // For title
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        // For first name label
        JLabel name_label = new JLabel("Name :");
        name_label.setFont(new Font("Raleway", Font.BOLD, 20));
        name_label.setBounds(100, 190, 100, 30);
        add(name_label);

        // For last name label
        JLabel father_name_frame = new JLabel("Father's Name :");
        father_name_frame.setFont(new Font("Raleway", Font.BOLD, 20));
        father_name_frame.setBounds(100, 240, 200, 30);
        add(father_name_frame);

        // For Date of birth label
        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        // Gender Label
        JLabel gender_label = new JLabel("Gender");
        gender_label.setFont(new Font("Raleway", Font.BOLD, 20));
        gender_label.setBounds(100, 290, 200, 30);
        add(gender_label);

        // For Email label
        JLabel email_label = new JLabel("Email address :");
        email_label.setFont(new Font("Raleway", Font.BOLD, 20));
        email_label.setBounds(100, 390, 200, 30);
        add(email_label);

        // For Marital Status label
        JLabel marital_label = new JLabel("Marital Status :");
        marital_label.setFont(new Font("Raleway", Font.BOLD, 20));
        marital_label.setBounds(100, 440, 200, 30);
        add(marital_label);

        // For address label
        JLabel add_label = new JLabel("Address :");
        add_label.setFont(new Font("Raleway", Font.BOLD, 20));
        add_label.setBounds(100, 490, 200, 30);
        add(add_label);

        // For City label
        JLabel city_label = new JLabel("City :");
        city_label.setFont(new Font("Raleway", Font.BOLD, 20));
        city_label.setBounds(100, 540, 200, 30);
        add(city_label);

        // For Pin label
        JLabel pin_label = new JLabel("Pin Code :");
        pin_label.setFont(new Font("Raleway", Font.BOLD, 20));
        pin_label.setBounds(100, 590, 200, 30);
        add(pin_label);

        // For State label
        JLabel state_label = new JLabel("State :");
        state_label.setFont(new Font("Raleway", Font.BOLD, 20));
        state_label.setBounds(100, 640, 200, 30);
        add(state_label);

        // --------------------  End Label Field -------------------- //

        // --------------------  Text Field -------------------- //

        // For First name text field
        name = new JTextField();
        name.setFont(new Font("Raleway", Font.BOLD, 14));
        name.setBounds(300, 190, 400, 30);
        add(name);

        // For Last name text field
        father_name = new JTextField();
        father_name.setFont(new Font("Raleway", Font.BOLD, 14));
        father_name.setBounds(300, 240, 400, 30);
        add(father_name);

        // For date of birth field input
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        // For email field
        email = new JTextField();
        email.setFont(new Font("Raleway", Font.BOLD, 14));
        email.setBounds(300, 390, 400, 30);
        add(email);

        // For address field
        address = new JTextField();
        address.setFont(new Font("Raleway", Font.BOLD, 14));
        address.setBounds(300, 490, 400, 30);
        add(address);

        // For City filed
        city = new JTextField();
        city.setFont(new Font("Raleway", Font.BOLD, 14));
        city.setBounds(300, 540, 400, 30);
        add(city);

        // For Pin field
        pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD, 14));
        pin.setBounds(300, 590, 400, 30);
        add(pin);

        // For State field
        state = new JTextField();
        state.setFont(new Font("Raleway", Font.BOLD, 14));
        state.setBounds(300, 640, 400, 30);
        add(state);

        // ------------------  End Text Field -------------------- //

        // ------------------ Button -------------------- //

        radioButton1 = new JRadioButton("M");
        radioButton1.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton1.setBackground(new Color(222, 255, 228));
        radioButton1.setBounds(300, 290, 60, 30);
        add(radioButton1);

        radioButton2 = new JRadioButton("F");
        radioButton2.setBackground(new Color(222, 255, 228));
        radioButton2.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton2.setBounds(450, 290, 90, 30);
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        marred_button = new JRadioButton("Married");
        marred_button.setBounds(300, 440, 100, 30);
        marred_button.setBackground(new Color(222, 255, 228));
        marred_button.setFont(new Font("Raleway", Font.BOLD, 14));
        add(marred_button);

        single_button = new JRadioButton("Single");
        single_button.setBackground(new Color(222, 255, 228));
        single_button.setBounds(450, 440, 100, 30);
        single_button.setFont(new Font("Raleway", Font.BOLD, 14));
        add(single_button);

        other = new JRadioButton("Other");
        other.setBackground(new Color(222, 255, 228));
        other.setBounds(635, 440, 100, 30);
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        add(other);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(marred_button);
        buttonGroup1.add(single_button);
        buttonGroup1.add(other);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        // ------------------ End Button -------------------- //

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String from_number = first;
        String Name = name.getText();
        String f_name = father_name.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if (radioButton1.isSelected()) {
            gender = "Male";
        } else if (radioButton2.isSelected()) {
            gender = "Female";
        } else {
            gender = "Other";
        }

        String Email = email.getText();
        String marital = null;
        if (marred_button.isSelected()) {
            marital = "Married";
        } else if (single_button.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String Address = address.getText();
        String City = city.getText();
        String pincode = pin.getText();
        String State = state.getText();

        // To add data to DB
        try {
            if (name.getText().isEmpty() || email.getText().isEmpty() || father_name.getText().isEmpty() || address.getText().isEmpty() || state.getText().isEmpty() || pin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                DBConnect connect = new DBConnect();
                String query = "insert into signup values('" + from_number + "', '" + Name + "','" + f_name + "','" + dob + "','" + gender + "','" + Email + "','" + marital + "', '" + Address + "', '" + City + "','" + pincode + "','" + State + "' )";
                connect.statement.executeUpdate(query);
                new Temp();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();
    }
}
