```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    if (item == null) {
      println "Item at index $index is null"
    }
  }
}

myMethod(null) 
```