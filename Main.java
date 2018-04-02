import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
class Main{
   public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         List<String> plist = new ArrayList<String>();
         List<Player> player = new ArrayList<Player>();
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");    
	     System.out.println("Enter the number of the players:");
	     int number = Integer.parseInt(br.readLine());
		 for(int i=0;i<number;i++)
	     {
             String detail = br.readLine();
             plist.add(detail);
			 Player pob=Player.createPlayer(detail);
			 player.add(pob);
         }   
         System.out.print("Enter a type to sort:\n1.Sort by number of matches played\n2.Sort by runs scored\n3.Sort by power rating\n");
         int search_type = Integer.parseInt(br.readLine());
         if(search_type==1){
			 Collections.sort(player);
             System.out.printf("%-15s %-15s %-15s %-15s %-10s %-10s %-15s %s\n", "Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
             for(Player elem : player)
      	     System.out.println(elem);
         }
         else if(search_type==2){
             Collections.sort(player,new RunComparator());
			 System.out.printf("%-15s %-15s %-15s %-15s %-10s %-10s %-15s %s\n", "Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			 for(Player elem : player)
      	     System.out.println(elem);
         }
         else if(search_type==3){
		     Collections.sort(player,new PowerRatingComparator());
			 System.out.printf("%-15s %-15s %-15s %-15s %-10s %-10s %-15s %s\n", "Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			 for(Player elem : player)
      	     System.out.println(elem);
         }
         else
		 System.out.println("Invalid choice"); 
    }
}
