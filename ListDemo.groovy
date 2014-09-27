
def numbers = [4, 3 ,1 ,2]
println numbers.class

//numbers.each{ println it}
def doubleIt = { it * 2}
println numbers.collect(doubleIt)
println numbers.join(", ")
println numbers.sort()

numbers << 5
println numbers

println numbers[0]

def groups = numbers.groupBy({it %2 ==0})
println groups




