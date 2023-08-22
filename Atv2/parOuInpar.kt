fun main() {
  println("Entre com o número:")
  
  print("N:")
  var n = readLine().toString().toInt()
  
  if(n % 2 == 0){
  println("Número: $n é par")
      
  }else{
   println("Número: $n é inpar")
  }
  
}