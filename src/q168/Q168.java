package q168;

public class Q168 {

	public static void main(String[] args) {
		String names []= {"Thomas","Peter","Joseph"};
		String pwd[] =new String [3];
		int idx=0;
		try {
			for (String n:names) {
				pwd[idx]=n.substring(2,6);
				idx++;
				
			}
		//omas, null, null
		}
		catch (Exception e) {
			System.out.println("Invalid name");
			System.out.println(" ");
				
		}
				
		for (String p:pwd) 	{
			System.out.println(p);
					
		}

	}
}


