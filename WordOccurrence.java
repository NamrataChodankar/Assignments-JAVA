/*3. Create a variable of type String with following data,
String data="Java is Object oriented. Java is platform independent.Java is simple."
Search for word "Java" and count number of occurrences.*/
public class WordOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Java is Object oriented. Java is platform independent. Java is simple.";
		String word = "Java";
		String a[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if(word.equals(a[i]))
			count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("The word " + word + " occurred " + count + " times");
		}
	}


