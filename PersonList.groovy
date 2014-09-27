
def file = new File('./names.txt')
def names = []
file.eachLine{text, line ->
	names << text
}
println names.collect{
	it.toLowerCase()
}.join(", ")
