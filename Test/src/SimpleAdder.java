public class SimpleAdder {
	private int num = 0;

	public SimpleAdder add(int num) {
		this.num += num;
		return this;
	}

	public void showResult() {
		System.out.println("add result : " + num);
	}
}



class AAA {
	int num1;
}

class BBB extends AAA {
	
	int num2;
	BBB() {
		super();
		num2=0;
	}
}