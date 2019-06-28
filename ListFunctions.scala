object ListFunctions{


def findLast(list : List[Int]) : Int ={
	list match {
		case h::Nil 	=> h
		case _::tail 	=> findLast(tail)
		case Nil		=> 0
	}
}

def findPenultimate(list : List[Int]) : Int ={
	list match {
		case h::i::Nil 	=> h
		case _::tail 	=> findPenultimate(tail)
		case Nil 		=> 0
	}

}

def findKthValue(list: List[Int], k: Int) : Int ={
	(list, k) match {
		case (_,0)	  		=> list.head
		case (h::tail, k) 	=> findKthValue(list.tail, k-1)
		case (Nil, _)	  	=> 0		
	}

}

def numberOfElements(list : List[Int]) : Int ={
	list.length
}

def numberOfElementsRecursion(list : List[Int], length : Int) : Int ={

	list match{
		case h::tail => numberOfElementsRecursion(tail,length+1)
		case Nil  	 => length
	}
}

def reverseList(list: List[Int]) : List[Int] ={

	list.reverse 
}

def reverseListRecursion(list : List[Int], reversedList : List[Int]) : List[Int]	={
	list match{
		case h::tail => reverseListRecursion(tail,h :: reversedList)
		case Nil 	 =>	reversedList
	}
}

