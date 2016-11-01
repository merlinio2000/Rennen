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
		ParseFile resultlist= new ParseFile("txt/messresultate.txt");
		startlist.parse();
		resultlist.parse();
		Participant[] participants = startlist.getParticipants();
		Result[]	  results	   = resultlist.getResults();
		for (Result r: results)
		{
			System.out.println(r.getStartNr() + " : " + r.getFinished().toString());
		}
	}

}
