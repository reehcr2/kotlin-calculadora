const val SOMA = 1
const val SUB = 2
const val DIV = 3
const val MULT = 4

fun main () {
  var n1: Float
  var n2: Float
  var result: Float
  n1 = 1.23f
  n2 = 32.3f
  var operacao: Int = (1..4).random()

  when (operacao){
    1 -> {
      result = n1 + n2
      println("$n1 + $n2 = $result")
    }
    2 -> {
      result = n1 - n2
      println("$n1 - $n2 = $result")
    }
    3 -> {
      result = n1 / n2
      println("$n1 / $n2 = $result")
    }
    4 -> {
      result = n1 * n2
      println("$n1 x $n2 = $result")
    }
    else -> println ("Erro !")
  }
}