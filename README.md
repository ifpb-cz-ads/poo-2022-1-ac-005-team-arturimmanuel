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
