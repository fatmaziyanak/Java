package q104;



public class Q104 {
	 public static void main (String[] args) {
	        Base b1 = new DerivedB();
	        Base b2 = new DerivedA();
	        Base b3 = new DerivedB();
	   //     b1.test();
	       
	        Base b4 = b3; //new DerivedB();
	        b1 = (Base) b2; //new DerivedA();
	    //   Base b5=(DerivedA)b1;
	    //   b5.test();
	        b1.test();
	        b4.test();
	    }

}
	
	//Base.java:
	class Base{
	    public void test(){
	        System.out.println("Base ");
	    }
	}

	// DerivedA.java:
	class DerivedA extends Base {
	    public void test1() {
	        System.out.println("DerivedA ");
	    }
	}
	//DerivedB.java:
	class DerivedB extends DerivedA {
	    public void test () {
	        System.out.println("DerivedB ");
	    }
	   
	}
	/*
	 *What is the result?
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime. 

Answer: 
	 */
	
	
	////Answer: DerivedADerivedB
	
	

