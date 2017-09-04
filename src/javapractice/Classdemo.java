package javapractice;

public class Classdemo {
	
	int x =90;
	int y =100;

	public static void main(String[] args) {
		
		Classdemo obj1 = new Classdemo();
		obj1.sum();
		System.out.println("sum is " +obj1.y);

	}
	
	public void sum(){
		int a = 30;
		int b = 40;
		int c = a + b;
		System.out.println("addition of two numbers is " +c);
	}

}
