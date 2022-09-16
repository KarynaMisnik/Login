import java.util.HashMap;

public class Security {

	HashMap<String, String> details = new HashMap<String, String>();
	
	//constructor

	Security(){
		details.put("Karyna", "123");
	}
	
	protected HashMap getDetails(){
		return details;
	}
}
