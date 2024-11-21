package TP6;
import java.util.Scanner;
public class Authentification {
	private final  String loginCorrect="scott";
	private final String pwdCorrect="tiger";
	

	public  String getUserLogin() throws LengthException, LoginException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("donner user login: ");
		String userLogin=scanner.nextLine();
		if(userLogin.length()>10) {
			throw new LengthException("ERREUR: longeur du login dépasse 10");
		}
		if (!userLogin.equals(loginCorrect)) {
			throw new LoginException("ERREUR: login invalid");
		}
		return userLogin;
		}
	public String getUserPwd() throws LengthException, pwdException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("donner Password login: ");
		String pwdLogin=scanner.nextLine();
		if(pwdLogin.length()>10) {
			throw new LengthException("ERREUR: longeur du login dépasse 10");
		}
		if (!pwdLogin.equals(pwdCorrect)) {
			throw new pwdException("ERREUR: password invalid");
		}
		return pwdLogin;
	}
	public Authentification() throws LengthException, LoginException,pwdException {
		getUserLogin();
		getUserPwd();
	}
	

}
