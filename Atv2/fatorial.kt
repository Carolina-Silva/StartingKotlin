fun main() {
  print("Digite o numero que deseja calcular o fatorial:")
  var n = readLine().toString().toInt()
  
  var x = n;
  
  while (x > 1){
    n = n *(x-1);
    x--; 
  }

  println("O fatorial do número digitado é: $n")
}