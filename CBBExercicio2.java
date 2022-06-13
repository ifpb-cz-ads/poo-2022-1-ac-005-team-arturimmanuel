
public class CBBExercicio2 {

	public static void main(String[] args) {
		String frase3;
		String frase4;
		frase3 = new String("Testando Igualdade!");
		frase4 = frase3;
		System.out.println("Frase 3:" +frase3);
		System.out.println("Frase 4:" +frase4);
		System.out.println("Frase 1 e Frase 2 possuem a mesma referência? R: "+(frase3 == frase4));
	}

}
