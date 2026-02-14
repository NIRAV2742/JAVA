class NestNoSta{
	static int ou_x=10;
	int ou_y=20;
	private int ou_pr=30;
	class Inner {
		void display(){
			System.out.println(ou_x);
			System.out.println(ou_y);
			System.out.println(ou_pr);
		}
	}
}
class C{
	public static void main(String[] args){
		NestNoSta o=new NestNoSta();
		NestNoSta.Inner I=o.new Inner();
		I.display();
	}
}