import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JSpinner Example");
		SpinnerModel model = new SpinnerNumberModel(1, 0, 10, 1);
		JSpinner spinner = new JSpinner(model);

		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int value = (Integer) spinner.getValue();
				System.out.println("Spinner Value: " + value);
			}
		});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLayout(null);

		spinner.setBounds(100, 80, 100, 30);
		frame.add(spinner);

		frame.setVisible(true);
	}
}
