/*	Desarrolle la interfaz para una agencia de Quiniela, en donde deberá tener un menú de ventana con cuatro opciones y dentro de cada una:

Inicio: Presentación con texto y gráfico

Ingreso de la apuesta: DNI, Nombres, Apellidos, Fecha, Hora y Monto.

Números sorteados: Número + “Quiniela nacional matutina”.

Resultados: Ganadores (Número ganador + DNI, Nombres, Apellidos, Fecha, Hora y Monto)*/


package AppQuiniela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import java.awt.Panel;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppQuiniela {

	private JFrame frmAppQuiniela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppQuiniela window = new AppQuiniela();
					window.frmAppQuiniela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppQuiniela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAppQuiniela = new JFrame();
		frmAppQuiniela.setTitle("APP QUINIELA");
		frmAppQuiniela.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ricardo\\Desktop\\IRSO\\2022\\INTEGRACION DE PROGRAMACION\\Parciales\\letra-q-en-estilo-circo-ilustración-del-vector-un-fondo-blanco-159600914.jpg"));
		frmAppQuiniela.setBounds(100, 100, 374, 388);
		frmAppQuiniela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frmAppQuiniela.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("App Quiniela \r\n\r\n\r\n");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(89, 11, 187, 33);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tu App de Apuestas Online");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(100, 33, 179, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\IRSO\\2022\\INTEGRACION DE PROGRAMACION\\Parciales\\quiniela_862x485_wmk.jpg"));
		lblNewLabel_3.setBounds(0, 0, 373, 77);
		panel.add(lblNewLabel_3);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuItem.setBounds(198, -13, 137, 26);
		panel.add(menuItem);
		
		JButton btnNewButton = new JButton("INGRESE SUS DATOS PARA APOSTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Apuestas JInternalFrame =  new Apuestas();
				JInternalFrame.setVisible(true);
			
			}
			
			
			
		});
		btnNewButton.setBounds(40, 100, 289, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SALIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(40, 251, 289, 44);
		panel.add(btnNewButton_1);
		
		JButton btnNumerosSorteados = new JButton("NUMEROS SORTEADOS");
		btnNumerosSorteados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sorteados JInternalFrame =  new Sorteados();
				JInternalFrame.setVisible(true);
				
			}
		});
		btnNumerosSorteados.setBounds(40, 151, 289, 39);
		panel.add(btnNumerosSorteados);
		
		JButton btnResultados = new JButton("RESULTADOS");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultados JInternalFrame =  new Resultados();
				JInternalFrame.setVisible(true);
				
			}
		});
		btnResultados.setBounds(40, 201, 289, 39);
		panel.add(btnResultados);
		
		JMenuBar menuBar = new JMenuBar();
		frmAppQuiniela.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_2 = new JMenu("NUMEROS SORTEADOS\r\n");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("VER NUMEROS SORTEADOS");
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_3 = new JMenu("GANADORES\r\n");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("VER GANADORES");
		mnNewMenu_3.add(mntmNewMenuItem_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
