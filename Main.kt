import java.lang.NumberFormatException

class Main() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                var mode = 0
                do {
                    println("  ")
                    println("---------------------")
                    println("1. VS Player 2")
                    println("2. VS Komputer")
                    println("0. Exit")
                    print("Masukan Mode : ")
                    var inputMode = readLine()
                    mode = inputMode?.toInt()!!

                    checkMode(mode)
                } while (mode != 0)

            } catch (e: NumberFormatException) {
                println("Input yang Anda masukkan salah")
            }
        }
            fun checkMode(mode: Int) {
                try {
                    val suit = mutableListOf("Gunting", "Kertas", "Batu")

                    when (mode) {
                        1 -> {
                            var controller = Controller()

                            println("------------------------")
                            println("Mode VS Player 2")
                            println("1. Gunting")
                            println("2. Batu")
                            println("3. Kertas")
                            print("Masukan Pilihan Player 1 : ")
                            var inputPlayer1 = readLine()

                            println("1. Gunting")
                            println("2. Batu")
                            println("3. Kertas")
                            print("Masukan Pilihan Player 2 : ")
                            var inputPlayer2 = readLine()

                            controller.cekPemenang(
                                suit[inputPlayer1?.toInt()!!.minus(1)],
                                suit[inputPlayer2?.toInt()!!.minus(1)]
                            )
                        }
                        2 -> {
                            var controller = Controller()

                            println("------------------------")
                            println("Mode VS Komputer")
                            println("1. Gunting")
                            println("2. Batu")
                            println("3. Kertas")
                            print("Masukan Pilihan Player 1 : ")
                            var inputPlayer1 = readLine()

                            controller.cekPemenangVsKomputer(suit[inputPlayer1?.toInt()!!.minus(1)])
                        }
                        0 -> {
                            println("Exit")
                        }
                    }
                } catch (e: NumberFormatException) {
                    println("Input yang Anda masukkan salah")
                }
            }
        }
    }