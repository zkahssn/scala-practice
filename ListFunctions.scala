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

def isPalindrome(list : List[Any]) : Boolean = list == list.reverse



def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }


def compress(list : List[Symbol], compressed : List[Symbol], last : Symbol) : List[Symbol] = list match{

	case Nil => compressed.reverse
	case h::tail if h != last => compress(tail, h :: compressed, h) 
	case h::tail if h == last => compress(tail, compressed, h)
			
} 

def pack(list : List[Symbol], subList : List[Symbol], overallList : List[List[Symbol]], lastEl : Symbol) : List[List[Symbol]] = list match{
	case Nil 	=> subList :: overallList
	case h::Nil	if h == lastEl => pack(Nil,h :: subList, overallList, h)
	case h::Nil 			   => pack(Nil, h::Nil, overallList, h)	
	case list 	if list.head == lastEl || (list.head != lastEl && (lastEl::subList)) => pack(list.tail,list.head :: subList, overallList, list.head)
	case list 	if list.head != lastEl => pack(list.tail,list.head :: Nil, subList :: overallList, list.head)

}



}

