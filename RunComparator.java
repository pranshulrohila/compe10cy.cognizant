import java.util.*;
public class RunComparator implements Comparator<Player>{
      public int compare(Player p1,Player p2){  
       if(p1.getRuns()==p2.getRuns())   
          return 0;  
       else if(p1.getRuns()>p2.getRuns())  
          return 1;  
       else  
          return -1;  
     }
}