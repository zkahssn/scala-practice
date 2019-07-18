object Recursion{
	
	def mkStar(list: List[Int]) : String = {
		mkStarTail(list, "\n")
	}

	private def mkStarTail(list: List[Int], stars: String) :String = {
		list match{
			case Nil 	=>	stars
			case h::t 	=>	mkStarTail(t, stars + List.fill(h)("*").mkString + "\n")	
		}
	}


}