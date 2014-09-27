def file = new File('./topics.todo')
println file.text

file.eachLine { text, line ->
	println "$line -> $text"
}