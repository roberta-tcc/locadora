package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.bean.Filme;
import model.dao.FilmeDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFCadastrarFilme extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtSinopse;
	private JTextField txtCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFCadastrarFilme frame = new JFCadastrarFilme();
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
	public JFCadastrarFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JLabel JLtitulo = new JLabel(" Cadastrar Filme");
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLtitulo, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLtitulo, 146, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JLtitulo, 31, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JLtitulo, -68, SpringLayout.EAST, contentPane);
		JLtitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(JLtitulo);

		JLabel JLtitulofilme = new JLabel("T\u00EDtulo");
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLtitulofilme, 43, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLtitulofilme, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JLtitulofilme, 56, SpringLayout.WEST, contentPane);
		contentPane.add(JLtitulofilme);

		txtTitulo = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTitulo, 43, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTitulo, 55, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtTitulo, 57, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtTitulo, 425, SpringLayout.WEST, contentPane);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

		JLabel JLsinopse = new JLabel("Sinopse");
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLsinopse, 84, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLsinopse, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JLsinopse, 56, SpringLayout.WEST, contentPane);
		contentPane.add(JLsinopse);

		txtSinopse = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtSinopse, 81, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtSinopse, 54, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtSinopse, 146, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtSinopse, 414, SpringLayout.WEST, contentPane);
		contentPane.add(txtSinopse);
		txtSinopse.setColumns(10);

		JLabel lblNewLabel = new JLabel("Categoria");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 157, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 85, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);

		txtCategoria = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtCategoria, 157, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtCategoria, 64, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtCategoria, 171, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtCategoria, 414, SpringLayout.WEST, contentPane);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);

		JSpinner spTempo = new JSpinner();
		sl_contentPane.putConstraint(SpringLayout.WEST, spTempo, 10, SpringLayout.WEST, contentPane);
		contentPane.add(spTempo);

		JLabel lblNewLabel_1 = new JLabel("Tempo");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, spTempo, 7, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 21, SpringLayout.SOUTH, lblNewLabel);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Imagem");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 123, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(lblNewLabel_2);

		JRadioButton rdbtn2d = new JRadioButton("2D");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtn2d, 12, SpringLayout.SOUTH, lblNewLabel_2);
		contentPane.add(rdbtn2d);

		JRadioButton rdbtn3d = new JRadioButton("3D");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtn3d, 12, SpringLayout.SOUTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, spTempo, -81, SpringLayout.WEST, rdbtn3d);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtn3d, -6, SpringLayout.WEST, rdbtn2d);
		contentPane.add(rdbtn3d);

		ButtonGroup imagem = new ButtonGroup();
		imagem.add(rdbtn2d);
		imagem.add(rdbtn3d);

		JLabel lblNewLabel_3 = new JLabel("Audio");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_3, -86, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel_3);

		JRadioButton rdbtnDublado = new JRadioButton("Dublado");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnDublado, 7, SpringLayout.SOUTH, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtn2d, -65, SpringLayout.WEST, rdbtnDublado);
		contentPane.add(rdbtnDublado);

		JRadioButton rdbtnLegendado = new JRadioButton("Legendado");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnLegendado, 7, SpringLayout.SOUTH, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnDublado, -6, SpringLayout.WEST, rdbtnLegendado);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnLegendado, -10, SpringLayout.EAST, contentPane);
		contentPane.add(rdbtnLegendado);

		ButtonGroup audio = new ButtonGroup();
		audio.add(rdbtnDublado);
		audio.add(rdbtnLegendado);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Filme f = new Filme();
				FilmeDAO dao = new FilmeDAO();
				f.setTitulo(txtTitulo.getText());
				f.setSinopse(txtSinopse.getText());
				f.setCategoria(txtCategoria.getText());
				f.setTempo(Integer.parseInt(spTempo.getValue().toString()));
				if (rdbtn2d.isSelected()) {
					f.setImagem3d(false);
				} else if (rdbtn3d.isSelected()) {
					f.setImagem3d(true);
				}
				if (rdbtnDublado.isSelected()) {
					f.setDublado(true);
				} else if (rdbtnLegendado.isSelected()) {
					f.setDublado(false);
				}
				dao.create(f);

			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, spTempo, -6, SpringLayout.NORTH, btnCadastrar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCadastrar, 30, SpringLayout.WEST, contentPane);
		btnCadastrar.setBounds(10, 400, 89, 23);
		contentPane.add(btnCadastrar);

		JButton btnLimpar = new JButton("Limpar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCadastrar, 0, SpringLayout.NORTH, btnLimpar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLimpar, 0, SpringLayout.WEST, rdbtn2d);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLimpar, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnLimpar);

		JButton btnCancelar = new JButton("Cancelar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnLimpar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancelar, 0, SpringLayout.EAST, txtTitulo);
		contentPane.add(btnCancelar);
	}
}
