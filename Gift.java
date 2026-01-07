class Gift{
	public strictfp double sum(){
		double num1=10e+10;
		double num2=6e+02;
		return (num1+num2);
	}
	public static void main(String[] args){
		Gift gift=new Gift();
		System.out.println(sum());
	}
}