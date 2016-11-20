package com.example.app

import org.scalatra._

class Articles extends ScalatraServlet {
  get("/:id") { // <= this is a route matcher
    // this is an action
    // this action would show the article which has the specified :id
    val id:String = params.getOrElse("id", "1")
    Ok("Get method with parameter " + id)
  }

  post("/") {
    // submit/create an article
    "Post method"
  }

  put("/:id") {
    // update the article which has the specified :id
    "Put method"
  }

  delete("/:id") {
    // delete the article with the specified :id
    "Delete method"
  }
}