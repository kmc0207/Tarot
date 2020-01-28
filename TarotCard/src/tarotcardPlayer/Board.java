package tarotcardPlayer;

import java.awt.BorderLayout;
import java.util.Random;
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
	public Card[] Deck = new Card[42];
	public Card[] Chosen = new Card[2];

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
	
	public void MakeCard()
	{

		for(int j=0;j<2;j++)
		{
			for(int i=0;i<21;i++)
			{
			if(j==0) {Deck[i]=new Card();
			Deck[i].setNumber(i+1);
			Deck[i].setSide(j);
			}
			if(j==1) {
				Deck[i+21]=new Card();
				Deck[i+21].setNumber(i+21);
				Deck[i+21].setSide(j);
			}
			}
		}
		
		
	}
	
	public void ChooseCard()
	{
		Random random = new Random();
		int first = random.nextInt(42);
		int second = random.nextInt(42);
		int third = random.nextInt(42);
		Chosen[0]=Deck[first];
		Chosen[1]=Deck[second];
		Chosen[2]=Deck[third];
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
		SecondCard.setIcon(null);
		panel.add(SecondCard);
		
		ThirdCard = new JLabel("New label");
		ThirdCard.setIcon(null);
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
