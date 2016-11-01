import java.io.File;

/**
 * Helper class to parse the file with the values
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class ParseFile {
		private String filename = "";
		//The array to store the values in
		private Participant[] participants = new Participant[300];
		/**
		 * Constructor for the class
		 * @param filename		the name of the file to parse
		 */
		public ParseFile(String filename)
		{
			this.filename = filename;
		}
		
		/**
		 * Parse the file and store the values
		 */
		public void Parse()
		{
			
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
