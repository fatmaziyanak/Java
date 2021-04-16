package q146;

public class Question146 {

	public static void main(String[] args) {

		String[] strs=new String[2]; //{"1","2"};
 //strs[0]="1";
 //strs[1]="2";
		int idx=0;

	//we can not concat if array is null bos olan array e concat yapamiyrz

		for (String s : strs) {
		strs[idx].concat("element "+idx);
			idx++;
		}
	//	for (String s : strs) {
	//		strs[idx] = "**";
	//		strs[idx] = strs[idx].concat("element "+idx);
	//		idx++; // Haticenin gosterdigi method:)
	//	}
//
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
//			
//			//Answer: D
//			
		}}}
		/*
		 * What is the output?
		 * A. Element 0Element 1
		 * B. Null element 0Nullelement 1
		 * C. NullNull
		 * D. A null pointer exception is thrown at runtime.
		 */
		//second version
//		String[] strs = {"A", "B"};
//		int idx = 0;
//		for (String s : strs) {
//			strs[idx].concat(" element " + idx);
//			idx++;		
//			// idx is incremented in the loop but nothing is affected outside of the loop	
//			// there is no syso nothing is printed from this loop
//		}	
//		for (idx = 0; idx < strs.length; idx++) {
//			System.out.println(strs[idx].concat(" element " + idx));
//		}
//	}

//What is the result? A==>AB array dolu concat olur
//A.	A
//		B
//B.	A element 0
//		B element 1
//C.	A NullPointerException is thrown at runtime.
//D.	A 0
//		B 1

	//}



