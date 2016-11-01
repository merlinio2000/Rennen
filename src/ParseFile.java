import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Helper class to parse the file with the values
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class ParseFile {
		private String fileName = "";
		//The array to store the values in
		private Participant[] participants = new Participant[300];
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
			//Use Java 8 Streams and lambdas for easy looping and try-with clause to ensure the file handle is being closed
			try (Stream<String> stream = Files.lines(Paths.get(fileName))) 
			{
		        stream.forEach(System.out::println);
			} catch (IOException e) 
			{
				 e.printStackTrace();
			}
		}
		/**
		 * get the participants
		 * @return		the participants as an array or null if the array is empty
		 */
		public Participant[] getParticipants()
		{
			//Test whether the array is empty
			if(participants[0] != null)
				return participants;
			return null;
		}
}
