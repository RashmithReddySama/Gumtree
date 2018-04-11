package pages

import org.openqa.selenium.WebDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

import scala.util.Try

class BasePage extends FeatureSpec with GivenWhenThen with WebBrowser with Matchers{

  implicit val driver: WebDriver = Driver.createDriver()

  sys addShutdownHook {
    Try(driver.quit())
  }
}
