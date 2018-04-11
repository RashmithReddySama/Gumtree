package features

import pages.BasePage

class Gumtree extends BasePage {

  info("As a User")
  info("I want to see when i search for cars in london on google")
  info("to see the list of cars displayed")
  info("So the i know how many of them in the list are by Gumtree")


  feature("Cars in london search on google") {

    scenario("Search for cars in london on google and see how many of gumtree links are available") {

      Given("i am on the google.com")
          val baseUrl = "https:www.google.co.uk"
          go to (baseUrl)
          pageTitle shouldBe "Google"

      When("i enter cars in london")
          textField("lst-ib") value = "Cars in london"
          click on (name("btnK"))

      Then("i should see the list of search results")

      And("i should see how many of them are from features.Gumtree")
    }
  }


}
