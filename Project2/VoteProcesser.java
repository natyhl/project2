package Project2;
import java.util.ArrayList;

public class VoteProcesser {
	private ArrayList<Vote> votes=new ArrayList<>();
	
	public ArrayList<Vote> getList(){
		return votes;
	}
	public void addVote(Vote vote) {
		if(!(votes.contains(vote))) {
			votes.add(vote);
			System.out.println("User "+vote.getId()+" voted for "+vote.getCandidate());
		}else {
			System.out.println(vote.getId()+" is a duplicate.");
		}
	}
	
	public boolean isBuildingStaying(){
	     int numYes = 0;
	     int numNo = 0;
	      for(Vote v : votes){
	            if(v.getRecall(v.getOpinion())){
	                 numYes++;
	             } else{
	                 numNo++;
	            }
	      }
	      if(numYes > numNo){
	            return false;
	      } else{
	            return true;
	      }
	}
	
	public int getPondVotes() {
		int pondCount = 0;
		for(Vote v: votes) {
			if(v.getCandidate().equals(Candidates.POND)) {
				pondCount++;
			}
		}
		return pondCount;
	}
	
	public int getParkVotes() {
		int pondCount = 0;
		for(Vote v: votes) {
			if(v.getCandidate().equals(Candidates.PARK)) {
				pondCount++;
			}
		}
		return pondCount;
	}
	
	public int getPlayVotes() {
		int pondCount = 0;
		for(Vote v: votes) {
			if(v.getCandidate().equals(Candidates.PLAYGROUND)) {
				pondCount++;
			}
		}
		return pondCount;	
	}
	
	public int getMallVotes() {
		int pondCount = 0;
		for(Vote v: votes) {
			if(v.getCandidate().equals(Candidates.MALL)) {
				pondCount++;
			}
		}
		return pondCount;
	}
	
	public int getMuseumVotes() {
		int pondCount = 0;
		for(Vote v: votes) {
			if(v.getCandidate().equals(Candidates.MUSEUM)) {
				pondCount++;
			}
		}
		return pondCount;
	}
	
	public int getNoneVotes() {
		int pondCount = 0;
		for(Vote v: votes) {
			if(v.getCandidate().equals(Candidates.NONE)) {
				pondCount++;
			}
		}
		return pondCount;
	}
}
