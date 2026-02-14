package animal;
public class UDpackage{
	public void eat(){
		System.out.println("eat");
	}
	public void travel(){
		System.out.println("travel");
	}
	public static void main(){
		UDpackage pa=new UDpackage();
		pa.eat();
		pa.travel();
	}
}