import java.awt.*;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JLabel title = new JLabel("LOGIN");
	JLabel id = new JLabel("User ID");
	JLabel pw = new JLabel("Password");
	JButton loginButton = new JButton("Login");
	JButton reset = new JButton("Reset");
	JTextField userId = new JTextField();
	JPasswordField userPw = new JPasswordField();
	JLabel msg = new JLabel();
		
	
	HashMap<String, String> info = new HashMap<String, String>();
	
	//constructor
	
	HomePage(HashMap<String, String>login){
		info = login; // global
		
		id.setBounds(50, 100, 75, 25);
		pw.setBounds(50, 150, 75, 25);
		msg.setBounds(125, 250, 250, 35);
		msg.setFont(new Font(null, Font.ITALIC, 25)); //Font
		userId.setBounds(125, 100, 200, 25);
		userPw.setBounds(125, 150, 200, 25);
		
		
		
		loginButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(159, 159, 255), new Color(159, 159, 255), new Color(159, 159, 255), 
		new Color(159, 159, 255)));
		loginButton.setBackground(new Color(159, 159, 255));
		loginButton.setFont(new Font("Cambria", Font.BOLD, 18));
		loginButton.setForeground(new Color(62, 62, 62));
		loginButton.setBounds(210, 230, 69, 28);
		panel.add(loginButton);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		reset.setFont(new Font("Cambria", Font.BOLD, 18));
		reset.setForeground(new Color(62, 62, 62));
		reset.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(159, 159, 255), new Color(159, 159, 255), new Color(159, 159, 255), new Color(159, 159, 255)));
		reset.setBackground(new Color(159, 159, 255));
		reset.setBounds(300, 230, 75, 28);
		panel.add(reset);
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		reset.setFocusable(false);
		reset.addActionListener(this);
		
		
		frame.add(userId);
		frame.add(userPw);
		frame.add(id);
		frame.add(pw);
		frame.add(msg);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		frame.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 16));
		frame.getContentPane().setBackground(new Color(196, 196, 255));
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		panel.setBackground(new Color(247, 149, 68));
		panel.setBounds(32, 26, 400, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		panel_1.setBounds(0, 0, 190, 400);
		panel_1.setBackground(new Color(33, 7, 72));
		panel.add(panel_1);
		panel_1.setLayout(null);
		

		title.setForeground(new Color(69, 69, 69));
		title.setFont(new Font("Cambria", Font.BOLD, 20));
		title.setBounds(266, 95, 100, 16);
		panel.add(title);
		
	
		userId.setBounds(266, 135, 96, 19);
		panel.add(userId);
		userId.setColumns(10);
		
		userPw.setBounds(266, 175, 96, 19);
		panel.add(userPw);
		
		id.setFont(new Font("Candara", Font.PLAIN, 14));
		id.setForeground(new Color(69, 69, 69));
		id.setBounds(200, 135, 69, 20);
		panel.add(id);
		
		pw.setForeground(new Color(69, 69, 69));
		pw.setFont(new Font("Candara", Font.PLAIN, 14));
		pw.setBounds(200, 175, 69, 24);
		panel.add(pw);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//reset, clear fields
		if(e.getSource() == reset) {
			userId.setText(" ");
			userPw.setText(" ");
		}
		
		//login
		if(e.getSource() == loginButton) {
		String id = userId.getText();
		String pw = String.valueOf(userPw.getPassword());
		
		//verification
		if(info.containsKey(id)) {
			if(info.get(id).equals(pw)) {
				msg.setForeground(Color.green); 
				msg.setText("Success!");
				frame.dispose();
				SignedIn signedIn = new SignedIn(id);
			}else {
				msg.setForeground(Color.red); 
				msg.setFont(new Font("Cambria", Font.BOLD, 18));
				msg.setBounds(260, 290, 150, 40);
				msg.setText("Wrong password");
			}
		}else {
		msg.setForeground(Color.red); 
		msg.setFont(new Font("Cambria", Font.BOLD, 18));
		msg.setBounds(260, 290, 150, 40);
		msg.setText("Invalid user id");
	}
		}
	}
}

