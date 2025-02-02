```groovy
def myMethod(List<String> list) {
  if (list == null) {
    println "The list is null"
    return
  }
  list.eachWithIndex { String item, int index ->
    if (item == null) {
      println "Item at index $index is null"
    }
  }
}

myMethod(null)
myMethod(['a', null, 'b']) 
```