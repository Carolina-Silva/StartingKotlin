fun main() {
  print("Informe o código do lanche que você comprou:")
  var cd = readLine().toString().toInt()
  
  print("Agora por favor informe a quantidade:")
  var qt = readLine().toString().toInt()
  
  
   val preco = when(cd) {
        100 -> qt * 1.20
        101 -> qt * 1.30
        102 -> qt * 1.50
        103 -> qt * 1.20
        104 -> qt * 1.30
        105 -> qt * 1.00
        else -> "Invalid"      
    }
    
    println("Sua compra deu: R$ $preco")
}