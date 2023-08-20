fun main() {
  
  println("Informe os anos: ")
  var ano = readLine().toString().toInt()
  
  println("Informe os meses: ")
  var meses = readLine().toString().toInt()
  
  println("Informe os dias: ")
  var dias = readLine().toString().toInt()
  
  var totalDias = (ano*365) + (meses*30) + dias

   println("Total em dias: $totalDias")
}
