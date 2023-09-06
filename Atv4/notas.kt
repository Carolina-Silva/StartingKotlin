fun calculaMedia(notas1: Array<Int>, notas2: Array<Int>): Array<Double> {
    // Cria um vetor para armazenar as médias
    val medias = Array(notas1.size) { 0.0 }

    // Calcula a média de cada aluno
    for (i in notas1.indices) {
        medias[i] = (notas1[i] + notas2[i]) / 2
    }

    return medias
}

fun main(args: Array<String>) {
    // Cria vetores para armazenar as notas da primeira e da segunda prova
    val notas1 = Array(5) { 0 }
    val notas2 = Array(5) { 0 }

    // Lê as notas da primeira e da segunda prova
    for (i in notas1.indices) {
        println("Informe a nota da primeira prova do aluno ${i + 1}: ")
        notas1[i] = readLine()!!.toInt()

        println("Informe a nota da segunda prova do aluno ${i + 1}: ")
        notas2[i] = readLine()!!.toInt()
    }

    // Calcula as médias
    val medias = calculaMedia(notas1, notas2)

    // Imprime as médias
    for (i in medias.indices) {
        println("A média do aluno ${i + 1} é ${medias[i]}.")
    }
}