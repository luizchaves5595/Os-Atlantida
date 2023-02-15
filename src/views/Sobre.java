package views;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sobre extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/icon120x120.png")));
		setTitle("Sobre");
		setBounds(100, 100, 578, 303);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/img/licensemit.png")));
		btnNewButton.setToolTipText("Licença MIT");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(451, 140, 124, 124);
		getContentPane().add(btnNewButton);
		
		JTextPane txtpnAEmpresaFoi = new JTextPane();
		txtpnAEmpresaFoi.setText("A empresa foi fundada há 39 anos em 15/04/1983 através do CNPJ 65.584.459/0001-04, razão social Leda de Almeida e nome fantasia Oficina Atlantica. Localizada em São Paulo / SP, a empresa é uma Matriz do tipo Empresário (Individual), de porte \"Demais\" e atualmente encontra-se BAIXADA desde 14/04/1993 na Receita Federal.");
		txtpnAEmpresaFoi.setSize(new Dimension(4, 0));
		txtpnAEmpresaFoi.setOpaque(false);
		txtpnAEmpresaFoi.setForeground(Color.BLACK);
		txtpnAEmpresaFoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnAEmpresaFoi.setBounds(41, 87, 505, 100);
		getContentPane().add(txtpnAEmpresaFoi);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Sobre.class.getResource("/img/icon120x120.png")));
		lblNewLabel.setBounds(210, 39, 192, 53);
		getContentPane().add(lblNewLabel);
		
		JPanel panelUsuarios = new JPanel();
		panelUsuarios.setLayout(null);
		panelUsuarios.setBackground(new Color(32, 178, 170));
		panelUsuarios.setBounds(0, 0, 562, 20);
		getContentPane().add(panelUsuarios);
		
		JPanel panelUsuarios_1 = new JPanel();
		panelUsuarios_1.setLayout(null);
		panelUsuarios_1.setBackground(new Color(32, 178, 170));
		panelUsuarios_1.setBounds(0, 244, 562, 20);
		getContentPane().add(panelUsuarios_1);

	}
}
