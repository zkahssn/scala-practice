object ListFunctions{


def findLast(list : List[Int]) : Int ={
	list match {
	case h::Nil => h
	case _::tail => findLast(tail)
	}
}

}