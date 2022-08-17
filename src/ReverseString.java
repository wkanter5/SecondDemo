
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sa = new String("Sagar Basnet");
		//String reverse = new StringBuffer(s).reverse().toString();
		//System.out.println(reverse);
		
		for(int i=sa.length()-1;i>=0;i--) 
			System.out.println(sa.charAt(i));
		
		
		
	}

}
