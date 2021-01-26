package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.bean.Cliente;
import model.dao.ClienteDAO;

public class JFAtualizarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;

	private static int id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAtualizarCliente frame = new JFAtualizarCliente(id);
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
	public JFAtualizarCliente(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 87, -1);
		contentPane.add(lblNewLabel);
		
		ClienteDAO cdao = new ClienteDAO();
		Cliente c = cdao.read(id);
		
		JLabel lblNewLabel_5 = new JLabel("ID do Cliente");
		lblNewLabel_5.setBounds(15, 11, 83, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblId = new JLabel("New label");
		lblId.setBounds(95, 11, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Clientes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(108, 22, 215, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Completo:");
		lblNewLabel_2.setBounds(21, 57, 87, 30);
		contentPane.add(lblNewLabel_2);
		
		txtNome = new JTextField();
		txtNome.setBounds(118, 65, 221, 14);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(26, 97, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(110, 95, 140, 17);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setBounds(26, 138, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(62, 134, 109, 23);
		contentPane.add(rdbtnFeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(173, 134, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(rdbtnFeminino);
		sexo.add(rdbtnMasculino);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtCPF.setText(null);
				sexo.clearSelection();
				
			}
		});
		btnLimpar.setBounds(161, 207, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(287, 207, 89, 23);
		contentPane.add(btnCancelar);
		
		lblId.setText(String.valueOf(c.getIdCliente()));
		txtNome.setText(c.getNome());
		txtCPF.setText(c.getCpf());
		if(rdbtnFeminino.isSelected()) {
			c.setSexo(false);
		}else if (rdbtnMasculino.isSelected()) {
			c.setSexo(true);
			
		}
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cliente c = new Cliente();
				ClienteDAO dao = new ClienteDAO();
				
				c.setIdCliente(Integer.parseInt(lblId.getText()));
				c.setNome(txtNome.getText());
				c.setCpf(txtCPF.getText());
				
				if(rdbtnFeminino.isSelected()) {
					c.setSexo(false);
				}else if (rdbtnMasculino.isSelected()) {
					c.setSexo(true);
				}
				
				dao.update(c);
				dispose();
			}
		});
		
		btnAlterar.setBounds(24, 207, 89, 23);
		contentPane.add(btnAlterar);

	}

}
