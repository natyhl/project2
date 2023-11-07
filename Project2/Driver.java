package Project2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*sources: https://www.monroenews.com/story/news/education/2023/06/10/former-reading-school-to-be-demolished/70299802007/ */

public class Driver {

	public static void main(String[] args)throws FileNotFoundException{
		File myFile = new File("nums (1).txt");
		Scanner scan = new Scanner(myFile);
		System.out.println("Hello, user");
		System.out.println("Welcome to our program.");
		System.out.println("There has been a recent conflict about whether the 112-year-old Reading Building in Flat Rock should be demolished.");
		System.out.println("In this programe, you can vote if the old school building in your neighbourhood should stay or be demolished.");
		System.out.println();
		VoteProcesser processer = new VoteProcesser();
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] split = line.split(", ");
			int opinion = Integer.valueOf(split[0]);
			Candidates candidateNum = Candidates.getNumForCandidate(Integer.valueOf(split[1]));
			int id = Integer.valueOf(split[2]);
			Vote v = new Vote(opinion, candidateNum, id);
			processer.addVote(v);
			
			}
			System.out.println();
			System.out.println("Thank you for your participation. We recieved a total of "+Vote.getCount()+" votes.");
			System.out.println("Here are the results of the election: ");
			System.out.println("Will the building stay?");
			if(processer.isBuildingStaying()) {
				System.out.println("Yes.");
			}else {
				System.out.println("No.");
			}
			System.out.println();
			System.out.println("Total of people "+processer.getPondVotes()+" voted for Pond.");
			System.out.println("Total of people "+processer.getParkVotes()+" voted for Park.");
			System.out.println("Total of people "+processer.getPlayVotes()+" voted for Playground.");
			System.out.println("Total of people "+processer.getMallVotes()+" voted for Mall.");
			System.out.println("Total of people "+processer.getMuseumVotes()+" voted for Museum.");
			System.out.println();
			int maxVotes = processer.getPondVotes();
			Candidates c=Candidates.POND;
			if(maxVotes<processer.getParkVotes()) {
				maxVotes=processer.getParkVotes();
				c = Candidates.PARK;
			}
			if(maxVotes<processer.getPlayVotes()){
				maxVotes=processer.getPlayVotes();
				c = Candidates.PLAYGROUND;
			}
			if(maxVotes<processer.getMallVotes()){
				maxVotes=processer.getMallVotes();
				c = Candidates.MALL;
			}
			if(maxVotes<processer.getMuseumVotes()){
				maxVotes=processer.getMuseumVotes();
				c = Candidates.MUSEUM;
			}
			System.out.println("Which candidate got the most votes?");
			System.out.println(c.getName()+" (with "+maxVotes+" votes.)");
		scan.close();
		}
	}

