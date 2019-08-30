import java.util.ArrayList;
import java.util.Arrays;


public class BasicJavaMethods{

	public void Count(){
		int num = 1;
		while(num < 256){
			System.out.println(num);
			num++;
		}
	}

	public void OddCount(){
		int num = 1;
		while(num < 256){
			if(num % 2 != 0){
				System.out.println(num);
			}
			num++;
		}
	}

	public void SumCount(){
		int sum = 0;
		for(int i = 0; i < 256; i++){
			sum += i;
		}
		System.out.println(sum);
	}

	public void ArrayLoop(){
		int[] myArray = {1,3,5,7,9,13};
		for(int num: myArray){
			System.out.println(num);
		}
	}

	public void FindMax(int[] array){
		int max = 0;
		for(int num: array){
			if(max < num){
				max = num;
			}
		}
		System.out.println(max);
	}

	public void GetAverage(ArrayList<Integer> array){
		int sum = 0;
		for(Integer num: array){
			sum += num;
		}
		int average = sum/array.size();
		System.out.println(average);
	}

	public void OddArray(){
		ArrayList<Integer> array = new ArrayList<Integer>();
		int num = 1;
		while(num < 256){
			if(num % 2 != 0){
				array.add(num);
			}
			num++;
		}
		System.out.println(array);
	}

	public void GreaterThan(ArrayList<Integer> array,Integer compareNum){
		int counter = 0;
		for(Integer num: array){
			if(compareNum < num){
				counter++;
			}
		}
		System.out.println(counter);
	}

	public void SquaredVal(ArrayList<Integer> array){
		for(Integer num: array){
			array.set(num, num*num);
			System.out.println(num);
		}
		System.out.println(array);
	}

	public void ZeroNegative(ArrayList<Integer> array){
		for(int i = 0; i < array.size(); i++){
			Integer num = array.get(i);
			if(num < 0){
				array.set(i, 0);
			}
		}
		System.out.println(array);
	}

	public void MaxMinAvg(int[] array){
		int max = array[0];
		int min = array[0];
		int total = array[0];
		for(int i = 1; i < array.length; i++){
			if(max < array[i]){
				max = array[i];
			}
			if(min > array[i]){
				min = array[i];
			}
			total += array[i];
			System.out.println(total);
		}
		double average = total/array.length;
		System.out.println(max);
		System.out.println(min);
		System.out.println(average);

	}

	public void ShiftValue(int[] array){
		int count = 1;
		while(count < array.length){
			array[count-1] = array[count];
			count++;
		}
		array[array.length-1] = 0;
		System.out.println(Arrays.toString(array));
	}
}