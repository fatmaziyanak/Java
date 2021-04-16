package q075;

public class Q_75 {


void readCard(int cardNo) throws Exception{ 
    System.out.println("Reading Card");	//exception hem run time da hemde complie time a bakiyor
}

void checkCard(int cardNo) throws RuntimeException {  // line n1
    System.out.println("Checking Card");
}

public static void main(String[] args)// throws Exception{ //throws Exception {//yukarida yazildigi icin burayada atmak gerek Exception i
    Q_75 ex = new Q_75();
    int cardNo = 12344;
    ex.readCard(cardNo);   // line n2
    ex.checkCard(cardNo);  // line n3
}
}

/*
compilation fails at line n2
*/
