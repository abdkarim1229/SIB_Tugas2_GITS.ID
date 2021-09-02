fun main() {
    print("Masukkan Angka = ")
    var angka = readLine()!!.toInt()
    if (angka % 2 == 0) {
        println("Nilai ini adalah Genap")
    } else {
        println("Nilai ini adalah Ganjil")
    }
}
