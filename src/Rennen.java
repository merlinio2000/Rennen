/**
 * Main class with the program logic
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class Rennen 
{	
	public static void main(String[] args) 
	{
		ParseFile startlist = new ParseFile("txt/startliste.txt");
		startlist.parse();
		Participant[] participants = startlist.getParticipants();
		for (Participant p: participants)
			System.out.println(p.getStartNr() + p.getName() + p.getCategory() + p.getNumber());
	}

}
