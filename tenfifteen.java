import java.util.*; //import
public class tenfifteen {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //create new array list
		list.add(5);//add to array list
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        
        System.out.println(filterRange(list, 2, 4));//call method with array list integer parementer and min max parameter
	}
	public static ArrayList<Integer> filterRange(ArrayList<Integer> a, int min, int max) {// our method with array parameter and min max parameter
		int i;//declare int
		for (i = 0; i < a.size(); i++) { // loops for the how long the arraylist is
			int n = a.get(i); //retrieving and storing specific value from a specific index
			if (n >= min && max >= n) {//the number is or is in between the chossen min or max
				a.remove(i); // then it is removed
				i--;//the program continues
			}
		}
	return a; // we return our modified list
	}
}
