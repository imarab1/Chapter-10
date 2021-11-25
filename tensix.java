import  java.util.*;//import
public class tensix {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();//create new array list
		list.add(4);//add to array list
        list.add(2);
        list.add(8);
        list.add(3);
        System.out.println(minToFront(list));//call method with array list integer parementer 
	}
	public static ArrayList<Integer> minToFront(ArrayList<Integer> a) {// method with array list integer parementer 
		int x = 0;// this is our min index
		int i; // declare int
		for (i = 1; i < a.size(); i++) {// continues until i reaches the end of the arraylist
			if (a.get(x) > a.get(i)) { // if the value at the min index is greater than the value of the value of the index
				x = i; // then we have our min val
			}
		}
    
		int v; // declare int
		v = a.remove(x); // remove the value from the list
		a.add(0, v); // add it back in, in the first position
    
		return a; // we return our modified list
	}
}
