import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NumberPanel extends JPanel {
	private JTextArea area;
	
	public NumberPanel(){
		area = new JTextArea(10, 30);
		this.add(area);
	}
	
	public void addText(String s){
		area.setText(area.getText() + s);
	}
	public void setText(String s){
		area.setText(s);
	}
}
