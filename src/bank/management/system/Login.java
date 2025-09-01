package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel label1, label2, label3; // we have created the global object of the jlabel so that we can use it anywhere outside the constructor;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    Login(){ //constructor of the class.
        super("BANK MANAGEMENT SYSTEM"); // This will always remain on the top otherwise it will give
        // error and it is being used to give the title to the dialog box which is being generating.

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // the image get stored in the i1 from the system memory.
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // now we have to take our image and scale it.
        ImageIcon i3 = new ImageIcon(i2); // to make the image visible we have to make the icon again.
        JLabel image = new JLabel(i3); // we cannot directly apply the image so we will use the label.
        image.setBounds(350,10,100,100); // by this we will decide where the image must be visible on the frame.
        add(image); // by this function we can add the image.

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png")); // this is the card image section
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM"); // used to write the text on the frame.
        label1.setForeground(Color.WHITE); // sets the color of the font.
        label1.setFont(new Font("AvantGarde",Font.BOLD,38)); // sets the font properties.
        label1.setBounds(230,125,450,40); // sets the position in the frame and the parameters are according to the frame.
        add(label1); // adds the text to the frame.

        label2 = new JLabel("Card No: "); // made the card no field
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2  = new JTextField(15); // created the textfield for the card number.
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN: "); // made the pin field.
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15); // created the password input field for entering the password.
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.DARK_GRAY);
        button1.setBounds(300,300,100,30);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.DARK_GRAY);
        button2.setBounds(430,300,100,30);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.DARK_GRAY);
        button3.setBounds(300,350,230,30);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png")); // this is background image section. and this remains at lower than the above content.
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null); // default it is set as border.
        setSize(850,480); // this functions sets the width and size of the frame.
        setLocation(200,100); // in this we have to make the frame to open from the center. it has two
        // 2 arguments first is x from left and the second is y from top.
        setVisible(true); // this made true make the visibility of the frame on the screen.
    }
    public static void main(String[] args) {
        new Login();
    }
}
