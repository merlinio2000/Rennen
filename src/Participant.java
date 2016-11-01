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
	 * constructs an instance and parse the strings into the correct datatype
	 * @param s		the values as an string array
	 */
	public Participant(String[] s)
	{
		this.startNr	= Integer.parseInt(s[0]);
		this.category	= Integer.parseInt(s[1]);
		this.name		= s[2];
		this.nameNr 	= s[3];
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
	 * get the name / number
	 * @return  the name / number
	 */
	public String	getNameNr()		{return nameNr;  }
}
