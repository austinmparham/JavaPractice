public class StringManipulationTest{
	public static void main(String[] args){
		StringManipulation manipulator = new StringManipulation();
		String str = manipulator.trimAndConcat("   Hello    ","   THEWORLDU  ");
		System.out.println(str);

		Integer index = manipulator.getIndexOrNull('o',"Hello");
		System.out.println(index);

		Integer index2 = manipulator.getIndexOrNull("Hello","ello");
		System.out.println(index2);

		Integer index3 = manipulator.getIndexOrNull("Hello", "Hi");
		System.out.println(index3);

		Integer index4 = manipulator.getIndexOrNull('i',"Hello");
		System.out.println(index3);

		String str2 = manipulator.concatSubstring("Hello",1,2,"world");
		System.out.println(str2);
	


	}
}