package util;

public class Conversor {
	
	public static final double iof = 1.06;
	public static double preco;
	public static double qteDolar;
	
	public static double conversor() {
		return qteDolar * preco * iof;
		
	}

}
