import groovy.transform.*

//def expected = 20
//assert expected == 2 + 3 * 7

/*
def val = null

if(val){
	println true
}
else{
	println false
}*/

@ToString(includeNames=true)
class Address{
	String city
}

@ToString(includeNames=true)
class Person{
	Address address
}

def p1 = new Person(address: new Address(city:'Blr'))
def p2 = new Person()
def p3 = null
println p3?.address?.city

def number = 0
def result = number ?: -1
println result














