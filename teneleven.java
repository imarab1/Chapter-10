import  java.util.*;//import
public class teneleven {
	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<String>();//create new array list
		list.add("hi");//add to array list
        list.add("how");
        list.add("are");
        list.add("you");
        System.out.println(stutter(list, 3));//call method with array list string parementer and integer parameter
	}
	public static ArrayList<String> stutter(ArrayList<String> a, int k) {//method with array list string parementer and integer parameter
		int i;//declare int
		int n;//declare int
		if (k <= 0) { //if k equal zero then it removes it so the array list is empty
			while(a.size() > 0) {
				a.remove(0);
			}
		} else {
			for (i = 0; i < a.size(); i += k) {// If the arraylist exists then i becomes takes k because it is i=i+k
				for (n = 1; n < k; n++) {// it adds how many iterations we need, we start at one we end at k
					a.add(i, a.get(i)); // then it is added
				}
			}
		
		}
	return a; // we return our modified list
	}
}
