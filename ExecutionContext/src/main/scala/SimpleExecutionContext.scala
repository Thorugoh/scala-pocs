import java.time.LocalDateTime
import java.util.concurrent.{Executors, ThreadFactory}
import scala.concurrent.duration.*
import scala.concurrent.{Await, ExecutionContext, Future}

object SimpleExecutionContext {
  private val executorService = Executors.newFixedThreadPool(2)
  implicit private val ec: ExecutionContext = ExecutionContext.fromExecutor(executorService)

  def main(args: Array[String]): Unit = {
    printWithThreadName("Application has been started.")
    val f1 = executeComputeIntensiveTaskA()
    val f2 = executeComputeIntensiveTaskB()

    val result  = for {
      _ <- f1
      _ <- f2
    } yield()

    Await.result(result, 5.seconds)
    executorService.shutdown()
  }

  private def executeComputeIntensiveTaskA(): Future[Unit] = {
    Future {
      printWithThreadName("Task-A has been started.")
      Thread.sleep(3000)
    }
  }

  private def executeComputeIntensiveTaskB(): Future[Unit] = {
    Future {
      printWithThreadName("Task-B has been executed.")
      Thread.sleep(1000)
    }
  }

  private def printWithThreadName(message: String): Unit = {
    val threadName = Thread.currentThread.getName
    println(s"${LocalDateTime.now} - [$threadName] - $message")
  }
}
