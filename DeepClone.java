class abc{
	int i,j;
	public String toString(){
		return "abc i=="+i+"abc j=="+j;
	}
}
class ShallowClone{
	public static void main(String[] args){
		abc a=new abc();
		a.i=5;
		a.j=6;
		abc a1=new abc();
		a1.i=a.i;
		a1.j=a.j;
		a1.j=10;
		System.out.println(a+a1);
	}
}