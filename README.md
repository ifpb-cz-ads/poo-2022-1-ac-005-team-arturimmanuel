## Questão 2

Modelo timeEsporte// Representa um time de um esporte qualquer
Inicio do modelo 
    dado nome //indica o nome do time
    dado esporte // indica o esporte que o time joga 
    dado numJogadores // indica o numero de jogadores que o time possui
    dado numJogos // indica o numero de jogos que o time participou
    dado numVitorias // indica o numero de vitorias que o time obteve
    dado numEmpates // indica o numero de empates que o time obteve

operação vencerJogo()
inicio
    numJogos = numJogos + 1
    numVitorias = numVitorias + 1
fim

operacao perderJogo()
inicio
    numJogos = numJogos + 1
fim

operacao empatarJogo()
inicio
    numJogos = numJogos + 1
    numEmpates = numVitorias + 1
fim

operacao contratarJogador()
inicio
    numJogadores = numJogadores + 1
fim

operacao demitirJogador()
inicio
    numJogadores = numJogadores - 1
fim

operacao imprimirDados()
inicio
    imprimir nome
    imprimir esporte
    imprimir numJogadores 
    imprimir numJogos 
    imprimir numVitorias 
    imprimir numEmpates
fim

Fim do modelo

## Questão 7
O erro está na declaração da classe, mais especificamente no nome. E necessário que nomes de classes não tenham espaço.

## Questão 8
O erro está no retorno do método maior(), que deveria ser do tipo inteiro, mas retorna um boolean, e no método maior, que é void mas mesmo assim possui um retorno.

## Questão 9
O método main foi declarado de forma errônea, invés da sintaxe correta, que é public static void main(String[] args). Além disso, o método, que é void, está retornando um boolean