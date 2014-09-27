
def map = [India: 'Delhi', Srilanka: 'Colombo']

println map
println map.getClass().getName()

println map['India']
println map.'India'

map.each{
	println "${it.key} -> ${it.value}"
}

map.each{key, value ->
	println "${key} -> ${value}"
}

