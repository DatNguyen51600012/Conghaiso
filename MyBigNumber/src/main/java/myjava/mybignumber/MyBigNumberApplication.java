package myjava.mybignumber;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MyBigNumberApplication implements IReceiver{

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JTextField result;
	private JTextArea textArea;
	private String temp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyBigNumberApplication window = new MyBigNumberApplication();
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
	public MyBigNumberApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 608, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setAlignOnBaseline(true);
		
		JLabel lblApplicationPlusTwo = new JLabel("Application plus two number sequences");
		lblApplicationPlusTwo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblAdditional = new JLabel("Additional two numbers and submit");
		
		JLabel lblStepByStep = new JLabel("Step by step");
		
		textArea = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblApplicationPlusTwo)
							.addGap(121))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAdditional))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
								.addComponent(lblStepByStep))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblApplicationPlusTwo)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdditional)
						.addComponent(lblStepByStep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel("The First Number     ");
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(lblNewLabel);
		
		num1 = new JTextField();
		panel1.add(num1);
		num1.setColumns(10);
		
		JLabel lblTheSecondNumber = new JLabel("The Second Number");
		lblTheSecondNumber.setBackground(new Color(240, 240, 240));
		panel1.add(lblTheSecondNumber);
		
		num2 = new JTextField();
		panel1.add(num2);
		num2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Result                      ");
		panel1.add(lblNewLabel_1);
		
		result = new JTextField();
		panel1.add(result);
		result.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(255, 255, 204));
		panel1.add(btnSubmit);
		btnSubmit.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getComments2ActionPerformed(e);
			}
		});
		
		JButton btnClean = new JButton("Clean");
		panel1.add(btnClean);
		btnClean.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				num1.setText(null);
				num2.setText(null);
				result.setText(null);
				textArea.setText(null);
			}
			
		});
		panel1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
		frame.getContentPane().setLayout(groupLayout);
	}
	
	private void  getComments2ActionPerformed(java.awt.event.ActionEvent evt) {
		final String pattern = "\\d+"; // Chuỗi đại diện cho kí tự số từ [0-9]
        final boolean flag1;// biến để lưu dữ kết quả xét chuỗi s1 
        final boolean flag2;// biến để lưu dữ kết quả xét chuỗi s2
        String s1 = num1.getText();
        String s2 = num2.getText();
        // Kiểm tra kí tự đặc biệt
        flag1 = s1.matches(pattern);
        flag2 = s2.matches(pattern);
        if (!flag1) {
            JOptionPane.showMessageDialog(textArea,"Trong chuỗi số " + s1 + " có chưa kí tự đặc biệt");
        }
        
        if (!flag2) {
            JOptionPane.showMessageDialog(textArea,"Trong chuỗi số " + s2 + " có chưa kí tự đặc biệt");
        }
        MyBigNumber mybignumber = new MyBigNumber(this);
        String sum = mybignumber.sum(s1,s2);
        result.setText(sum);
	}
	
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		textArea.setText(msg);
	}
}
