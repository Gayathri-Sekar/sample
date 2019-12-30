import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fantasy {

	private JFrame frame;
	private JTextField u;
	private JTextField p;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fantasy window = new Fantasy();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fantasy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User name");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(140, 93, 76, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBackground(Color.ORANGE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(140, 149, 76, 14);
		panel.add(lblPassword);
		
		u = new JTextField();
		u.setBounds(284, 91, 86, 20);
		panel.add(u);
		u.setColumns(10);
		
		p = new JTextField();
		p.setBounds(284, 133, 86, 20);
		panel.add(p);
		p.setColumns(10);
		
		tf = new JTextField();
		tf.setBounds(99, 251, 138, 42);
		panel.add(tf);
		tf.setColumns(10);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(305, 251, 148, 42);
		panel.add(ta);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=(u.getText());
				String password=p.getText();
				tf.setText(name+""+password);
				ta.setText(name+""+password);
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(224, 188, 89, 23);
		panel.add(btnNewButton);
	}
}
