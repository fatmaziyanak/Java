package q095;
import java.util.*;
public class Q95 {
public static void main(String[] args) {
		
		List<Product> st = new ArrayList<>() ;
		st.add(new Product(10, "IceCream")); //st deil 1st. hata verince st cevirdim.
		st.add(new Product(11, "Chocolate"));
		Product p1 = new Product(10, "IceCream");
	//	st.add(p1);
	//	System.out.println(st);
		System.out.println(st.indexOf(p1));
	//	System.out.println(st.contains(p1));
			//indexof indexin memorysine bakiyor new new similar to ==
		}
}
class Product{
	int id;
	String name;
	
	public  Product(int id, String name) { 
		this.id = id;
		this.name = name;
			}
	public String toString() {
		return this.id + " "+ this.name;
	}
}
class Shop {
	
	
	}

/*
 *What is the result?
		A. true
		B. false
		C. -1
		D. 0
		Answer: C 
 */
