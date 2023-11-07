package Project2;

public enum Candidates {
	POND(3,"Pond"),
	PARK(4,"Park"),
	PLAYGROUND(5,"Playground"),
	MALL(6,"Mall"),
	MUSEUM(7,"Museum"),
	NONE(0,"None");
	
	int num;
	String name;
	
	Candidates(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	public static Candidates getNumForCandidate(int num) {
		switch(num){
	        case 3: return Candidates.POND;
	        case 4: return Candidates.PARK;
	        case 5: return Candidates.PLAYGROUND;
	        case 6: return Candidates.MALL;
	        case 7: return Candidates.MUSEUM;
	        default: return Candidates.NONE;
     }
	}
	
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
}
