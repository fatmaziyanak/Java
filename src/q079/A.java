package q079;


public class A {
    public A() {
        System.out.println("C ");
    }
    public static void main(String[] args) {
        C c = new C(); //constructor run edilirken  parent to child class gider
    }
}


    class B extends A {
        public B(){     //line n1
            System.out.println("B ");
        }
    }


    class C extends B {
        public C(){      // line n2
            System.out.println("A ");
        }
       
    }
    /*
    What is the result? 
    A. C B A
    B. C
    C. A B C
    D. Compilation fails at line n1 and line n2
    Answer: C

     */

