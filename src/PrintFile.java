import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Helper class to print the results into a file
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class PrintFile 
{
	private String fileName = "";
	
	/**
	 * constructs and sets the fileName
	 * @param _fileName  the name of the file
	 */
	public PrintFile(String _fileName)
	{
		this.fileName = _fileName;
	}
	
	public void put(List<ParticipantResult> p)
	{
		Path path = Paths.get(fileName);
		 
		try (BufferedWriter writer = Files.newBufferedWriter(path)) 
		{
		    if (fileName.equals("txt/namen.txt"))
		    {
		    	for (int i = 0; i < p.size(); ++i)
		    	{
		    		String cat = "";
		    		switch (p.get(i).getCategory())
		    		{
		    		case 1:
		    			cat = "Frauen";
		    			break;
		    		case 2:
		    			cat = "M\u00E4nner";
		    			break;
		    		case 3:
		    			cat = "Profis";
		    			break;
		    		}
			    	writer.write(p.get(i).getStartNr() + "\t" + p.get(i).getName() + "\t" + p.get(i).getNameNr() + "\t" + cat + "\t" + p.get(i).getRank() + "\t" + p.get(i).getTimeTook() + "\n");
		    	}
		    }
		    else
		    {
		    	for (int i = 0; i < p.size(); ++i)
		    		writer.write(i+1+"\t"+ p.get(i).getStartNr() + "\t"+ p.get(i).getTimeTook() + "\t"+ p.get(i).getName() + "\t"+ p.get(i).getNameNr() + "\n");
		    }
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
