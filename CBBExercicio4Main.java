
public class CBBExercicio4Main {

	public static void main(String[] args) {
		CBBExercicio4 ana = new CBBExercicio4();
		CBBExercicio4 beto = new CBBExercicio4();
		CBBExercicio4 carlos = new CBBExercicio4();
	
		ana.setNome("Ana Machado");
		beto.setNome("Roberto da Silva");
		carlos.setNome("Carlos Alberto");
	
		System.out.println(ana.getNome());
		System.out.println("Contador: " + CBBExercicio4.getQuantidadeAlunos());
	}

}
