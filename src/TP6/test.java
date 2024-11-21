package TP6;

public class test {

	public static void main(String[] args) {
		try {
			
			double x=Double.parseDouble(args[0]);
			double n=Double.parseDouble(args[1]);
			if (n==0) {
				throw new ArithmeticException(" impossible de faire une division par zéro ");
			}
			if (x<0) {
				throw new IllegalArgumentException("x ne peut pas etre negative");
			}
			Mathematique a=new Mathematique(x, n);
			System.out.println(a.f(x, n));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne"
					+e.getMessage());
		}catch(NumberFormatException z) {
			System.out.println(" Les arguments doivent être des nombres"+z.getMessage());
		}catch(ArithmeticException a) {
			System.out.println(" impossible de faire une division par zéro !"+a.getMessage() );
		}catch(IllegalArgumentException b) {
			System.out.println(" on ne peut pas calculer une racine pour un réel négatif !!!!!!"+b.getMessage());
		}
	}
}