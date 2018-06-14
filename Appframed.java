import javax.swing.JFrame;

public class Appframed extends JFrame{
	private static Appframed calculator;
	
	private Appframed(){
		this.setSize(500, 500);
		this.setVisible(true);
		productBuilder pnl = new productBuilder();
		this.add(pnl.getProduct());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static Appframed getFrame(){
		if(calculator == null){
			calculator = new Appframed();
		}
		return calculator;
	}
}
