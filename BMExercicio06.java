public class BMExercicio06 {
    String nomeDoCorrentista;
    float saldo;
    boolean contaEEspecial;

    void abreContaSimples(String nome, float saldoInicial) {
        if (saldoInicial < 100f) {
            System.out.println("O valor mínimo de abertura de conta é R$100,00");
        }
        else {
            nomeDoCorrentista = nome;
            saldo = 5.0f;
            contaEEspecial = false; 
        }
        
    }
    void deposita(float valor) {
        saldo = saldo + valor;
    }
    boolean retira(float valor) {
        if (contaEEspecial == true) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                return true;
            }
            else {
                System.out.println("Essa operação deixará a conta no negativo!");
                return false;
            }
        }
        else {
            saldo = saldo - valor;
            return true;
        }
    }
    void mostraDados() {
        System.out.print("O nome do correntiste é ");
        System.out.print(nomeDoCorrentista);
        System.out.print("O saldo é ");
        System.out.print(saldo);
        if (contaEEspecial) {
            System.out.print("A conta é especial.");
            if (saldo < 0f) {
                System.out.println("Saldo negativo!");
            }
        }
        else {
            System.out.print("A conta é comum.");
        }
    }

    public static void main(String[] args) {
        String nome = "João";
        float saldoInicial = 99.0f;
        BMExercicio06 conta = new BMExercicio06();
        conta.abreContaSimples(nome, saldoInicial);
        conta.contaEEspecial = true;
        conta.retira(10.0f);
        conta.mostraDados();

    }
}
