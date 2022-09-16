


public class Main {

	public static void main(String[] args) {
		
		
		Security security = new Security();
		
		HomePage homePage = new HomePage(security.getDetails());
	}

}
