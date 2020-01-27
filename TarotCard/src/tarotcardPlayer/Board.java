package tarotcardPlayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Board extends JFrame {

	private JPanel contentPane;
	private JLabel ThirdCard;
	private JTextField ThirdText;
	private JTextField SecondText;
	private JTextField FirstText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board frame = new Board();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Board() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel FirstCard = new JLabel("New label");
		panel.add(FirstCard);
		
		JLabel SecondCard = new JLabel("New label");
		panel.add(SecondCard);
		
		ThirdCard = new JLabel("New label");
		panel.add(ThirdCard);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		FirstText = new JTextField();
		panel_1.add(FirstText);
		FirstText.setColumns(10);
		
		SecondText = new JTextField();
		panel_1.add(SecondText);
		SecondText.setColumns(10);
		
		ThirdText = new JTextField();
		panel_1.add(ThirdText);
		ThirdText.setColumns(10);
	}

}
