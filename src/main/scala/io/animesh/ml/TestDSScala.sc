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

books.max
books.maxBy(book => book.pages)

