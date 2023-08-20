fun main() {
  
  println("Informe o valor de A:")
  var a = readLine().toString().toInt()
  
  println("Informe o valor de B:")
  var b = readLine().toString().toInt()
  
  println("Antes da troca A = $a e B =  $b")
  
   var x = a;
   a = b;
   b = x;

   println("Depois da troca A = $a e B =  $b")
}
