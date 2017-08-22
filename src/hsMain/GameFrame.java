package hsMain;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import hsCardsMage.Mage1;
import hsCardsMage.Mage2;;


public class GameFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	Card mag1=new Mage1();
	Card mag2=new Mage2();
	
	JPanel panelOpp = new JPanel();
	JPanel panelPlayer = new JPanel();
	JPanel panelBattle = new JPanel();
	JPanel panelBattle2 = new JPanel();
	JPanel panelLeft = new JPanel();
	JPanel panelRight = new JPanel();
	
	JTextArea textArea1=new JTextArea();
	JScrollPane scroll = new JScrollPane ( textArea1);
	
	JButton button1=new JButton(mag1.getName()+" attack!");
	
	JLabel label1=new JLabel(mag1.getName()+ "   HP:"+mag1.getCurHPts() + "  ATK:" + mag1.getCurAttackPts() + ".");
	JLabel label2=new JLabel(mag2.getName()+ "   HP:"+mag2.getCurHPts() + "  ATK:" + mag2.getCurAttackPts() + ".");
	JLabel label3=new JLabel("....");
	JLabel label4=new JLabel("....");
	

	public static void main(String[] args) {

		new GameFrame().setVisible(true);
	}
	
	private GameFrame(){
		super("Monsters - Lukasz Jablonski");
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		textArea1.setSize(300, 300);
		
		add(panelOpp,BorderLayout.NORTH);
		add(panelBattle, BorderLayout.CENTER);
		add(panelBattle2, BorderLayout.CENTER);
		add(panelPlayer, BorderLayout.SOUTH);
		add(panelLeft, BorderLayout.WEST);
		add(panelRight, BorderLayout.EAST);
		
		
		panelOpp.setLayout(new FlowLayout());
		panelPlayer.setLayout(new FlowLayout());
		panelBattle.setLayout(new BorderLayout());
		panelBattle2.setLayout(new BorderLayout());
		
		
		panelOpp.add(label1);
		panelOpp.add(label3);
		
		panelPlayer.add(label2);
		panelPlayer.add(label4);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
