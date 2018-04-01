import java.util.*;
public class PowerRatingComparator implements Comparator<Player>{
      public int compare(Player p1,Player p2){  
       if(p1.getPowerRating()==p2.getPowerRating())   
          return 0;  
       else if(p1.getPowerRating()>p2.getPowerRating())  
          return 1;  
       else  
          return -1;  
     }
}