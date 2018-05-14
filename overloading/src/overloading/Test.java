package overloading;

public class Test {

	
	 public void m1(){
		  System.out.println("no-args");
	 }
	 public void m1(int i){
		 System.out.println("int-args");
	 }
	 public void m1(double d){
		 System.out.println("double-args");
	 }
	 public void m1(String s){
	 		System.out.println("string-args");
	 }
		 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.m1();
		t.m1(10);
		t.m1(1000);
		t.m1("welcome to string");

	}

}

