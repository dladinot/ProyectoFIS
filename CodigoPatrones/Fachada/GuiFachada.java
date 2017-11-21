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

public class GuiFachada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiFachada frame = new GuiFachada();
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
	public GuiFachada() {
		setTitle("Fachada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoAlSistema = new JLabel("Bienvenido al Sistema de Gestion de Monitorias");
		lblBienvenidoAlSistema.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBienvenidoAlSistema.setBounds(63, 37, 459, 21);
		contentPane.add(lblBienvenidoAlSistema);
		
		JButton btnMonitoria = new JButton("Monitoria");
		btnMonitoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Redirigiendo a modulo gestion de monitoria...");	
			}
		});
		btnMonitoria.setBounds(239, 93, 89, 23);
		contentPane.add(btnMonitoria);
		
		JButton btnIrAClasificados = new JButton("Clasificados");
		btnIrAClasificados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Redirigiendo a clasificados...");	
			}
		});
		btnIrAClasificados.setBounds(239, 161, 89, 23);
		contentPane.add(btnIrAClasificados);
		
		JButton btnVerPerfil = new JButton("Ver perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Redirigiendo a perfil...");	
			}
		});
		btnVerPerfil.setBounds(239, 127, 89, 23);
		contentPane.add(btnVerPerfil);
		
		JButton btnContactarUsuario = new JButton("Contactar usuario");
		btnContactarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Redirigiendo a contactos...");	
			}
		});
		btnContactarUsuario.setBounds(213, 195, 139, 23);
		contentPane.add(btnContactarUsuario);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Saliendo...");	
			}
		});
		btnSalir.setBounds(239, 229, 89, 23);
		contentPane.add(btnSalir);
	}

}
