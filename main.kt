package LatihanKotlin.`Bank-Kotlin`

fun main(){
    var bank = BankKotlin("bayu",21441900,0)
    var bank1 = BankKotlin("eko",22334455,0)
    // untuk menampilkan nama,number,dan saldo
    bank.getInfo()
    //method untuk mengisi ulang saldo dimasukkan ke parameter
    bank.isiUlang(10000)
    // Method untuk mengecek saldo
    bank.checkSaldo()
    //method untuk bayar
    bank.bayar(5000)
    // method untuk Trasnfer
    bank.transfer(bank1,2000)

    // cek ke bank1 apakah sudah ditransfer
    bank1.getInfo()
}