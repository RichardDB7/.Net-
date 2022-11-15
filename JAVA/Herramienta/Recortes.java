
/*Desarrollo el siguiente ejercicio práctico sólo con la herramienta visual Windows Builder(Eclipse)*/

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JToggleButton;

public class Herramienta {

	private JFrame frmHerramientaRecortes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Herramienta window = new Herramienta();
					window.frmHerramientaRecortes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Herramienta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHerramientaRecortes = new JFrame();
		frmHerramientaRecortes.getContentPane().setBackground(Color.WHITE);
		frmHerramientaRecortes.getContentPane().setForeground(Color.WHITE);
		frmHerramientaRecortes.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ricardo\\Downloads\\Nueva.png"));
		frmHerramientaRecortes.setTitle("Herramienta Recortes");
		frmHerramientaRecortes.setBounds(100, 100, 590, 142);
		frmHerramientaRecortes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Modo  ▼");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\Mode.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\New.png"));
		
		JButton btnAplazar = new JButton("Aplazar   ▼");
		btnAplazar.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\Quit.png"));
		btnAplazar.setForeground(Color.BLACK);
		btnAplazar.setBackground(Color.WHITE);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\Crux.png"));
		
		JButton btnNewButton_3 = new JButton("Opciones\r\n");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\Option.png"));
		
		JLabel lblNewLabel = new JLabel("   \r\n\r\n\r\n Seleccione el modo recorte medante el boton Modo o haz clic  en el boton Nuevo.");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\QuestionSign.png"));
		GroupLayout groupLayout = new GroupLayout(frmHerramientaRecortes.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAplazar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(54))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNewLabel_1)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAplazar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
					.addContainerGap())
		);
		frmHerramientaRecortes.getContentPane().setLayout(groupLayout);
	}
}
