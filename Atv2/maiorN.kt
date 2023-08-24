fun main() {
  print("Digite o primeiro numero: ")
  var n1 = readLine().toString().toInt()
  print("Digite o segundo numero: ")
  var n2 = readLine().toString().toInt()
  print("Digite o terceiro numero: ")
  var n3 = readLine().toString().toInt()
  
  var maior = n1
  if (n2 > maior) {
    maior = n2
  }
  if (n3 > maior) {
    maior = n3
  }

  println("O maior número é: $maior")
}