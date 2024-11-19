package kalyan.math;

public class MyMath {

	public int calculate(int [] numbers) {
		int sum=0;
		for(int number:numbers) {
			sum=sum+number;
		}
		return sum;
	}
}


