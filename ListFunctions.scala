object ListFunctions{


def findLast(list : List[Int]) : Int ={
	list match {
		case h::Nil 	=> h
		case _::tail 	=> findLast(tail)
	}
}

def findPenultimate(list : List[Int]):Int ={
	list match {
		case h::i::Nil 	=> h
		case _::tail 	=> findPenultimate(tail)
		case _ 			=> 0
	}

}

}