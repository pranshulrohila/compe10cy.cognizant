import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.Comparable;
public class Player implements Comparable<Player>{
    private String name;
    private Date dateOfBirth;
    private String skill;
    private Integer numberOfMatches;
    private Integer runs;
    private Integer wickets;
    private String nationality;
    private Double powerRating;
    SimpleDateFormat sdfp=new SimpleDateFormat("dd-MM-yyyy");
    public Player(){}
    public Player(String name , Date dateOfBirth , String skill , Integer numberOfMatches , Integer runs , Integer wickets , String nationality , Double powerRating){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.skill=skill;
        this.numberOfMatches=numberOfMatches;
        this.runs=runs;
        this.wickets=wickets;
        this.nationality=nationality;
        this.powerRating=powerRating;
    }
    public static Player createPlayer(String detail){
     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
     String player1[]=detail.split(",");
     Player pobj = new Player();
     try{
      pobj = new Player(player1[0],sdf.parse(player1[1]),player1[2],Integer.parseInt(player1[3]),Integer.parseInt(player1[4]),Integer.parseInt(player1[5]),player1[6],Double.parseDouble(player1[7]));
     }
     catch(Exception e){System.out.println(e);}
     return pobj;
    }
 @Override
    public String toString(){
         String d="";
         try{
         d = sdfp.format(dateOfBirth);
         }catch(Exception e){System.out.println(e);}
         return  String.format("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", name,d,skill,numberOfMatches,runs,wickets,nationality,powerRating);
    }
	@Override
	public int compareTo(Player p){
	     if(this.getNumberOfMatches()==p.getNumberOfMatches())
		 return 0;
		 else if(this.getNumberOfMatches()>p.getNumberOfMatches())
		 return 1;
		 else
		 return -1;
	}
	public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setSkill(String skill){
        this.skill=skill;
    }
    public String getSkill(){
        return this.skill;
    }
    public void setNumberOfMatches(int numberOfMatches){
        this.numberOfMatches=numberOfMatches;
    }
    public int getNumberOfMatches(){
        return this.numberOfMatches;
    }
    public void setRuns(int runs){
        this.runs=runs;
    }
    public int getRuns(){
        return this.runs;
    }
    public void setWickets(int wickets){
        this.wickets=wickets;
    }
    public int getWickets(){
        return this.wickets;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public String getNationality(){
        return this.nationality;
    }
    public void setPowerRating(double powerRating){
        this.powerRating=powerRating;
    }
    public double getPowerRating(){
        return this.powerRating;
    }
}