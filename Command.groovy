
def b1 = { println "Hello"}
def b2 = { println "Hi"}

def command(block){
	println "Before"
	block()
	println "After"
}

command(b2)