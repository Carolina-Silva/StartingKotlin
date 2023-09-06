fun main(args: Array<String>) {
    // Cria um vetor A do tipo inteiro de 5 elementos
    val vetorA = Array(5) { 0 }

    // Solicita os valores para o usuário e insere no vetor A
    for (i in vetorA.indices) {
        println("Informe o valor do elemento ${i + 1} do vetor A: ")
        vetorA[i] = readLine()!!.toInt()
    }

    // Cria um vetor B do tipo inteiro
    val vetorB = Array(vetorA.size) { 0 }

    // Lê o vetor A e para cada elemento lido calcula o fatorial e grava no B
    for (i in vetorA.indices) {
        vetorB[i] = fatorial(vetorA[i])
    }

    // Mostra os dois vetores
    println("Vetor A: $vetorA")
    println("Vetor B: $vetorB")
}

// Função que calcula o fatorial de um número inteiro
fun fatorial(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * fatorial(n - 1)
    }
}