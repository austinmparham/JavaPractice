import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzlingMethods{
	public void SumGreaterThan(ArrayList<Integer> array){
		int sum = array.get(0);
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for(int i = 1; i < array.size(); i++){
			sum += array.get(i);
			if(array.get(i) > 10){
					array2.add(array.get(i));
			}
		}
		System.out.println(sum);
		System.out.println(array2);
	}

	public void NameShuffle(ArrayList<String> nameArray){
		ArrayList<String> array2 = new ArrayList<String>();
		Collections.shuffle(nameArray);
		for(int i = 0; i < nameArray.size(); i++){
			System.out.println(nameArray.get(i));
			if(nameArray.get(i).length() > 5){
				array2.add(nameArray.get(i));
			}
		}
		System.out.println(array2);
	}

	public void AlphaShuffle(ArrayList<String> alphaArray){
		Collections.shuffle(alphaArray);
		ArrayList<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		System.out.print(alphaArray.get(0));
		System.out.print(alphaArray.get(alphaArray.size()-1));
		System.out.println(alphaArray);
		for(int i = 0; i < vowels.size(); i++){
			if(alphaArray.get(alphaArray.size()-1) == vowels.get(i)){
				System.out.println("The last letter is a vowel!");
			}
		}
	}

	public void RandomNum(int min) {
		ArrayList<Integer> random_array = new ArrayList<Integer>();
		Random dice = new Random();
		while (random_array.size() < 10) {
			int num = dice.nextInt(100);
			if (num >= min) {
				random_array.add(num);
			}
		}
		Collections.sort(random_array);
		System.out.println(random_array);
	}


}