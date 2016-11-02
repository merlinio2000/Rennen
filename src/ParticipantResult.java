import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * helper class that merges the Participants and results
 * @author Merlin Maggi, Dogukan Kabagoez, Florian Siegrist
 * @version 1.0
 */
public class ParticipantResult 
{
	private int startNr	  =  0;
	private int category  =  0;
	private String name	  = "";
	private String nameNr = "";
	private int rStartNr  =  0;
	private LocalTime finished = null;
	private LocalTime timeTook = LocalTime.of(00, 00, 00);
	private long difference    = 0;
	private int rank	  =  0;
  
	/**
	 * constructs an instance and get the values from the arguments
	 * @param p		the participant
	 * @param r		the result
	 */
	public ParticipantResult(Participant p, Result r)
	{
		this.startNr	= p.getStartNr();
		this.category	= p.getCategory();
		this.name		= p.getName();
		if (!(p.getNameNr().equals("")))
			this.nameNr = p.getNameNr();
		this.rStartNr = r.getStartNr();
		this.finished = r.getFinished();
		switch(this.category)
		{
		case 1:
			this.difference = ChronoUnit.SECONDS.between(LocalTime.of(14, 00, 00), finished);
			this.timeTook	= this.timeTook.plusSeconds(difference);
			break;
		case 2:
			this.difference = ChronoUnit.SECONDS.between(LocalTime.of(14, 30, 00), finished);
			this.timeTook	= this.timeTook.plusSeconds(difference); 
			break;
		case 3:
			this.difference = ChronoUnit.SECONDS.between(LocalTime.of(15, 00, 00), finished);
			this.timeTook	= this.timeTook.plusSeconds(difference); 
			break;
		}
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
	
	/**
	 * get the start number
	 * @return  the results start number
	 */
	public int		getRStartNr()	{return rStartNr; }
	/**
	 * get the finish time
	 * @return  the finish time
	 */
	public LocalTime getFinished()	{return finished;}
	
	/**
	 * get the time took
	 * @return  the time took
	 */
	public LocalTime getTimeTook()	{return timeTook;}
	
	/**
	 * get the difference between start time of the category and the finish time
	 * @return  the finish time
	 */
	public long		 getDifference()	{return difference;}
	
	/**
	 * get the rank
	 * @return  the rank
	 */
	public int 		getRank()			{return rank;}
	
	/**
	 * sets the rank to the param
	 * @param _rank  the new rank
	 */
	public void		setRank(int _rank)	{this.rank = _rank;}
}
