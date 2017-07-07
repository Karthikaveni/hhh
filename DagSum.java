# hhh
import java.util.Scanner;

public class DagSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Dag");
		int sum=0;
		String str=s.nextLine();
		char c=(char)(92);
		str=str.replace(c, ',');
		
	String[] b=str.split(','+"");
	for(int i=0;i<b.length;i++){
		int max=0;
		String[] abc=b[i].split(" ");
		for(int j=0;j<abc.length;j++){
			
			if(!(abc[j].equals("/")||abc[j].equals("")))
				{
				int v=Integer.parseInt(abc[j]);
				if(v>max)
					max=v;
				}
		}
		sum+=max;
	
	}
	s.close();
System.out.println(sum);
	}


}
