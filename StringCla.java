public class StringCla{
	public static void main(String[] args){
		String st="Hello";
		System.out.println(st.charAt(0));
		String F_n="John ";
		String L_n="Doe";
		System.out.println(F_n.concat(L_n));
		String st1="Hello";
		String st2="Hello";
		System.out.println(st1.equals(st2));
		String ms="Hello";
		System.out.println(ms.contains("He"));
		System.out.println(ms.contains("llo"));
		System.out.println(ms.endsWith("He"));
		System.out.println(ms.endsWith("o"));
		System.out.println(ms.endsWith("llo"));
		System.out.println(ms.endsWith("h"));
	}
}
