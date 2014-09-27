
def name = 'Raj'
String.metaClass.sayHello = { println "Hello $delegate"}

def name2 = 'Mark'

name.sayHello()
name2.sayHello()

