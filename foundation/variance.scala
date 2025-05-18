trait Item { def productNumber: String }
trait Buyable extends Item { def price: Int }
trait Book extends Buyable { def isbn: String }

// an example of an invariant type
trait Pipeline[T]:
    def process(t: T): T

// an example of covariant type
trait Producer[+T]: 
    def make: T

// an example of a covariant type
trait Consume[-T]:
    def take(t: T): Unit

def oneOf(
    p1: Pipeline[Buyable],
    p2: Pipeline[Buyable],
    b: Buyable
): Buyable =
    val b1 = p1.process(b)
    val b2 = p2.process(b)
    if b1.price < b2.price then b1 else b2

