abstract class operation {
	private boolean pressed; 
	
	abstract int calculate(int num1, int num2);

	public boolean getPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}
	
	abstract String getSign();
}

class addition extends operation{
	@Override
	public int calculate(int num1, int num2 ) {
		return (num1 + num2);
	}

	@Override
	String getSign() {		
		return "+";
	}
}
class minus extends operation{
	@Override
	public int calculate(int num1, int num2 ) {
		return num1 - num2;
	}

	@Override
	String getSign() {
		return "-";
	}
}
class division extends operation{
	@Override
	public int calculate(int num1, int num2 ) {
		return (int) num1 / num2;
	}

	@Override
	String getSign() {
		return "/";
	}
}
class multiply extends operation{
	@Override
	public int calculate(int num1, int num2 ) {
		return num1 * num2;
	}

	@Override
	String getSign() {
		return "*";
	}
}
