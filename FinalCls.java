final class Super{
	int data=10;
}
public class FinalCls extends Super{
	public static void main(String[] args){
		Super ob=new FinalCls();
		System.out.println(ob.data);
	}
}