public class Yoda {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String myString = null;
		
		if ("something".equals(myString)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		//NullPointer Exception
		if (myString.equals("something")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
