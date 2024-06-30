package brocode;
import javax.swing.JOptionPane;

public class dialogbox {

	public static void main(String[] args) {
		String Name= JOptionPane.showInputDialog("Enter your age:");
		JOptionPane.showMessageDialog(null,"Hello"+Name);
	}

}
