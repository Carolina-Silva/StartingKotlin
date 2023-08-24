fun main() {
  print("Digite o primeiro numero: ")
  var n1 = readLine().toString().toInt()
  print("Digite o segundo numero: ")
  var n2 = readLine().toString().toInt()
  print("Digite o terceiro numero: ")
  var n3 = readLine().toString().toInt()
  print("Digite o quarto numero: ")
  var n4 = readLine().toString().toInt()
  print("Digite o quinto numero: ")
  var n5 = readLine().toString().toInt()
  
  var maior = n1
  var menor = n1

  if (n2 > maior) {
    maior = n2
  }
  if (n3 > maior) {
    maior = n3
  }
  if (n4 > maior) {
    maior = n4
  }
  if (n5 > maior) {
    maior = n5
  }

  if (n2 < menor) {
    menor = n2
  }
  if (n3 < menor) {
    menor = n3
  }
  if (n4 < menor) {
    menor = n4
  }
  if (n5 < menor) {
    menor = n5
  }
  

  println("O maior número é: $maior")
  println("O menor número é: $menor")
}