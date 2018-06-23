public class Exercicio1{
	public static void main(String[] args){
		double sinal = 1.0;
		double piSobreQuatro = 0;
		for(int i = 1; i < 10000000; i = i + 2){
			piSobreQuatro = piSobreQuatro + (sinal/i);
			sinal = sinal*(-1);
		}	
		System.out.println("PI = " + 4*piSobreQuatro);
	}
}
