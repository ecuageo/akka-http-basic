import akka.http.scaladsl.model.StatusCodes
import org.scalatest.{ Matchers, FlatSpec }
import akka.http.scaladsl.testkit.ScalatestRouteTest

class BasicTest extends FlatSpec with Matchers with ScalatestRouteTest with Service {
  "Get /basic" should "return a basic message" in {
    Get("/basic") ~> route ~> check {
      status should be(StatusCodes.OK)
      responseAs[String] should include("Basic impl of akka-http<")
    }
  }

  "Get /bar" should "return bar in json format" in {
    Get("/bar") ~> route ~> check {
      val barJson = """{"baz":"stuff","bop":8,"bang":true}"""
      responseAs[String] should be(barJson)
    }
  }
}
