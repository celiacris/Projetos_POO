package observer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JogoForm implements ActionListener {
	
	private JogoController control = new JogoController();
	private JFrame janela = new JFrame("Manter Jogo");
	private JPanel panForm = new JPanel();
	private JPanel panPrincipal = new JPanel();
	private JScrollPane panTable = new JScrollPane();
	private JTextField txtNome = new JTextField(30);
	private JTextField txtData = new JTextField(10);
	private JButton btnAdicionar = new JButton("Adicionar");
	private JButton btnPesquisar = new JButton("Pesquisar");
	private JTable tabela;
	public JogoForm() { 
		panForm.setLayout( new GridLayout(3, 2) );
		panForm.add( new JLabel("Nome : ") );
		panForm.add( txtNome );
		panForm.add( new JLabel("Lançamento : ") );
		panForm.add( txtData );
		panForm.add( btnAdicionar );
		panForm.add( btnPesquisar );
		btnAdicionar.addActionListener( this );
		btnPesquisar.addActionListener( this );
		tabela = new JTable( control );
		panTable.getViewport().add( tabela );
		panPrincipal.setLayout( new BorderLayout() );
		panPrincipal.add( panForm, BorderLayout.NORTH );
		panPrincipal.add( panTable, BorderLayout.CENTER );
		janela.setContentPane( panPrincipal );
		janela.setSize(400, 300);
		janela.setVisible( true );
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	public static void main(String[] args) { 
		new JogoForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if ("Adicionar".equals( cmd )) { 
			Jogo j = new Jogo();
			j.setNome( txtNome.getText() );
			try {
				j.setLancamento( sdf.parse( txtData.getText() ) );
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			control.salvar(j);
			tabela.invalidate();
			tabela.revalidate();
		} else if ("Pesquisar".equals( cmd )) { 
			Jogo j = control.pesquisar( txtNome.getText() );
			if ( j != null ) { 
				txtNome.setText( j.getNome() );
				txtData.setText( sdf.format( j.getLancamento() ) ); 
			}
		}
		
	}
}
