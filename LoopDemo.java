import java.util.ArrayList;

public class LoopDemo{
	public static void main(String[] args){
		int i = 0;
		while(i < 7){
		    System.out.println("foo");
		    i++;
		}

		for (int j = 0; j < 7; j++){
	    System.out.println("bar");
		}

		ArrayList<String> dynamicArray = new ArrayList<String>();
		dynamicArray.add("hello");
		dynamicArray.add("world");
		dynamicArray.add("etc");
		for (int k = 0; k < dynamicArray.size(); k++){
		    System.out.println(dynamicArray.get(k));
		}

		for(String name : dynamicArray){
		    System.out.println("hello " + name);
		    // other operations using name
		}




	}
}

