
case class Collatz(number: Int, steps: List[Int])


def run(n: Int): List[Int] = {
  require(n > 0)

  def iterate(n: Int, List: List[Int]): List[Int] =
if(n == 1) n :: 1
else if (n % 2 ==0) iterate(n/2, n :: 1)
else iterate(n * 3 + 1, n :: 1)

  iterate(n, List.empty).reverse
}
//collatz(List(20))

def from(x: Int): Stream[Int] = x #:: from(x + 1)

val X = 20

val collatz = from(1).map(n => Collatz(n, run(n)))

collatz.take(X).toList.foreach(println)