import groovy.transform.*


class Person{
	String firstName
	String lastName
	int age
	
	def setFirstName(String val){
		println "setter on firstName called"
		firstName = val
	}
	
	def getFirstName(){
		println "getter on firstName called"
		firstName
	}
	
}

def p = new Person(firstName: 'James', lastName: 'Gosling', age: 30)


println p.firstName

println p.dump()

