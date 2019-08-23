public class FizzBuzz{
	public String checker(int number){
		String word = "";
		if(number % 3 == 0){
			word = "Fizz";
		}
		else if(number % 5 == 0){
			word = "Buzz";
		}
		return word;
	}
}