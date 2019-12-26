import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Puzzling{
	public static void main(String[] args){
		PuzzlingMethods first_method = new PuzzlingMethods();

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(5);
		array.add(1);
		array.add(2);
		array.add(7);
		array.add(9);
		array.add(8);
		array.add(13);
		array.add(25);
		array.add(32);

		// first_method.SumGreaterThan(array);

		ArrayList<String> nameArray = new ArrayList<String>();
		nameArray.add("Nancy");
		nameArray.add("Jinichi");
		nameArray.add("Fujibayashi");
		nameArray.add("Momochi");
		nameArray.add("Ishikawa");

		// first_method.NameShuffle(nameArray);

		ArrayList<String> alphaArray = new ArrayList<String>();
		alphaArray.add("a");
		alphaArray.add("b");
		alphaArray.add("c");
		alphaArray.add("d");
		alphaArray.add("e");
		alphaArray.add("f");
		alphaArray.add("g");
		alphaArray.add("h");
		alphaArray.add("i");
		alphaArray.add("j");
		alphaArray.add("k");
		alphaArray.add("l");
		alphaArray.add("m");alphaArray.add("n");alphaArray.add("o");alphaArray.add("p");alphaArray.add("q");alphaArray.add("r");alphaArray.add("s");
		alphaArray.add("t");alphaArray.add("u");alphaArray.add("v");alphaArray.add("w");alphaArray.add("x");alphaArray.add("y");alphaArray.add("z");

//		first_method.AlphaShuffle(alphaArray);

		ArrayList<Integer> number_array = new ArrayList<Integer>();
		for(int i = 55; i < 101;i++){
			number_array.add(i);
		}
		System.out.println(number_array);

		first_method.RandomNum(55);

	}
}