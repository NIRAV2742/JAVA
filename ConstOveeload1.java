class A{
	A(){
		System.out.println("Class A!");
	}
}
class B extends A{
	B(){
		System.out.println("Class B!");
	}
}
public class ConstOveeload1{
	public static void main(String[] args){
		B o=new B();
	}
}