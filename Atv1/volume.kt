fun main() {
  println("Informe o raio da lata (em cm): ")
  
  var raio = readLine().toString().toDouble()
  
  println("Informe a altura da lata (em cm): ")
  
   var altura = readLine().toString().toDouble()

  var volume =  3.14159 * (raio*raio) * altura;


  print("Volume de uma lata com raio de $raio e altura de $altura é: $volume")
}