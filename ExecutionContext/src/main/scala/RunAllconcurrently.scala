import com.google.common.util.concurrent.ThreadFactoryBuilder

import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext

@main
def runAllConcurrently(): Unit = {
  val executorService = Executors.newFixedThreadPool(2,
    new ThreadFactoryBuilder().setNameFormat(s"app-thread-pool-%d").build())
  implicit val executionContext: ExecutionContext = ExecutionContext
    .fromExecutor(executorService)

  val op1 = fetchDataFromDB.flatMap(applyBusinessLogic)
  val op2 = fetchDataFromDB.flatMap(applyBusinessLogic)
}
