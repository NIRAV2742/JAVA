package animal.dom;
public class UDSubPack{
	public void eat(){
		System.out.println("eat");
	}
	public void travel(){
		System.out.println("travel");
	}
	public static void main(){
		UDSubPack pa=new UDSubPack();
		pa.eat();
		pa.travel();
	}
}