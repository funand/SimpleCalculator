import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class BuilderPattern {
	public static void main(String[] args) {
		Appframed display = Appframed.getFrame();		
	}
}

class productBuilder implements IProductBUilder{
	JPanel process, numberPanel, container, upper, lower;
	JButton number, equalsTOO;
	NumberPanel displayPanel;
	ArrayList<JButton>numbers;
	Function function;
	
	public void buildNumberPanel(){
		numberPanel = new JPanel();
		numberPanel.setLayout(new GridLayout(4, 3));
				
		for(int i = 0; i<10; i++){
			number = new JButton(""+i);		
			int temp = i;
			number.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					function.concat(temp);
										
					displayPanel.addText(""+temp);					
				}
				
			});						
			numberPanel.add(number);			
		}
		lower = new JPanel();
		lower.setLayout(new GridLayout(1, 2));
		lower.add(numberPanel);			
	}
	
	public void buildOperandPanel(){
		process = new JPanel();
		process.setLayout(new GridLayout(5, 1));
		operation[] operands = new operation[4];
		operands[0] = new addition();
		operands[1] = new minus();
		operands[2] = new division();
		operands[3] = new multiply();
		
		for(int i =0; i< operands.length; i++){
			JButton sign = new JButton(operands[i].getSign());
			process.add(sign);
			int temp = i;
			sign.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					function.setOp(operands[temp]);
					String msg = "";
					msg += operands[temp].getSign();
					displayPanel.addText(""+msg);					
				}				
			});
		}
				
		equalsTOO = new JButton("=");
		equalsTOO.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				displayPanel.setText(""+function.calculate());				
			}
		});
		process.add(equalsTOO);
		lower.add(process);		
	}
	
	public void buildDisplayPanel(){
		displayPanel = new NumberPanel();
		upper = new JPanel();
		upper.add(displayPanel);
	}
	

	public void buildContainer(){
		container = new JPanel();
		container.setLayout(new GridLayout(2, 1));	
	}

	@Override
	public JPanel getProduct() {
		function = new Function();
		buildContainer();
		buildDisplayPanel();
		buildNumberPanel();
		buildOperandPanel();
		container.add(upper);
		container.add(lower);
		return container;
	}
}