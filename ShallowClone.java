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
		abc a1=a;
		a1.j=3;
		System.out.println(a);
		System.out.println(a1);
	}
}