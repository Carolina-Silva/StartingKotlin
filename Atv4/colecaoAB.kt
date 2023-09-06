fun main(args: Array<String>) {
    // Cria uma coleção mutável do tipo Int
    val vetor = mutableListOf<Int>()

    // Insere os elementos de 1 a 10 no vetor
    for (i in 1..10) {
        vetor.add(i)
    }

    // Cria uma coleção mutável do tipo Int
    val vetorB = mutableListOf<Int>()

    // Multiplica cada elemento da coleção "A" por 2 e adiciona na coleção "B"
    for (i in vetor) {
        vetorB.add(i * 2)
    }

    // Mostra as duas coleções
    println("Coleção A: $vetor")
    println("Coleção B: $vetorB")
}