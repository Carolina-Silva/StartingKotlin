fun main() {
  println("Vamos Calcular a area do circulo ")
  println("Informe o raio do circulo:")
  
  var raio = readLine().toString().toDouble()
  
  var n = 3.14159;

  var area =  n * (raio*raio);


  print("A area do circulo é: $area")
}