package q011;

public class Q011 {
	public static void main(String[] args) {
		String[] strs = {"A", "B"};
		int idx = 0;
	      for (String s : strs) {
			//for( idx=0 ; idx<strs.length; idx++) {
			strs[idx].concat(" element " + idx);
			
		//	System.out.print(strs[idx]);
			// idx is incremented in the loop but nothing is affected outside of the loop	
			// there is no syso nothing is printed from this loop
		}
		System.out.println("");

		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
//What is the result?
//A.	A
//		B
//B.	A element 0
//		B element 1
//C.	A NullPointerException is thrown at runtime.
//D.	A 0
//		B 1
