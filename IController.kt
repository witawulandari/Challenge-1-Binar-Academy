interface IController {
    val suit: MutableList<String>
    fun cekPemenang(pemain1: String, pemain2: String)
    fun cekPemenangVsKomputer(pemain1: String)
}