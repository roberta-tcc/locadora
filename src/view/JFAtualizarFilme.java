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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import model.bean.Filme;
import model.dao.FilmeDAO;

public class JFAtualizarFilme extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtSinopse;
	private JTextField txtCategoria;
	
	private static int id;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAtualizarFilme frame = new JFAtualizarFilme(id);
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
	public JFAtualizarFilme(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
	
	JLabel JLtitulo = new JLabel("Atualizar Filme");
	sl_contentPane.putConstraint(SpringLayout.NORTH, JLtitulo, 10, SpringLayout.NORTH, contentPane);
	sl_contentPane.putConstraint(SpringLayout.WEST, JLtitulo, 146, SpringLayout.WEST, contentPane);
	sl_contentPane.putConstraint(SpringLayout.SOUTH, JLtitulo, 31, SpringLayout.NORTH, contentPane);
	sl_contentPane.putConstraint(SpringLayout.EAST, JLtitulo, -124, SpringLayout.EAST, contentPane);
	JLtitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
	contentPane.add(JLtitulo);

	FilmeDAO fdao = new FilmeDAO();
	Filme f = fdao.read(id);
	
	JLabel lblNewLabel_4 = new JLabel("ID do filme");
	sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 5, SpringLayout.NORTH, JLtitulo);
	contentPane.add(lblNewLabel_4);
	
	JLabel lblId = new JLabel("New label");
	contentPane.add(lblId);
	
	JLabel JLtitulofilme = new JLabel("T\u00EDtulo");
	sl_contentPane.putConstraint(SpringLayout.NORTH, JLtitulofilme, 43, SpringLayout.NORTH, contentPane);
	sl_contentPane.putConstraint(SpringLayout.WEST, JLtitulofilme, 10, SpringLayout.WEST, contentPane);
	sl_contentPane.putConstraint(SpringLayout.EAST, JLtitulofilme, 56, SpringLayout.WEST, contentPane);
	contentPane.add(JLtitulofilme);

	txtTitulo = new JTextField();
	sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, txtTitulo);
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

	lblId.setText(String.valueOf(f.getIdFilme()));
	txtTitulo.setText(f.getTitulo());
	txtSinopse.setText(f.getSinopse());
	txtCategoria.setText(f.getCategoria());
	spTempo.setValue(f.getTempo());
	if(f.isImagem3d() == true) {
		rdbtn3d.setSelected(true);
	}else if (f.isImagem3d() == false) {
		rdbtn2d.setSelected(true);
	}
	if(f.isDublado() == true) {
		rdbtnDublado.setSelected(true);
	}else if (f.isDublado() == false) {
		rdbtnLegendado.setSelected(true);
	}
	
	JButton btnAlterar = new JButton("Atualizar");
	btnAlterar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			Filme f = new Filme();
			FilmeDAO dao = new FilmeDAO();
			
			f.setIdFilme(Integer.parseInt(lblId.getText()));
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
			dao.update(f);
			dispose();
		}
	});
	sl_contentPane.putConstraint(SpringLayout.SOUTH, spTempo, -6, SpringLayout.NORTH, btnAlterar);
	sl_contentPane.putConstraint(SpringLayout.WEST, btnAlterar, 30, SpringLayout.WEST, contentPane);
	btnAlterar.setBounds(10, 400, 89, 23);
	contentPane.add(btnAlterar);

	JButton btnLimpar = new JButton("Limpar");
	btnLimpar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				txtTitulo.setText(null);
				txtSinopse.setText(null);
				txtCategoria.setText(null);
				spTempo.setValue(0);
				imagem.clearSelection();
				audio.clearSelection();			
		}
	});
	sl_contentPane.putConstraint(SpringLayout.NORTH, btnAlterar, 0, SpringLayout.NORTH, btnLimpar);
	sl_contentPane.putConstraint(SpringLayout.WEST, btnLimpar, 0, SpringLayout.WEST, rdbtn2d);
	sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLimpar, -10, SpringLayout.SOUTH, contentPane);
	contentPane.add(btnLimpar);

	JButton btnCancelar = new JButton("Cancelar");
	btnCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});
	sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnLimpar);
	sl_contentPane.putConstraint(SpringLayout.EAST, btnCancelar, 0, SpringLayout.EAST, txtTitulo);
	contentPane.add(btnCancelar);
	
	
}
}
