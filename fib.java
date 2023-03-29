public class fib {
	
	static int fibo(int n) {
		if(n<2) {
			return 1;
		}
		else {
			return fibo(n)+fibo(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("the fibo nacho of 5 is"+fibo(5));
	}
}
