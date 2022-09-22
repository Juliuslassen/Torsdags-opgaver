import java.util.Random;

public class MathWork{

	static int[] intArr={1,1,1,2,2,3,3,3,4,5,5,5,6,6,7,8,8,9,9,10};
	static Random rand = new Random();
	
	public static void main(String[] args) {
		divisible(3);
		getRandom();
		recursion(10);
	}

	public static void divisible(int a){
		for (int i=0; i<100;i++){
			if (i%a==0){
				System.out.println(i);
			}
		}
	}

	public static void getRandom(){
		System.out.println(intArr[rand.nextInt(intArr.length)]);
	}

	public static void recursion(int k){
		System.out.println(k);
		if (k>0){
		recursion(k-1);
		}
	}
}