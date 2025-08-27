import java.time.LocalDateTime
import scala.concurrent.{ExecutionContext, Future}

// sample method mocking data retrieval from DB
private def fetchDataFromDB(implicit executionContext: ExecutionContext): Future[Int] = Future {
  printWithThreadName("Fetching data from DB")
  Thread.sleep(500)
  1
}

// simualte bussiness logic
private def applyBusinessLogic(n: Int)(implicit executionContext: ExecutionContext): Future[Int] = Future {
  printWithThreadName("Applying business logic")
  Thread.sleep(500)
  n * 2
}

// sample method for printing information with a thread name.
private def printWithThreadName(message: String): Unit = {
  val threadName = Thread.currentThread.getName
  println(s"${LocalDateTime.now} - [$threadName] - $message")
}