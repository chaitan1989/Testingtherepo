package javapractice;

public class Classdemo2 {
	
	int x =90;
	int y =100;

	public static void main(String[] args) {
		
		Classdemo2 obj1 = new Classdemo2();
		obj1.sum();
		System.out.println("sum is " +obj1.x);

	}
	
	public void sum(){
		int a = 30;
		int b = 40;
		int c = a + b;
		System.out.println("addition of two numbers is " +c);
	}

}
