import java.util.ArrayList;

public class BasicJava{
	public static void main(String[] args){
		BasicJavaMethods first_method = new BasicJavaMethods();
		// first_method.Count();
		// first_method.OddCount();
		// first_method.SumCount();
		// first_method.ArrayLoop();
		// int[] maxArray = {1,3,2};
		// first_method.FindMax(maxArray);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// first_method.GetAverage(list);
		// first_method.OddArray();
		// first_method.GreaterThan(list, 2);
		// first_method.SquaredVal(list);
		ArrayList<Integer> negArray = new ArrayList<Integer>();
		negArray.add(1);
		negArray.add(2);
		negArray.add(5);
		negArray.add(-5);
		// first_method.ZeroNegative(negArray);

		int[] intArray = {1,2,3};
		first_method.MaxMinAvg(intArray);
		first_method.ShiftValue(intArray);


	}
}