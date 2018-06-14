
public class Function {
	private int first, second;
	private operation op;
	public Function(){
		op = new addition();
	}
	
	public int getFirst() {
		return first;
	}
	
	public void concat(int num){
		if(!op.getPressed()){
			first = first*10 + num;
		}
		else{
			second = second*10 + num;
		}
	}
	
	public void setOp(operation op) {
		this.op = op;
		op.setPressed(true);
	}
	
	public int calculate(){
		return op.calculate(first, second);
	}
	
}
