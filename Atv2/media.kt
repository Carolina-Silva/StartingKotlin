fun main() {
  println("Entre com as notas:")
  
  println("N1:")
  var n1 = readLine().toString().toInt()
  
  println("N2:")
  var n2 = readLine().toString().toInt()
  
  println("N3:")
  var n3 = readLine().toString().toInt()
  
   println("N4:")
  var n4 = readLine().toString().toInt()
  
  var media= (n1+n2+n3+n4)/4
  
  if(media >= 7){
  println("Média = $media. Aluno aprovado")
      
  }else{
   println("Média = $media. Aluno reprovado")
  }
  
}