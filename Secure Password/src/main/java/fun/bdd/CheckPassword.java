package fun.bdd;

public class CheckPassword {

	public static boolean isSecure(String password) {
		if (password.length() >= 8) { 
			// Password must have characters and numbers
			if (hasNumber(password)) {
				if (hasLetter(password)) {
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

	private static boolean hasLetter(String password) {
		boolean hasLetter = false;
		hasLetter = password.matches("a-zA-Z");
		return hasLetter;
	}
	
	private static boolean hasNumber(String password) {
		boolean hasNumber = false;
		
		for (int i = 0; i <= 9; i++) {
			if (password.contains(String.valueOf(i))) {
				hasNumber = true;
				break;
			}
		}
		return hasNumber;
	}
}
