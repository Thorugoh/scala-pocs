case class Point(x: Double, y: Double)

extension (sc: StringContext)
    def p(args: Double*): Point = {
        // reuse the `s`-interpolator and then split on ','
        val pts = sc.s(args*).split(",", 2).map { _.toDoubleOption.getOrElse(0.0) }
        Point(pts(0), pts(1))
    }

@main
def main(): Unit =
    val x=12.0
    val pt = p"1,-2"
    println(pt) // Point(1.0,-2.0)
    println(p"${x/5}, $x")
