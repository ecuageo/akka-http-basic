import akka.http.scaladsl.model.StatusCodes
import org.scalatest.{ Matchers, WordSpec }
import akka.http.scaladsl.testkit.ScalatestRouteTest

class BasicTest extends WordSpec with Matchers with ScalatestRouteTest with Service {
  "BasicTest" when {
    "Get /basic" should {
      "return a basic message" in {
        Get("/basic") ~> route ~> check {
          status should be(StatusCodes.OK)
          responseAs[String] should include("Basic impl of akka-http<")
        }
      }
    }
  }
}
