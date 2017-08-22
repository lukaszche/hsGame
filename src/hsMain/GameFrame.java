package hsMain;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hsCardsMage.Mage1;;


public class GameFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	Card mag1=new Mage1();
	Card mag2=new Mage2();
	
	JPanel panelOpp = new JPanel();
	JPanel panelPlayer = new JPanel();
	JPanel panelBattle = new JPanel();
	JPanel panelLeft = new JPanel();
	JPanel panelRight = new JPanel();

	public static void main(String[] args) {

		new GameFrame().setVisible(true);
	}
	
	private GameFrame(){
		super("Monsters - Lukasz Jablonski");
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
