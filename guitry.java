import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class guitry implements ActionListener {

	private static JLabel userLabel,passLabel,success;
	private static JPanel panel;
	private static JButton but;
	private static JPasswordField passText;
	private static JTextField userText;
	

public static void main(String[] args) {
	

	JFrame frame=new JFrame("first");
	frame.setSize(350,100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	panel=new JPanel();
	frame.add(panel);

	panel.setLayout(null);

	userLabel = new JLabel("User");
	userLabel.setBounds(50,20,80,25);
	panel.add(userLabel);

	userText=new JTextField(20);
	userText.setBounds(100,20,165,25);
	panel.add(userText);

	passLabel = new JLabel("Password");
	passLabel.setBounds(50,50,80,25);
	panel.add(passLabel);

	passText = new JPasswordField();
	passText.setBounds(100,50,80,25);
	panel.add(passText);

	but=new JButton("Login");
	but.setBounds(50,80,80,25);
	but.addActionListener(new guitry());
	panel.add(but);

	success = new JLabel("");
	success.setBounds(10,110,300,25);
	panel.add(success);




	frame.setVisible(true);

	//panel.setlayout(new Gridlayout);
}
	@Override
	public void actionPerformed(ActionEvent e){
		String user =userText.getText();
		String password=passText.getText();
		System.out.println(user+" "+password);
	}
}