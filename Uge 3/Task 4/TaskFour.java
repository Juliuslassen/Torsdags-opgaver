public class TaskFour{
	
	public static void main(String[] args) {
		fibonacci(1,1);
	}

	public static void fibonacci(int a, int b){
		if (a<1000)
		{
			System.out.print(a+ "\t");
			fibonacci(b, a+b);	
		}
	}

}