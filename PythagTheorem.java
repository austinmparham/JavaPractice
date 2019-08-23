public class PythagTheorem{
	public double findC(int sideA, int sideB){
		int sqSideA = sideA * sideA;
		int sQSideB = sideB * sideB;
		int total = sQSideB + sqSideA;
		double squareRoot = Math.sqrt(total);
		return squareRoot;

	}
}