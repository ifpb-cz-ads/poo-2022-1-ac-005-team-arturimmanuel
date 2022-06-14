public class BMExercicio05 {
    String nome;
    String esporte;
    int numJogadores;
    int numJogos;
    int numVitorias;
    int numEmpates;

    void vencerJogo() {
        numJogos++;
        numVitorias++;
        System.out.println(numJogos + " jogos jogados e " + numVitorias + " ganhos.");
    }

    void perderJogo() {
        numJogos++;
        System.out.println(numJogos + " jogos jogados e " + (numJogos - numVitorias - numEmpates) + " perdidos.");
    }

    void empatarJogo() {
        numJogos++;
        System.out.println(numJogos + " jogos jogados e " + (numJogos - numVitorias - numEmpates) + " perdidos.");
    }

    void contratarJogador() {
        numJogadores++;
    }

    void demitirJogador() {
        numJogadores--;
    }

    void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Esporte: " + esporte);
        System.out.println("Número de jogadores: " + numJogadores);
        System.out.println("Número de jogos: " + numJogos);
        System.out.println("Número de vitórias: " + numVitorias);
        System.out.println("Número de empates: " + numEmpates);
        System.out.println("Número de derrotas: " + (numJogos - numVitorias - numEmpates));
    }
}