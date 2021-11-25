import  java.util.*;//import
public class tenfour {
	
	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<String>();//create new array list
		list.add("hi");//add to array list
        list.add("how");
        list.add("are");
        list.add("you");
        System.out.println(doubleList(list));//call method with array list string parementer

	}
	public static ArrayList<String> doubleList(ArrayList<String> a) {//method with array list string parementer
		int i; // declare int
		for (i = 0; i < a.size(); i += 2){ // i becomes 2 because it is i=i+2, so then when we add our index and number it
			a.add(i, a.get(i)); //adds the repeat or double string
		}
		return a;// we return our modified list
    
	}
}


