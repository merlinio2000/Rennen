/**
 * Helper class to store the values from the file in an array
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
class Participant
{
	private int startNr	  =  0;
	private int category  =  0;
	private String name	  = "";
	private String nameNr = "";
  
	/**
	 * constructs an instance and parses the strings into the correct data type
	 * @param s		the values as an string array
	 */
	public Participant(String[] s)
	{
		this.startNr	= Integer.parseInt(s[0].trim());
		this.category	= Integer.parseInt(s[1].trim());
		this.name		= s[2];
		if (s.length == 4 && s[3] != null)
			this.nameNr = s[3];
	}
	/**
	 * get the start number
	 * @return  the start number
	 */
	public int		getStartNr()	{return startNr; }
	/**
	 * get the category
	 * @return  the category
	 */
	public int		getCategory()	{return category;}
	/**
	 * get the name
	 * @return  the name
	 */
	public String	getName()		{return name;	 }
	/**
	 * get the number
	 * @return  the number
	 */
	public String	getNameNr()		{return  nameNr;  }
}
