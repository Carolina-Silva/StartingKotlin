fun main(args: Array<String>) {
    // Cria uma coleção mutável do tipo Int
    val vetor = mutableListOf<Int>()

    // Insere os elementos de 1 a 10 no vetor
    for (i in 1..10) {
        vetor.add(i)
    }

    // Mostra o vetor
    println(vetor)
}