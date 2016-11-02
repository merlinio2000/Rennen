import java.time.LocalTime;

/**
 * helper class to store the results in an array
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class Result 
{
	private int 	  startNr  = 0;
	private LocalTime finished = null;
	
	/**
	 * constructs an instance and parses the strings into the correct datatype
	 * @param s		the values as a string array
	 */
	public Result(String[] s)
	{
		this.startNr = Integer.parseInt(s[0].trim());
		this.finished = LocalTime.parse(s[1]);
	}
	
	/**
	 * get the start number
	 * @return  the start number
	 */
	public int		getStartNr()	{return startNr; }
	/**
	 * get the finish time
	 * @return  the finish time
	 */
	public LocalTime getFinished()	{return finished;}
}
