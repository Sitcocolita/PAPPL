import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class PageAccueil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageAccueil frame = new PageAccueil();
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
	public PageAccueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//Gestion du titre
		JPanel haut = new JPanel();
		JLabel Titre = new JLabel("Contr�le de pr�sence");
		Titre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		haut.add(Titre);
		
		//Gestion des trois boutons
		JPanel milieux = new JPanel();
		milieux.setLayout(new GridLayout(3,0));
		JButton controler = new JButton("Commencer le contr�le de pr�sence");
		controler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false); 
				
				SelectionCours selection = new SelectionCours();
				selection.setVisible(true);
			}
		});  
		JPanel milieuxbas = new JPanel();
		milieuxbas.setLayout(new FlowLayout()); 
		
		JButton majEtu = new JButton("T�l�charger la liste des �tudiants");
		JButton majPhoto= new JButton("T�l�charger les photos des �tudiants");

		milieux.add(majEtu);
		milieux.add(majPhoto);
		milieux.add(controler);
		milieux.add(majEtu);
		milieux.add(majPhoto);
				
		
		

		contentPane.add(haut, BorderLayout.NORTH);
		contentPane.add(milieux, BorderLayout.CENTER);

	}
	
	

}
