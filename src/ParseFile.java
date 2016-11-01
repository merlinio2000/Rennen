import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Helper class to parse the file with the values
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class ParseFile {
		private String fileName = "";
		//The array to store the values in
		private ArrayList<Participant> participants = new ArrayList<Participant>(300);
		private ArrayList<Result>	   results		= new ArrayList<Result>(300);
		/**
		 * Constructor for the class
		 * @param filename		the name of the file to parse
		 */
		public ParseFile(String _fileName)
		{
			this.fileName = _fileName;
		}
		
		/**
		 * Parse the file and store the values
		 */
		public void parse()
		{
			if (fileName == "txt/startliste.txt")
			{
				//Use Java 8 Streams and lambdas for easy looping and try-with clause to ensure the file handle is being closed
				try (Stream<String> stream = Files.lines(Paths.get(fileName))) 
				{
					stream.forEach((String s) -> participants.add(new Participant(s.split("\\t"))));
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			if (fileName == "txt/messresultate")
			{
				//Use Java 8 Streams and lambdas for easy looping and try-with clause to ensure the file handle is being closed
				try (Stream<String> stream = Files.lines(Paths.get(fileName))) 
				{
					stream.forEach((String s) -> results.add(new Result(s.split("\\t"))));
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}		
		}
		/**
		 * get the participants
		 * @return		the participants as an array or null if the array is empty
		 */
		public Participant[] getParticipants()
		{
			//Test whether the array is empty
			if(!(participants.isEmpty()))
				return participants.toArray(new Participant[0]);
			return null;
		}
		
		/**
		 * get the results
		 * @return		the Results as an array or null if the array is empty
		 */
		public Result[] getResults()
		{
			//Test whether the array is empty
			if(!(results.isEmpty()))
				return results.toArray(new Result[0]);
			return null;
		}
}
