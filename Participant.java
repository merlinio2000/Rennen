class Participant
{
	private int startNr	  =  0;
	private int category	  =  0;
	private String name	  = "";
	private String nameNr 	  = "";
  
	public Participant(String[] s)
	{
		this.startNr	= Integer.parseInt(s[0]);
		this.category	= Integer.parseInt(s[1]);
		this.name		= s[2];
		this.nameNr = s[3];
	}
	
	public int		getStartNr()	{return startNr; }
	public int		getCategory()	{return category;}
	public int		getName()		{return name;	 }
	public String	getNameNr()		{return nameNr;  }
	
}
