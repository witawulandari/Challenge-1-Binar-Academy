import kotlin.random.Random

class Controller:IController {
    override val suit: MutableList<String>
        get() = mutableListOf<String>("Gunting", "Kertas", "Batu")

    override fun cekPemenang(pemain1: String, pemain2: String) {
        var hasil =
            if (pemain1 == suit[0] && pemain2 == suit[1] ||
                pemain1 == suit[2] && pemain2 == suit[0] ||
                pemain1 == suit[1] && pemain2 == suit[2]
            ) {
                "Pemain 1 MENANG"

            } else if (
                pemain1 == suit[0] && pemain2 == suit[2] ||
                pemain1 == suit[2] && pemain2 == suit[1] ||
                pemain1 == suit[1] && pemain2 == suit[0]
            ) {
                "Pemain 2 MENANG"

            } else {
                "DRAW"
            }
        println(hasil)
    }

    override fun cekPemenangVsKomputer(pemain1: String) {
        var komputer = suit.random()
        var hasil =
            if (pemain1 == suit[0] && komputer == suit[1] ||
                pemain1 == suit[2] && komputer == suit[0] ||
                pemain1 == suit[1] && komputer == suit[2]
            ) {
                "Pemain 1 MENANG"

            } else if (
                pemain1 == suit[0] && komputer == suit[2] ||
                pemain1 == suit[2] && komputer == suit[1] ||
                pemain1 == suit[1] && komputer == suit[0]
            ) {
                "Komputer MENANG"

            } else {
                "DRAW"
            }
        println(hasil)
    }
}