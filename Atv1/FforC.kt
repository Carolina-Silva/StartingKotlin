fun main() {
  println("Informe a temperatura em Celsius:")

  var fahrenheit = readLine().toString().toDouble()

  var celsius =  (fahrenheit - 32)*5/9

  print("$fahrenheit graus fahrenheit em celsius são: $celsius")
}