// Faça um programa na Linguagem Kotlin que leia tenha 3 opções:     1 - Fatorial    2 - Quadradro de um número    3 - Volume de uma lata    4 – Sair do ProgramaUtilize os conceitos de funções em Kotlin

fun fatorial():Unit {
     print("Digite o numero que deseja calcular o fatorial:")
  var n = readLine().toString().toInt()
  
  var x = n;
  
  while (x > 1){
    n = n *(x-1);
    x--; 
  }

  println("O fatorial do número digitado é: $n")
}

fun quadrado():Unit {
  println("Informe o numero:")
  var n = readLine().toString().toInt()
  var quadrado = n*n
  println("O número $n ao quadrado fica: $quadrado")
}

fun volume():Unit {
  println("Informe o raio da lata (em cm): ")
  var raio = readLine().toString().toDouble()
  
  println("Informe a altura da lata (em cm): ")
  var altura = readLine().toString().toDouble()

  var volume =  3.14159 * (raio*raio) * altura;
  print("Volume de uma lata com raio de $raio e altura de $altura é: $volume")
}

fun sair():Unit {
    println("Fim programa.")
}

fun main() {
  println("1 - Fatorial \n2 - Quadradro de um número\n3 - Volume de uma lata\n4 – Sair do Programa")
  
  print("Informe o código da operação a ser realizada:")
  var cd = readLine().toString().toInt()
  
   when(cd) {
        1 -> fatorial()
        2 -> quadrado()
        3 -> volume()
        4 -> sair()
        else -> "Invalid"      
    }
    
}