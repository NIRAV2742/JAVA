abstract class Book{
	public abstract void page();
}
public class AbstractCls extends Book{
	public void page(){
	System.out.println("OLD");
	}
	public static void main(String[] args){
		Book bo=new AbstractCls();
		bo.page();
	}
}