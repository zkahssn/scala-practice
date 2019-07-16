object Recursion{
	
	def mkStar(list: List[Int]) : String = {
		 list match{
		 	case Nil =>  "END"
		 	case h::t => (List.fill(h)("*").mkString + "\n") + mkStar(t)
		 }


	}


}