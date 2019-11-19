import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PropController extends PropWindow{
	private int nTaps;
	private JButton tapButton;
	private JFrame subjectFrame;
	private PropertyChangable chang;
	
	PropController(PropWindow win){
		nTaps = 0;
		chang = new PropertyChangable();
		chang.addPropertyChangeListener(e -> 
        label.setText((String) e.getNewValue()));
		
		
		// Build the window frame for the observed subject.
		buildWindowFrame();

		// Register the action that will be observed.
		registerTapObservedAction();
	}
	
	private void buildWindowFrame() {
		subjectFrame = new JFrame("Subject being Observed");
		tapButton = new JButton("Tap me");
		subjectFrame.add(tapButton);
		subjectFrame.setSize(250, 150);
		subjectFrame.setLocation(600, 200);
		subjectFrame.setVisible(true);
	}

	private void registerTapObservedAction() {
		tapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "   Subject was tapped: " + ++nTaps;
				chang.setTaps(data);
			}
		});
	}

}
