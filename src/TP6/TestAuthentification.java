package TP6;

public class TestAuthentification {

	public static void main(String[] args) {
		try {
			Authentification a=new Authentification();
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		}catch(LoginException l) {
			System.out.println(l.getMessage());
		}catch(pwdException p) {
			System.out.println(p.getMessage());
		}
	}
}
