import java.util.Arrays;
class JaggedArr{
	public static void main(String[] args){
		int[][] arr=new int[2][];
		arr[0]=new int[4];
		arr[0][0]=10;
		arr[1]=new int[2];
		arr[1][0]=43;
		System.out.println(Arrays.deepToString(arr));
	}
}