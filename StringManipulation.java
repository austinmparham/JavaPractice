public class StringManipulation{
	public String trimAndConcat(String string1, String string2){
		String trimString1 = string1.trim();
		String trimString2 = string2.trim();
		String new_string = trimString1.concat(trimString2);
		return new_string;
	}
	public Integer getIndexOrNull(char char1, String string1){
		int index = string1.indexOf(char1);
		return index;
	}

	public Integer getIndexOrNull(String string1, String substring){
		int index = string1.indexOf(substring);
		return index;
	}

	public String concatSubstring(String string1, int beg, int end, String string2){
		String substring = string1.substring(beg,end);
		String concat = substring.concat(string2);
		return concat;
	}
}