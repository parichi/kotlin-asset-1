import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val wld1 = Fraction(1, 2)
    val wld2 = Fraction(5, 10)
    println(wld1.add(wld2))

}

class Point(private val x: Double, private val y:Double) {

    override fun toString(): String {
        return "x=$x, y=$y"
    }

    private val minusX = -x
    private val minusY = -y

    fun symmetric(): String {
        return "x=$minusX, y=$minusY"
    }

    override fun equals(other: Any?): Boolean {
        return this.toString() == other.toString()
    }

    fun length(obj: Point): Double {
        val k: Double = this.x - obj.x
        val parichi: Double = this.y - obj.y
        return sqrt(k.pow(2.0) + parichi.pow(2.0))
    }
}
class Fraction(private var numerator: Int, private var denominator: Int){
    fun cut():String{
        var mricxveli:Int = numerator
        var mnishvneli:Int = denominator
        for (i in 2 .. mricxveli){
            while (mricxveli%i==0 && mnishvneli%i==0){
                mricxveli /= i
                mnishvneli /= i
            }
        }
        return "$mricxveli / $mnishvneli"
    }

    fun mult(vnj:Fraction):String{
        val a : Int = numerator*vnj.numerator
        val b : Int = denominator*vnj.denominator
        return  "$a / $b"
    }

    fun add(frc:Fraction):String{
        var a1:Int = numerator
        var b1:Int = denominator
        var a2:Int = frc.numerator
        var b2:Int = frc.denominator
        val tmp:Int = denominator
        if (denominator!=frc.denominator){
            a1*=b2
            b1*=b2
            a2*=tmp
            b2*=tmp
        }
        var viniciusi :Int = a1+a2
        var karimi = Fraction(viniciusi, b2)
        return karimi.cut()
    }
}