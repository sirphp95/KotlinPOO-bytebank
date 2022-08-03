package src.main.kotlin

fun main() {
    println("bem vindo")

    val contaPedro = Conta(titular="pedro", numero = 1000)
contaPedro.deposito(valor = 200.0)


    val contaPoc = Conta(titular = "poc", numero = 1001)

    contaPoc.numero = 55
    print(" o nome do titular da conta é ${contaPoc.titular},  o saldo da conta é ${contaPoc.saldo} e o numero da conta é ${contaPoc.saldo}")
    println(" depositando na conta do pedro")
    contaPedro.deposito(valor = 50.0)
    println(contaPedro.saldo)
    println("sacando na conta do pedro")
    contaPedro.saque(100.0)
    println(contaPedro.saldo)
    println("sacando na conta do pedro")
    contaPedro.saque(100.0)
    println(contaPedro.saldo)

    println("Transferindo da conta do pedro para do poc")


}
class Conta(var titular: String, var numero: Int) {

    var saldo = 0.0
        private set

    fun deposito(valor: Double) {
        this.saldo += valor
    }

    fun saque(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        } else {
            println("saldo insuficiente")
        }

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }

}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaPedro = Conta(titular = "Pedro", numero = 1002)
    contaPedro.titular = "pedro"
    var contaPoc = Conta(titular = "Poc", numero = 1003 )
    contaPoc.titular = "poc"
    contaPedro.titular = "pedro"

    println("titular conta joao: ${contaPedro.titular}")
    println("titular conta maria: ${contaPoc.titular}")

    println(contaPedro)
    println(contaPoc)
}



//transforma a classe em variavel e modifica os valores via a variavel criada

///////////////////////////////////////////////////////////////////////////////////////

//estrutura procedural
/* fun testaLacos() {
     var i = 0
     while (i < 5) {
         val titular: String = "Alex $i"
         val numeroConta: Int = 1000 + i
         var saldo: Double = i + 10.0

         print("Olá $titular, seu saldo é $saldo e o numero da sua conta é $numeroConta")
         i++
     }
 }
}*/
//for (i in 1..5) {
//if (i == 4) {
// break
//}
//val titular: String = "Alex $i"
// val numeroConta: Int = 1000 + i
// var saldo: Double = i + 10.0

//print("Olá $titular, seu saldo é $saldo e o numero da sua conta é $numeroConta")
//testaCondicoes(saldo)

//$ para concatenar variavel e ${} para concatenar classe ou objeto      }


/*     fun testaCondicoes(saldo: Double) {
         when {
             saldo > 0.0 -> {
                 println("conta positiva")
             }

             saldo == 0.0 -> {
                 println("conta é neutra")
             }

             else -> {
                 println("conta é negativa")
             }
         }
     }
 }*/


//var é uma variavel que muda o valor e val nao
//print nao pula linha, println pula
//$nomedaVariavel faz concatenacao com string
//variavel do tipo double so pode ser alterada pra uma variavel do mesmo tipo


//alternativa ao when
//if (saldo >0.0){
//println("conta positiva")
//} else if (saldo == 0.0){
//println("conta é neutra")
//}else{
//println("conta é negativa")
//}
//ctrl shift L formata
//ctrl shift / comenta
//cria 3 contas de 2 em 2
/* pula de 2 em 2 criando 3 contas
for (i in 1..5 step 2) *//* cria 5 contas de ordem decrescente for (i in 5 downTo 1)*/
