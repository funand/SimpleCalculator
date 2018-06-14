import javax.swing.JFrame;
import javax.swing.JPanel;

interface IProductBUilder {
	JPanel getProduct();
	void buildDisplayPanel();
	void buildNumberPanel();
	void buildOperandPanel();
	void buildContainer(); 
}


