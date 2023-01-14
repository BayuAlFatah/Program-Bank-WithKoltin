package LatihanKotlin.`Bank-Kotlin`

class BankKotlin(Name : String,Number : Long) : Exception() {
    var nama : String = Name
    var number : Long = Number
     private var money : Int = 0
    fun getInfo(){
        println("Your Name = $nama")
        println("your Number = $number")
        println("Your Money = $money")
    }
    fun setor(saldo : Int){
        println("Isi Ulang Sejumlah $saldo")
        money += saldo
    }
    fun tarik(saldo : Int){
        if (money == 0 || saldo == null){
            println("saldo anda tidak Mencukupi")
        }else{
            println("Tarik saldo sejumlah : $saldo")
            money -= saldo
            println("Sisa saldo anda : $money")
        }
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