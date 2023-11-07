package Project2;

public class Vote {
	private int opinion;
	private Candidates candidateNum;
	private int id;
	private static int count=0;
	
	Vote(int opinion,Candidates candidateNum, int id){
		this.opinion=opinion;
		this.candidateNum=candidateNum;
		this.id=id;
		count++;
	}
	
	public int getOpinion() {
		return opinion;
	}
	public Candidates getCandidate() {
		return candidateNum;
	}
	public int getId() {
		return id;
	}
	public boolean equals(Object otherVote){
	       Vote theOtherVote = (Vote) otherVote;
	       if(theOtherVote.getId() == id) {
	    	   return true;
	       }else {
	    	   return false;
	       }
	}
	
	public boolean getRecall(int opinion) {
		if(opinion==1) {
			return true;
		}else{
			return false;
		}
	}
	public static int getCount() {
		return count;
	}
}
