import com.google.common.util.concurrent.ThreadFactoryBuilder

import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext

@main
def dedicatedContext(): Unit = {
  val dbExecutorService = Executors.newFixedThreadPool(2, new ThreadFactoryBuilder().
    setNameFormat(s"db-thread-pool-%d").build())
  val dbExecutionContext = ExecutionContext
    .fromExecutor(dbExecutorService)

  val executorService = Executors.newFixedThreadPool(2, new ThreadFactoryBuilder().
    setNameFormat(s"app-thread-pool-%d").build())
  implicit val executionContext: ExecutionContext = ExecutionContext
    .fromExecutor(executorService)

  // Explicitly specifying execution context for communication with DB.
  val op1 = fetchDataFromDB(using dbExecutionContext).flatMap { data =>
    applyBusinessLogic(data)
  }
  val op2 = fetchDataFromDB(dbExecutionContext).flatMap(applyBusinessLogic)


}
