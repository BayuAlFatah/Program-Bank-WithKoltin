package LatihanKotlin.`Bank-Kotlin`

import java.util.Scanner

fun main(){
    // field untuk while
    var a : Boolean = true
    // field untuk Scanner
    var inputUser = Scanner(System.`in`)
    //field untuk memasukkan Username
    println("Masukkan UserName anda : ")
    var nama = inputUser.next()
    //field untuk memasukkan No Pin
    println("Masukkan No Pin anda : ")
    var number = inputUser.nextLong()
    // No Pin harus 21441900 Agar masuk Ke Program
    if (number.toInt() != 21441900){
        println("No Pin salah Silahkan Masukkan No Pin yang benar")
        main()
    }
    // Instansiasi untuk memanggil class BankKotlin dengan Construktor
    var bank = BankKotlin(nama,number)
    var bank1 = BankKotlin("eko",22334455)

    // ini adalah while
        while (a){
            // untuk menampilkan menu Transaksi
            println("\n")
            println("||----Selamat datang di Bank Bayu----||")
            println("||---Silahkan Pilih menu Transaksi---||")
            println("|| 1. Untuk Setor Tunai \t\t\t ||")
            println("|| 1. Untuk Transaksi Lainnya \t\t ||")
            println("|| 3. Untuk Keluar/Cancel \t\t\t  ||")
            println("||-----------------------------------||")
            println("Ketikkan angka untuk Menu Transaksi : ")
            // untuk memasukkan input angka untuk memilih menu Transaksi
            var input = inputUser.nextInt()
            //percabangan pertama untuk memilih user input
            if (input == 1){
                println("masukkan Nominal anda : ")
                var setor = inputUser.nextInt()
                bank.setor(setor)
                println("Apakah Anda Ingin menampilkan Saldo anda (Y/N)")
                var saldo = inputUser.next()
                if (saldo == "y"){
                    bank.checkSaldo()
                }
                //percabangan ke dua untuk pilihan UserInput
                // untuk memasukkan input angka untuk memilih menu Transaksi
            }else if (input == 2){
                //untuk menampilkan Pilihan Transaki
                println("Silahkan Pilih Transaksi")
                println("1. Untuk Info Akun anda")
                println("2. untuk Setor ")
                println("3. Untuk CheckSaldo")
                println("4. untuk Bayar ")
                println("5. Untuk Transfer")
                println("Silahkan Pilih angka : ")
                //untuk memilih menu transaksi
                var hasil = inputUser.nextInt()
                if (hasil == 1){
                    bank.getInfo()
                }else if (hasil == 2){
                    println("masukkan Nominal anda : ")
                    var setor = inputUser.nextInt()
                    bank.setor(setor)
                }else if (hasil == 3){
                    bank.checkSaldo()
                }else if (hasil == 4){
                    println("masukkan Nominal anda : ")
                    var setor = inputUser.nextInt()
                    bank.bayar(setor)
                }else if (hasil == 5){
                    println("masukkan Nominal anda : ")
                    var setor = inputUser.nextInt()
                    bank.transfer(bank1,setor)
                }
            }else if (input == 3){
                println("Terima-Kasih")
                //jika memilih angka 3 maka akan break atau berhenti dari program
                break
            }else{
                //untuk menampilkan jika pilihan tidak sesuai dengan angka pilihan
                println("Angka tidak Ditemukan")
                println("Silahkan masukkan Username lagi")
            }
        }
    }

