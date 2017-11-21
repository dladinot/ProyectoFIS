package patronFachada;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel banner = new JLabel("Sistema de Gestion de Monitorias");
		banner.setFont(new Font("Tahoma", Font.BOLD, 17));
		banner.setBounds(140, 41, 295, 21);
		contentPane.add(banner);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Redirigiendo a la plataforma de inicio...");	
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIngresar.setBounds(197, 180, 203, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(140, 96, 73, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contrasena:");
		lblContrasena.setBounds(140, 121, 73, 14);
		contentPane.add(lblContrasena);
		
		textField = new JTextField();
		textField.setBounds(223, 93, 212, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(223, 121, 212, 20);
		contentPane.add(passwordField);
	}
}
