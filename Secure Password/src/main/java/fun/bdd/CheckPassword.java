package fun.bdd;

public class CheckPassword {

	public static boolean isSecure(String password) {
		if (password.length() >= 8) { 
			// Password must have characters and numbers
			if (hasNumber(password)) {
				return true;
			}
			else
				return false;
		}
		else
			return false;
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
