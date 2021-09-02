fun main() {
    var pilihan: Int
    var angka1: Float
    var angka2: Float

    println("Pilih Operasi")
    println("1. Penjumlahan")
    println("2. Perkalian")
    println("3. Pengurangan")
    println("4. Pembagian")

    print("Pilih Operasi : ")
    pilihan = readLine()!!.toInt()
    if (pilihan == 1) {
        print(" Masukkan Angka 1 : ")
        angka1 = readLine()!!.toFloat()
        print(" Masukkan Angka 2 : ")
        angka2 = readLine()!!.toFloat()
        print("Hasil Penjumlahan Adalah : " + angka1.plus(angka2))
    } else if (pilihan == 2) {
        print(" Masukkan Angka 1 : ")
        angka1 = readLine()!!.toFloat()
        print(" Masukkan Angka 2 : ")
        angka2 = readLine()!!.toFloat()
        print("Hasil Perkalian Adalah : " + angka1.times(angka2))
    } else if (pilihan == 3) {
        print("Masukkan Angka 1 : ")
        angka1 = readLine()!!.toFloat()
        print("Masukkan Angka 2 : ")
        angka2 = readLine()!!.toFloat()
        print("Hasil Pengurangan Adalah : " + angka1.minus(angka2))
    } else if (pilihan == 4) {
        print("Masukkan Angka 1 : ")
        angka1 = readLine()!!.toFloat()
        print("Masukkan Angka 2 : ")
        angka2 = readLine()!!.toFloat()
        print("Hasil Pembagian Adalah : " + angka1.div(angka2))
    } else {
        print("Pilih Operasi yang Tersedia")
    }
}