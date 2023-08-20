fun main() {
  println("Vamos calcular o valor de sua prestacao em atraso:")
  
  println("Digite o valor da prestacao:")
  var valor = readLine().toString().toDouble()
  
  println("Digite a taxa: (%) ")
  var taxa = readLine().toString().toDouble()
  
  println("A quantos dias de atraso? ")
  var tempo = readLine().toString().toInt()

  var prestacao =  valor + (valor * (taxa/100)* tempo)

  print("O valor da prestação agora e: R$ $prestacao")
}
