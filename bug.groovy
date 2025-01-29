```groovy
def methodWithClosure(closure) {
  println "Inside methodWithClosure"
  closure()
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong!")
}

println "After closure execution"
```