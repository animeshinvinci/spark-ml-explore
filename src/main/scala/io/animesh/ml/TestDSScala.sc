val numbers = Seq(11,2,3,99,100,67.885,45)
numbers.max
numbers.min

case class Books(title:String,pages:Int)

val books = Seq(
  Books("Future of Scala developers", 85),
  Books("Parallel algorithms", 240),
  Books("Object Oriented Programming", 130),
  Books("Mobile Development", 495)
)

books.maxBy(book => book.pages)


numbers.filter( n=> n%2 ==0 ).foreach(
  x => print(x)
)

val num1 = Seq(1, 2, 3, 4, 5, 6)
val num2 = Seq(4, 5, 6, 7, 8, 9)

//List(1, 2, 3)
num1.diff(num2)

//List(4, 5, 6)
num1.intersect(num2)

//List(1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8, 9)
num1.union(num2)