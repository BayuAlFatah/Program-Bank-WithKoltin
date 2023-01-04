package LatihanKotlin.`Bank-Kotlin`

class BankKotlin(Name : String,Number : Long,Money : Int) {
    var nama : String = Name
    var number : Long = Number
    private var money : Int = Money


    fun getInfo(){
        println("Your Name = $nama")
        println("your Number = $number")
        println("Your Money = $money")
    }
    fun isiUlang(saldo : Int){
        println("Isi Ulang Sejumlah $saldo")
        money += saldo
    }
    fun checkSaldo(){
        println("Your Money = $money")
    }
    fun bayar(money : Int){
        println("Pembayaran sejumlah : $money")
        this.money -= money
    }
    fun transfer(Tujuan : BankKotlin,money : Int){
        println("Transfer sejumlah : $money")
        this.money -= money
        Tujuan.money += money
    }


}