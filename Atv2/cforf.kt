fun main() {
println("Temperatura de Celsius para Fahrenheit:")
  
  for (celsius in 10..100 step 10) {
    
    val fahrenheit = (celsius * 9 / 5) + 32
    println("Celsius: $celsius | Fahrenheit: $fahrenheit")
  }
}