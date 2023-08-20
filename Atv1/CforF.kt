fun main() {
  println("Informe a temperatura em Celsius:")

  var celsius = readLine().toString().toDouble()

  var fahrenheit =  (9* celsius +160)/5

  print("$celsius graus celsius em fahrenheit são: $fahrenheit")
}