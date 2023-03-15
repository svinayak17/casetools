import java.util.Scanner;

/**
 * 
 * @author S.Vinayak
 *
 */
public class salary {

	     Scanner sc = new Scanner(System.in);
	     int basic;
	     String name;
	    /**
	     * this method is to derive the net salary of the employee 
	     * @return the net salary of the employee 
	     */
	     public double NetSal() {
	    	 System.out.println("enter the name of employee:");
	    	 name = sc.nextLine();
	    	 System.out.println("enter the basic salary:");
	    	 basic=sc.nextInt();
	    	 double da=(basic*73)/100;
	    	 double hra=(basic*10)/100;
	    	 double gs=basic+da+hra;
	    	 double it=(gs*30)/100;
	    	 double ns=gs-it;
	    	 System.out.println("Employee name = "+name);
	    	 System.out.println("Basic Salary:" +basic);
	    	 System.out.println("Net salary:" +ns);
	    	 return ns;
	    	 
	    	 }
}
