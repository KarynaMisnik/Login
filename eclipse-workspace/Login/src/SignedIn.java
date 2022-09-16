import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class SignedIn {
JFrame frame = new JFrame();
JLabel signed = new JLabel("You are signed in");

//constructor
SignedIn(String id){
	
signed.setBounds(10,10, 450, 35);
signed.setText("You are signed in as " + id);
signed.setFont(new Font("Cambria", Font.BOLD, 18));
signed.setForeground(new Color(62, 62, 62));

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
frame.add(signed);	
frame.setSize(600,600);
frame.setLayout(null);
frame.setVisible(true);

}
}
