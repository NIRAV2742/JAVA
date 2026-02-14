interface first{
	void display();
}
class oop implements first{
	public void display(){
		System.out.println("Interface");
	}
	void two(){
		System.out.println("B-2");
	}
}
class ex extends oop{
	void three(){

			System.out.println("c-3");
		
	}
}
class Interface1{
	public static void main(String[] args){
	oop p=new oop();
	p.two();
	p.display();
}
}
