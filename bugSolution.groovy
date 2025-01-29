```groovy
def methodWithClosure(closure) {
  println "Inside methodWithClosure"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught: ${e.message}"
  }
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong!")
}

println "After closure execution"
```