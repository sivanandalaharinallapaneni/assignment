import java.util.*;
import java.io.*;
import java.lang.*;
class country
{   String name;
   
	List<state> countrylist = new ArrayList<state>();
	
	 void setlist(state s)
	{
		countrylist.add(s);
	}
	 List getlist()
	{
		return countrylist;
	}
}
class state
{
	String cname;
	String sname;
	void setname(String cname, String sname)
	{
		this.cname = cname;
		this.sname = sname;
	}
	String getcname()
	{
		return cname;
	}
	String getsname()
	{
		return sname;
	}
	
	
	
}
class sortcountry implements Comparator<state>
{
	public int compare(state s1, state s2)
	{
		int cnamecom = s1.getcname().compareTo(s2.getcname());
		int snamecom = s1.getsname().compareTo(s2.getsname());
		return ((snamecom==0)?cnamecom:snamecom);
	}
}
public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		country ct = new country();
		Scanner sc = new Scanner(System.in);
		String str;
for(int i=0;i<10;i++)
		{  	
			str = sc.next();
			str.replace('|',' ');
			String ar[]  = str.split(" ");
			state st = new state();
			st.setname(ar[0], ar[1]);
			ct.setlist(st);
			
		}
		
		Collections.sort(ct.countrylist, new sortcountry());
		
		for(state a : ct.countrylist)
			System.out.println(a.getcname()+" "+a.getsname());
		
		

	}
}
	