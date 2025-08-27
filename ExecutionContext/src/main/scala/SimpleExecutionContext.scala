import java.time.LocalDateTime
import java.util.concurrent.Executors
import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}

object SimpleExecutionContext {
  private val executorService = Executors.newFixedThreadPool(1)
  private val ec = ExecutionContext.fromExecutor(executorService)

  def main(args: Array[String]): Unit = {
    printWithThreadName("Application has been started.")
    val f = executeComputeIntensiveTask()
    Await.result(f, 1.seconds)
  }

  private def executeComputeIntensiveTask(): Future[Unit] = {
    Future {
      printWithThreadName("Task has been executed.")
    }(ec)
  }

  private def printWithThreadName(message: String): Unit = {
    val threadName = Thread.currentThread.getName
    println(s"${LocalDateTime.now} - [$threadName] - $message")
  }
}
