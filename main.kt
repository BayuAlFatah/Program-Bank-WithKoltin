package LatihanKotlin.`Bank-Kotlin`

import java.util.Scanner

fun main(){
    var a : Boolean = true
    var inputUser = Scanner(System.`in`)
    println("Masukkan UserName anda : ")
    var nama = inputUser.next()
    println("Masukkan No Pin anda : ")
    var number = inputUser.nextLong()
    if (number.toInt() != 21441900){
        println("No Pin salah Silahkan Masukkan No Pin yang benar")
        main()
    }
    var bank = BankKotlin(nama,number,0)
    var bank1 = BankKotlin("eko",22334455,0)

    while (a){
        println("\n")
        println("||----Selamat datang di Bank kami----||")
        println("||---Silahkan Pilih menu Transaksi---||")
        println("|| 1. Untuk Setor Tunai \t\t\t ||")
        println("|| 2. Untuk Transaksi Lainnya \t\t ||")
        println("|| 3. Untuk Keluar/Cancel \t\t ||")
        println("||-----------------------------------||")
        println("Ketikkan angka untuk Menu Transaksi : ")
        var input = inputUser.nextInt()
        if (input == 1){
            println("masukkan Jumlah Setor tunai")
            var setor = inputUser.nextInt()
            bank.setor(setor)
        }else if (input == 2){

        }else{
            println("Angka tidak Ditemukan")
            println("Silahkan masukkan Username lagi")
        }
    }


    // untuk menampilkan nama,number,dan saldo
    bank.getInfo()
    //method untuk mengisi ulang saldo dimasukkan ke parameter
    bank.setor(100_000)
    // Method untuk mengecek saldo
    bank.checkSaldo()
    //method untuk Tarik
    bank.tarik(10_000)
    //method untuk bayar
    bank.bayar(5000)
    // method untuk Trasnfer
    bank.transfer(bank1,20_000)

    // cek ke bank1 apakah sudah ditransfer
    bank1.getInfo()
}
//fun yesorno(message : String) : Boolean{
//    var inputUser = Scanner(System.`in`)
//    println("$message 1/2")
//    var hasil = inputUser.next()
//
//    while (!hasil.equals(1) && !hasil.equals(2) && !hasil.equals(3)){
//        println("Pilihan Anda bukan 1/2/3")
//        println("silahkan masukkan $message (1/2/3)")
//        hasil = inputUser.next()
//    }
//    return hasil.equals()
//}
fun eksekusi(){

}

