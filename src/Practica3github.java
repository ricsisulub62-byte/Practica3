import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
public class  Practica3github  extends JFrame  {
	private JTextField textN1;
	private JTextField textN2;
	public Practica3github() {
		getContentPane().setLayout(null);
		
		JLabel lblCalBas = new JLabel("Calculadora Básica");
		lblCalBas.setBounds(148, 22, 110, 14);
		getContentPane().add(lblCalBas);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(109, 113, 89, 23);
		getContentPane().add(btnSumar);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(51, 44, 76, 14);
		getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(219, 44, 76, 14);
		getContentPane().add(lblNumero2);
		
		textN1 = new JTextField();
		textN1.setBounds(109, 41, 86, 20);
		getContentPane().add(textN1);
		textN1.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setColumns(10);
		textN2.setBounds(290, 41, 86, 20);
		getContentPane().add(textN2);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.setBounds(260, 113, 89, 23);
		getContentPane().add(btnRestar);
	}
}
