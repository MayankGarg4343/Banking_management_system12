package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
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

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png")); // this is background image section.
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setLayout(null); // default it is set as border.
        setSize(850,480); // this functions sets the width and size of the frame.
        setLocation(200,100); // in this we have to make the frame to open from the center. it have two
        // 2 arguements first is x from left and the second is y from top.
        setVisible(true); // this made true make the visibility of the frame on the screen.
    }
    public static void main(String[] args) {
        new Login();
    }
}
