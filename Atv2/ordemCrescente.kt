fun main() {
  print("Digite o primeiro numero: ")
  var n1 = readLine().toString().toInt()
  print("Digite o segundo numero: ")
  var n2 = readLine().toString().toInt()
  print("Digite o terceiro numero: ")
  var n3 = readLine().toString().toInt()

  if (n1 > n2) {
    val aux = n1
    n1 = n2
    n2 = aux
  }
  if (n2 > n3) {
    val aux = n2
    n2 = n3
    n3 = aux
  }
  if (n1 > n2) {
    val aux = n1
    n1 = n2
    n2 = aux
  }

  println("Os numeros em ordem crescente sao: $n1 $n2 $n3")
   
}
