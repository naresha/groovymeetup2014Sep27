def numbers  = [4, 2, 1, 3 ]



def printIt(list, included){
	for(number in list){
		if(included(number))
			println number
	}
}

//printIt(numbers, {true})
printIt(numbers, {number -> number % 2 != 0})