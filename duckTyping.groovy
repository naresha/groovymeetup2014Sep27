
class Parent{
	def doIt(Double number){
		println number + " Double parent"
	}
}

class Child extends Parent{
	def doIt(Integer number){
		println number + " Integer Child"
	}
	
	def doIt(Double number){
		println number + " Double child"
	}
}

def p = new Parent()
def c = new Child()
p.doIt(10)
c.doIt(10)


/*
class Cat{
	def move(){
		println "Cat is moving"
	}
}

class Dog{
	def move(){
		println "Dog is moving"
	}
}

def obj = new Dog()
obj.move()
*/