class NestSta{
	static int ou_x=10;
	int ou_y=20;
	private int ou_pr=30;
	static class Inner {
		void display(){
			System.out.println(ou_x);
			System.out.println(ou_y);
			NestSta ns=new NestSta();
			System.out.println(ns.ou_pr);
		}
	}
}
class Main{
	public static void main(String[] args){
		NestSta o=new NestSta();
		NestSta.Inner I=new NestSta.Inner();
		I.display();
	}
}