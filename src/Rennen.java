import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * main class with the program logic
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class Rennen 
{	
	public static void main(String[] args) 
	{
		ParseFile startlist = new ParseFile("txt/startliste.txt");
		ParseFile resultlist= new ParseFile("txt/messresultate.txt");
		ArrayList<ParticipantResult> pr= new ArrayList<ParticipantResult>(300);
		startlist.parse();
		resultlist.parse();
		ArrayList<Participant> participants = startlist.getParticipants();
		ArrayList<Result>	   results	   = resultlist.getResults();
		for (Participant p: participants)
		{
			for (Result r: results)
			{
				if (p.getStartNr() == r.getStartNr())
					pr.add(new ParticipantResult(p, r));
			}
		}
		// create 3 lists with the different categories
		List<ParticipantResult> women = pr.stream().filter(p -> p.getCategory() == 1).collect(Collectors.toList());
		List<ParticipantResult> men = pr.stream().filter(p -> p.getCategory() == 2).collect(Collectors.toList());
		List<ParticipantResult> prof = pr.stream().filter(p -> p.getCategory() == 3).collect(Collectors.toList());
		
		//sort the list by the time difference ascending
		women.sort((p1, p2) -> Long.compare(p1.getDifference(), p2.getDifference()));
		men.sort((p1, p2) -> Long.compare(p1.getDifference(), p2.getDifference()));
		prof.sort((p1, p2) -> Long.compare(p1.getDifference(), p2.getDifference()));
		
		//sort the participants by time difference ascending and set the rank of the participants
		pr.sort((p1, p2) -> Long.compare(p1.getDifference(), p2.getDifference()));
		for (int i = 0; i < pr.size(); ++i)
			pr.get(i).setRank(i+1);
		
		//sort the list for namen.txt by name ascending
		pr.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		//Write the lists to files
		PrintFile frauen = new PrintFile("txt/frauen.txt");
		PrintFile maenner= new PrintFile("txt/maenner.txt");
		PrintFile profi  = new PrintFile("txt/profi.txt");
		PrintFile namen  = new PrintFile("txt/namen.txt");
		frauen.put(women);
		maenner.put(men);
		profi.put(prof);
		namen.put(pr);
	}

}
